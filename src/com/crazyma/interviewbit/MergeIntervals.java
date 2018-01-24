package com.crazyma.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by david on 2018/1/10.
 * <p>
 * https://www.interviewbit.com/problems/merge-intervals/
 */
public class MergeIntervals {

    public static class Interval {
        int start;
        int end;

        public Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "[ " + start + " " + end + " ]";
        }
    }


    public static ArrayList<Interval> sampleCreator() {
        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(-10, -3));
        intervals.add(new Interval(0, 3));
        intervals.add(new Interval(5, 8));
        intervals.add(new Interval(10, 12));

        return intervals;
    }

    public void run() {
        ArrayList<Interval> intervals =
                officialMethod(sampleCreator(), new Interval(-2, -1));
        printResult(intervals);
    }

    private void printResult(ArrayList<Interval> intervals) {
        for (int i = 0; i < intervals.size(); i++)
            System.out.print(intervals.get(i) + " ");
    }

    private ArrayList<Interval> officialMethod(ArrayList<Interval> intervals, Interval newInterval) {

        if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }

        boolean isInsert = false;
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start > newInterval.start) {
                intervals.add(i, newInterval);
                isInsert = true;
                break;
            }
        }

        if (!isInsert) {
            intervals.add(newInterval);
        }

        Stack<Interval> stack = new Stack<>();
        stack.push(intervals.get(0));

        for(int i=1;i<intervals.size();i++){
            Interval topInterval = stack.peek();
            Interval indexInterval = intervals.get(i);
            if(topInterval.end >= indexInterval.start){
                Interval mergedInterval = createNewInterval(topInterval, indexInterval);
                stack.pop();
                stack.push(mergedInterval);
            }else{
                stack.push(indexInterval);
            }
        }

        ArrayList<Interval> newIntervals = new ArrayList<>();
        while(!stack.empty()) {
            newIntervals.add(stack.pop());
        }

        Collections.reverse(newIntervals);

        return newIntervals;
    }

    private Interval createNewInterval(Interval interval1, Interval interval2) {
        int max = Math.max(interval1.end, interval2.end);
        int min = Math.min(interval1.start, interval2.start);
        return new Interval(min, max);
    }

    private ArrayList<Interval> myMethod(ArrayList<Interval> intervals, Interval newInterval) {
        if (intervals == null) {
            intervals = new ArrayList<>();
        }
        if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }

        int mergeStartIndex = intervals.size();
        int mergeEndIndex = -1;
        int x = newInterval.start;
        int y = newInterval.end;

        Interval mergedInterval = new Interval();

        for (int i = 0; i < intervals.size(); i++) {
            if (x <= intervals.get(i).start) {
                mergedInterval.start = x;
                mergeStartIndex = i;
                break;
            } else if (x <= intervals.get(i).end) {
                mergedInterval.start = intervals.get(i).start;
                mergeStartIndex = i;
                break;
            }
        }
        if (mergeStartIndex == intervals.size())
            mergedInterval.start = newInterval.start;

        for (int i = 0; i < intervals.size(); i++) {
            if (y >= intervals.get(i).start) {
                mergedInterval.end = intervals.get(i).end;
                mergeEndIndex = i;
            }
            if (y >= intervals.get(i).end) {
                mergedInterval.end = y;
                mergeEndIndex = i;
            }
        }
        if (mergeEndIndex == -1) {
            mergedInterval.end = newInterval.end;
        }

        ArrayList<Interval> newIntervals = new ArrayList<>();
        for (int i = 0; i < mergeStartIndex; i++) {
            newIntervals.add(intervals.get(i));
        }
        newIntervals.add(mergedInterval);
        for (int i = mergeEndIndex + 1; i < intervals.size(); i++) {
            newIntervals.add(intervals.get(i));
        }

        return newIntervals;
    }

}

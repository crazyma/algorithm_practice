package com.crazyma.interviewbit;

import java.util.ArrayList;

/**
 * Created by david on 2018/1/10.
 *
 * https://www.interviewbit.com/problems/merge-intervals/
 */
public class MergeIntervals {

    public static class Interval {
        int start;
        int end;
        public Interval() { start = 0; end = 0; }
        public Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "[ " + start + " " + end + " ]";
        }
    }


    public static ArrayList<Interval> sampleCreator(){
        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(0,3));
        intervals.add(new Interval(5,8));
        intervals.add(new Interval(10,12));

        return intervals;
    }

    public void run(){
        ArrayList<Interval> intervals =
                myMethod(sampleCreator(), new Interval(4,7));
        printResult(intervals);
    }

    private void printResult(ArrayList<Interval> intervals){
        for(int i=0;i<intervals.size();i++)
            System.out.print(intervals.get(i) + " ");
    }

    private ArrayList<Interval> officialMethod(ArrayList<Interval> intervals, Interval newInterval){
        return null;
    }

    private ArrayList<Interval> myMethod(ArrayList<Interval> intervals, Interval newInterval) {
        if(intervals == null){
            intervals = new ArrayList<>();
        }
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }

        int mergeStartIndex = intervals.size();
        int mergeEndIndex = -1;
        int x = newInterval.start;
        int y = newInterval.end;

        Interval mergedInterval = new Interval();

        for(int i=0;i<intervals.size();i++){
            if(x <= intervals.get(i).start){
                mergedInterval.start = x;
                mergeStartIndex = i;
                break;
            }else if(x <= intervals.get(i).end){
                mergedInterval.start = intervals.get(i).start;
                mergeStartIndex = i;
                break;
            }
        }
        if(mergeStartIndex == intervals.size())
            mergedInterval.start = newInterval.start;

        for(int i=0;i<intervals.size();i++){
            if(y >= intervals.get(i).start){
                mergedInterval.end = intervals.get(i).end;
                mergeEndIndex = i;
            }
            if(y >= intervals.get(i).end){
                mergedInterval.end = y;
                mergeEndIndex = i;
            }
        }
        if(mergeEndIndex == -1){
            mergedInterval.end = newInterval.end;
        }

        ArrayList<Interval> newIntervals = new ArrayList<>();
        for(int i=0;i<mergeStartIndex;i++){
            newIntervals.add(intervals.get(i));
        }
        newIntervals.add(mergedInterval);
        for(int i=mergeEndIndex+1;i<intervals.size();i++){
            newIntervals.add(intervals.get(i));
        }

        return newIntervals;
    }

}

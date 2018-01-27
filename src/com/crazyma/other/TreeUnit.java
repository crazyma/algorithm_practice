package com.crazyma.other;

/**
 * Created by david on 2018/1/27.
 */
public class TreeUnit {

    public static class Node {

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node left, right;
        public int value;
    }

    public static class BinarySearchTree {
        private Node root;

        public Node getRoot() {
            return root;
        }

        public boolean isExist(int value) {

            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.value == value)
                    return true;
                else if (currentNode.value > value) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

            return false;
        }

        public void insert(int value) {
            if (root == null) {
                root = new Node(value);
            } else {
                Node currentNode = root;
                while (true) {
                    if (currentNode.value > value) {
                        if (currentNode.left != null) {
                            currentNode = currentNode.left;
                        } else {
                            currentNode.left = new Node(value);
                            break;
                        }
                    } else {
                        if (currentNode.right != null) {
                            currentNode = currentNode.right;
                        } else {
                            currentNode.right = new Node(value);
                            break;
                        }
                    }
                }
            }
        }

        public void delete(int value) {
            if (root != null) {

            }
        }

//        public void inOrderPrint(){
//            if(root != null){
//                Node currentNode = root;
//                Node parentNode = null;
//                while(true){
//                    if(currentNode.left != null){
//                        parentNode = currentNode;
//                        currentNode = currentNode.left
//                    }
//                }
//            }
//        }
    }

    public static class RecursiveBinarySearchTree {

        public boolean isExist(Node root, int value) {
            if (root == null)
                return false;

            if (root.value == value) {
                return true;
            } else if (root.value > value) {
                return isExist(root.left, value);
            } else {
                return isExist(root.right, value);
            }
        }

        public Node insert(Node root, int value) {
            if (root == null) {
                root = new Node(value);
            } else {
                if (root.value > value) {
                    root.left = insert(root.left, value);
                } else {
                    root.right = insert(root.right, value);
                }
            }
            return root;
        }

        public void inOrderPrint(Node root) {
            if (root != null) {
                inOrderPrint(root.left);
                System.out.print(root.value + " ");
                inOrderPrint(root.right);
            }
        }

        public void preOrderPrint(Node root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preOrderPrint(root.left);
                preOrderPrint(root.right);
            }
        }

        public void postOrderPrint(Node root) {
            if (root != null) {
                postOrderPrint(root.left);
                postOrderPrint(root.right);
                System.out.print(root.value + " ");
            }
        }

        public void delete(Node root, Node parent, int value) {
            if (root != null) {
                if (root.value == value) {

                    if(root.left == null){
                        if(parent == null){
                            root = root.right;

                        }else{

                        }
                    }else if(root.right == null){

                    }else { //  both left and right are exist

                    }


                } else if (root.value > value) {
                    delete(root.left, root, value);
                } else {
                    delete(root.right, root, value);
                }
            }
        }

    }

}

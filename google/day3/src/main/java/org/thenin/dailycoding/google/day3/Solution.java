package org.thenin.dailycoding.google.day3;

class Solution {
    static class Node {
        String val;
        Node left;
        Node right;

        Node(String val) {
            this.val = val;
        }

        Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static String serialize(Node node){
        return String.format("[%s [%s] [%s]]", node.val, node.left != null ? serialize(node.left) : "", node.right != null ? serialize(node.right) : "");
    }

    static Node deserialize(String node){

        return new Node("root");
    }

}

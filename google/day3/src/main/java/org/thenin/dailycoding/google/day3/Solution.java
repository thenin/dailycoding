package org.thenin.dailycoding.google.day3;

class Solution {
    private static final char[] separators = {'[', ']'};
    private static final String pattern = String.format("%c%%s%c%%s%c%c%%s%c%c", separators[0], separators[0], separators[1], separators[0], separators[1], separators[1]);

    static String serialize(Node node) {
        return String.format(pattern, node.val, node.left != null ? serialize(node.left) : "", node.right != null ? serialize(node.right) : "");
    }

//    I believe I am overthinking it. Will get back to it later, probably not sober.
//    TODO: Actually implement this shit
    static Node deserialize(String nodes) {
        String[] strips = split(nodes);


        return new Node("root");
    }

    static String validate(String val) throws IllegalArgumentException {
        if (!(val.charAt(0) == separators[0] && val.charAt(val.length() - 1) == separators[1]))
            throw new IllegalArgumentException(val);

        return val;
    }

    private static String[] split(String val) {
        int firstSeparator = val.indexOf(separators[0]);
        String root = val.substring(0, firstSeparator);
        String rest = strip(val.substring(firstSeparator));
        return new String[]{root, rest};
    }

    private static String strip(String val) {
        return validate(val).substring(1, val.length() - 2);
    }

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

}

package org.thenin.dailycoding.google.day4;

import java.util.Arrays;

class Solution {
//    Illegal iplementation - ignoring the requirement for "in linear time and constant space"
//    Initial array can not be sorted
//    Ahh, it would be so much easier, right?
    static int findMissingInt(int[] array) {
//        Illegal for this assignment
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= 0 && (array[i + 1] - array[i] > 1)) {
                return array[i] + 1;
            }
        }
        return array[array.length - 1] + 1;
    }

//    Create an array of size equal to the max number in the initial array
//    Unassigned values in primitive int[] are defaulted to 0
//    Ignore values less than 1 (we need positive values only)
//    Assign values to array indices, e,g, tmp[15]=15
//    First array value to be equal to 0 is out first missing positive integer
//    If none, it should be the next after the last array index, e.g. the array length
    static int findMissingIntPainfully(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] tmp = new int[calcArrayMaxLen(array)];
        for (int i : array) {
            if (i > 0)
                tmp[i]=i;
        }

        for (int i = 1; i < tmp.length-1 ; i++) {
            if (tmp[i]==0)
                    return i;
        }
        return tmp.length;
    }

//    Calculate the length on the temp array
    private static int calcArrayMaxLen(int[] array){
//      Utility function, sort can be used here
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
//      Getting the appropriate new temp array size, e,g for [0,3,-1,15] result would
//      new array indicies will be [0..15] with array.length=16
        return array[array.length-1]+1;
    }
}

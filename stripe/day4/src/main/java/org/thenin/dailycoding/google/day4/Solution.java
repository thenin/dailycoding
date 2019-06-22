package org.thenin.dailycoding.google.day4;

import java.util.Arrays;

class Solution {
    static int findMissingInt(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>=0 && (array[i+1]-array[i]>1)){
                return array[i]+1;
            }
        }
        return array[array.length-1]+1;
    }
}

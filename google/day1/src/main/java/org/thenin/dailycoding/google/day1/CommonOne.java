package org.thenin.dailycoding.google.day1;

import java.util.Arrays;

class CommonOne {
    static boolean Solution(int[] inArray, int sumResult){
        Arrays.sort(inArray);
        for (int i = 0, j=inArray.length-1; i < j; ) {
            if (inArray[i]+inArray[j] < sumResult)
                i++;
            else if (inArray[i]+inArray[j] > sumResult)
                j--;
            else if (inArray[i]+inArray[j] == sumResult)
                return true;
        }
        return false;
    }
}

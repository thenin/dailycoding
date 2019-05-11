package org.thenin.dailycoding.adds;

import java.util.Arrays;

public class addsArray {

    /*Sort the array asc, calculate sums from left and right parts */
    public static boolean checkSum(int[] values, int sum){
        Arrays.sort(values);
        for (int i=0, j=values.length-1; i<j;){
            int result = values[i]+values[j];
            if (result<sum)
                i++;
            else if (result>sum)
                j--;
            else
                return true;
        }
        return false;
    }
}

package org.thenin.dailycoding.adds;

import org.testng.log4testng.Logger;

import java.util.Arrays;

public class addsArray {

    private static Logger log = Logger.getLogger(addsArray.class);

    /**
     * @param values incoming array
     * @param sum target sum
     * @return true if any pair of numbers adds up to a sum
     * Sort the array asc, calculate sums from left and right parts
     */
    public static boolean checkSum(int[] values, int sum){
        log.debug("Start calc.......");
        Arrays.sort(values);
        boolean result = false;
        for (int i = 0, j = values.length-1; i<j;){
            int resSum = values[i]+values[j];
            log.debug(String.format("%d + %d = %d",values[i],values[j],resSum));
            if (resSum<sum)
                i++;
            else if (resSum>sum)
                j--;
            else {
                result = true;
                break;
            }
        }
        log.debug("Done calc.......");
        return result;

    }
}

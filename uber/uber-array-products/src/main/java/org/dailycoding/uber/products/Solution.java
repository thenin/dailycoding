package org.dailycoding.uber.products;

import org.testng.log4testng.Logger;

import java.util.Arrays;

/**
 * see README.md
 */
class Solution {

    private static Logger log = Logger.getLogger(Solution.class);


    /**
     * @param inArray an array of integers
     * @return an array of products element of inArray excluding the [i] element of an original array
     * Lazy implementation using division
     */
    static long[] arrayMultiplesWithDivision(long[] inArray){
        long[] result = new long[inArray.length];

        long multiple = 1;
        for (long l : inArray) multiple *= l;

        for (int i=0;i<result.length;i++){
            result[i] = multiple/inArray[i];
        }
        log.debug("Result with division"+Arrays.toString(result));
        return result;
    }

    /**
     * @param inArray an array of integers
     * @return an array of products element of inArray excluding the [i] element of an original array
     * Brootforce noob implementation
     */
    static long[] arrayMultiplesNoDivision(long[] inArray){
        long[] result = new long[inArray.length];
        for (int i=0;i<result.length;i++){
            result[i]=1;
            for (int j=0;j<inArray.length;j++){
              if (j!=i)  result[i] *= inArray[j];
            }
        }
        log.debug(Arrays.toString(result));
        return result;
    }
    /**
     * @param inArray an array of integers
     * @return an array of products element of inArray excluding the [i] element of an original array
     * O(n) implementation
     */
    static long[] arrayMultiplesNoDivisionRightWay(long[] inArray){
        long[] result = new long[inArray.length];
        long[] acc_result = new long[inArray.length];
        long[] dec_result = new long[inArray.length];
        int lastInd=inArray.length-1;

        acc_result[0]=inArray[0];
        for (int i = 1; i < inArray.length; i++) acc_result[i] = acc_result[i - 1] * inArray[i];

        dec_result[lastInd]=inArray[lastInd];
        for (int i = lastInd-1; i >= 0; i--) {
            dec_result[i] = dec_result[i + 1] * inArray[i];
        }

        result[0]=dec_result[1];
        result[result.length-1]=acc_result[lastInd-1];
        for (int i = 1; i < lastInd; i++) {
                result[i]=acc_result[i-1]*dec_result[i+1];
        }

        log.debug(Arrays.toString(result));
        return result;
    }

}

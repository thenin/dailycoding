package org.thenin.dailycoding.uber.day2;

import java.util.Arrays;

class Solutions {
    static int[] doBruteForce(int[] inArray) throws TooLazyException {
        throw new TooLazyException("too lazy to implement the brute force solution");
    }

    static int[] doWithDIvision(int[] inArray) {
        int[] result = new int[inArray.length];
        int product = 1;
        for (int i : inArray) product *= i;

        for (int i = 0; i < result.length; i++) result[i] = product / inArray[i];

        return result;
    }


    static int[] doKindaSmart(int[] inArray) {
        int[] result = new int[inArray.length];
        int last_index = inArray.length - 1;

        int[] buff_fw = new int[inArray.length];
        int[] buff_bw = new int[inArray.length];
        buff_fw[0] = inArray[0];
        buff_bw[last_index] = inArray[last_index];


        for (int i = 1; i < last_index+1; i++) {
            buff_fw[i] = buff_fw[i - 1] * inArray[i];
            buff_bw[last_index - i] = buff_bw[last_index - i + 1] * inArray[last_index - i];
        }

        result[0] = buff_bw[1];
        result[last_index] = buff_fw[last_index-1];

        for (int i = 1; i < last_index; i++)
            result[i] = buff_fw[i - 1] * buff_bw[i + 1];

        return result;
    }

    static class TooLazyException extends Exception {

        TooLazyException(String message) {
            super(message);
        }
    }

}

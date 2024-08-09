package com.github.kauajuno.algorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int c = l + (r - l) / 2;

            if(arr[c] > target){
                r = c - 1;
            }else if (arr[c] < target){
                l = c + 1;
            }else{
                return c;
            }
        }

        System.out.println("ALERT: TARGET NOT FOUND");
        return -1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd;

/**
 *
 * @author dasg
 */
public class Nearest {

    public static void main(String[] args) {
        int[] arr = {-2, 4, 3, 6, 7, 2};

        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            int abs = Math.abs(arr[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
                //same distance to zero but positive 
                closestIndex = i;
            }
        }
        System.out.println(arr[closestIndex]);
    }

}

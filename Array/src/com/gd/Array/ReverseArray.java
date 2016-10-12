/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.Array;

/**
 *
 * @author dasg
 */
public class ReverseArray {

    public static void main(String args[]) {
        int array[] = {7, 3, 5, 3, 4, 2, 7, 3, 5, 3, 5, 8, 4, 6, 4};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

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
public class FindPair {

    public static void main(String[] args) {
        // int gArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        int gArray[] = new int[50];
        int sum = 50;
        for (int i = 0; i < 50; i++) {
            gArray[i] = i;
        }
        System.out.println("***Pairs Are:");
        PrintPair(gArray, sum);

    }

    private static void PrintPair(int[] gArray, int sum) {
        for (int i = 0; i < gArray.length; i++) {
            int firstNumber = gArray[i];
            for (int j = 0; j < gArray.length; j++) {
                int secondNumber = gArray[j];
                if (firstNumber + secondNumber == sum) {
                    System.out.println("(" + firstNumber + "," + secondNumber + ")");
                }
            }

        }

    }
}

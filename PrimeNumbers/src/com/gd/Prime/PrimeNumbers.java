/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.Prime;


/**
 *
 * @author dasg
 */
public class PrimeNumbers {
   
    public static void main(String args[]) {
        PrimeNumberSequential primeNumberSequential = new PrimeNumberSequential();
        PrimeNumberForkJoin primeNumberForkJoin = new PrimeNumberForkJoin();
        PrimeNumbersParallel numbersParallel = new PrimeNumbersParallel();
        PrimeNumbersThreadedParrael primeNumbersThreadedParrael = new PrimeNumbersThreadedParrael();
        int maxPrimeTry = 9999999;
        System.out.println("Time taken with Sequential Method: " + primeNumberSequential.calculatePrimes(maxPrimeTry));
        System.out.println("Time taken with ForkJoin Method: " + primeNumberForkJoin.calculatePrimes(maxPrimeTry));
        System.out.println("Time taken with Stream : " + numbersParallel.calculatePrimes(maxPrimeTry));
        System.out.println("Time taken with Parallel Method with Stream: " + primeNumbersThreadedParrael.calculatePrimes(maxPrimeTry));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.Prime;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dasg
 */
public class PrimeNumberSequential {
    
  public Set<Integer> findPrimes(int maxPrimeTry) {
        Set<Integer> s = new HashSet<>();
        outer:
        for (int i = 2; i <= maxPrimeTry; i++) {
            int maxJ = (int) Math.sqrt(i);
            for (int j = 2; j <= maxJ; j++) {
                if (i / j * j == i) {
                    continue outer;
                }
            }
            s.add(i);
        }
        return s;
    }

    public long calculatePrimes(int maxPrimeTry) {

        long startTime = System.currentTimeMillis();

        Set<Integer> s = findPrimes(maxPrimeTry);

        long timeTaken = System.currentTimeMillis() - startTime;

       // s.stream().sorted().forEach(System.out::println);

        return timeTaken;
    }
}

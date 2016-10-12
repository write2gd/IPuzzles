/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.Prime;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author dasg
 */
public class PrimeNumbersThreadedParrael {

    public static Set<Integer> findPrimes(int maxPrimeTry) {
        return IntStream.rangeClosed(2, maxPrimeTry).parallel()
                .map(i -> IntStream.rangeClosed(2,
                                (int) (Math.sqrt(i)))
                        .filter(j -> i / j * j == i).map(j -> 0)
                        .findAny().orElse(i))
                .filter(i -> i != 0)
                .mapToObj(i -> Integer.valueOf(i))
                .collect(Collectors.toSet());
    }

    public long calculatePrimes(int maxPrimeTry) {

        long startTime = System.currentTimeMillis();

        Set<Integer> s = findPrimes(maxPrimeTry);

        long timeTaken = System.currentTimeMillis() - startTime;

        //s.stream().sorted().forEach(System.out::println);

        return timeTaken;
    }
}

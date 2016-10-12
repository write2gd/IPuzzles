/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd.Prime;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author dasg
 */
public class PrimeNumberForkJoin {

    private static int workSize;
    private static Queue<Results> resultsQueue;
    private static class Results {

    public final int minPrimeTry;
    public final int maxPrimeTry;
    public final Set resultSet;

        public Results(int minPrimeTry, int maxPrimeTry, Set resultSet) {
            this.minPrimeTry = minPrimeTry;
            this.maxPrimeTry = maxPrimeTry;
            this.resultSet = resultSet;
        }
    }

    private static class FindPrimes extends RecursiveAction {

        private final int start;
        private final int end;

        public FindPrimes(int start, int end) {
            this.start = start;
            this.end = end;
        }

        private Set<Integer> findPrimes(int minPrimeTry,
                int maxPrimeTry) {
            Set<Integer> s = new HashSet<>();
            outer:
            for (int i = minPrimeTry; i <= maxPrimeTry; i++) {
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

        protected void compute() {
            if (end - start < workSize) {
                resultsQueue.offer(new Results(start, end,
                        findPrimes(start, end)));
            } else {
                int mid = (start + end) / 2;

                invokeAll(new FindPrimes(start, mid),
                        new FindPrimes(mid + 1, end));
            }
        }
    }

    public long calculatePrimes(int maxPrimeTry ) {        
        int maxWorkDivisor = 8;
        workSize = (maxPrimeTry + 1) / maxWorkDivisor;
        ForkJoinPool pool = new ForkJoinPool();
        resultsQueue = new ConcurrentLinkedQueue<>();
        long startTime = System.currentTimeMillis();
        pool.invoke(new FindPrimes(2, maxPrimeTry));
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Number of tasks executed: "
                + resultsQueue.size());
        while (resultsQueue.size() > 0) {
            Results results = resultsQueue.poll();
            Set<Integer> s = results.resultSet;
            //s.stream().sorted().forEach(System.out::println);
        }
        return timeTaken;
    }
}

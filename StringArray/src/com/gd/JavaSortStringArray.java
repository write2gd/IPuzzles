package com.gd;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dasg
 */
public class JavaSortStringArray {

    public static void main(String[] args) {
        String[] fruits = {"bbaaaa","aaacacacac", "aaccc", "acaca", "acee"};
          char temparay[] ;   
          int i=0;
          int countarray[] = new int[fruits.length];
        for (String fruit : fruits) {            
            int count =0;
            temparay = fruits[i].toCharArray();
            for(char t:temparay){
                if(t=='a'){
                    count++;
                }
            }
            countarray[i] = count;
            i++;           
            System.out.println(count);
        }
        
    }

}

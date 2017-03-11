package com.gd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dasg
 */
public class Bombtext {
    public static void main(String[] args) {
        String input="aabbbbeeesss";
        String output=input.replaceAll("aaa", "");
        System.out.println("Output=" + output);
         input="aaaabbbbabaeeesss";
         output=input.replaceAll("aaa", "");
        System.out.println("Output=" + output);
        input="100010000101010000010100";
         output=input.replaceAll("0", "");
        System.out.println("Output=" + output);
    }
    
}

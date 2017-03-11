package com.gd;


import java.io.BufferedReader;
import java.io.InputStreamReader;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dasg
 */
public class Read {
    public static String binaryAddition(String s1, String s2) {
    if (s1 == null || s2 == null) return "";
    int first = s1.length() - 1;
    int second = s2.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (first >= 0 || second >= 0) {
        int sum = carry;
        if (first >= 0) {
            sum += s1.charAt(first) - '0';
            first--;
        }
        if (second >= 0) {
            sum += s2.charAt(second) - '0';
            second--;
        }
        carry = sum >> 1;
        sum = sum & 1;
        sb.append(sum == 0 ? '0' : '1');
    }
    if (carry > 0)
        sb.append('1');

    sb.reverse();
    return String.valueOf(sb);
}
    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  
  Read read  = new Read();
System.out.println("Enter your name");
        try {
            String name=br.readLine();
            String [] input = name.split("\\s");
            System.out.println("n1=" + input[0] + "n2=" + input[1]);
            System.out.println(read.binaryAddition(input[0],input[1]));
            String x = "00123".replaceAll("^0*", ""); // -> 12
            System.out.println("reg" +x );
        } catch (Exception e) {
        }

        

    }
    
}

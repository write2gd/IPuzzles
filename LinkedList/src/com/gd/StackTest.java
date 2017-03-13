/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd;

import java.util.Stack;

/**
 *
 * @author dasg
 */
public class StackTest {
    static Stack<Character> stack = new Stack<>();
	static boolean check(String str) {
	     for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch=='(' || ch=='['){
	         stack.push(ch); 
                }else if(stack.isEmpty()){
                    return false;
                }else if(ch ==')'){
                    if(stack.pop()!='(')
	            return false;
	        }else if(ch ==']'){
	            if(stack.pop()!='[')
	            return false;
	        }
	       }
        return stack.isEmpty();
		
	}
       public static void main(String[] args) {
          System.out.println(StackTest.check("[()]"));   // true
System.out.println(StackTest.check("(()[])")); // true
System.out.println(StackTest.check("([)]"));   // false
System.out.println(StackTest.check("(("));     // false
System.out.println(StackTest.check("[(()])")); // false

System.out.println(StackTest.check("([(([[(([]))]]))])"));   // true
System.out.println(StackTest.check("[](()()[[]])()[]([])")); // true
System.out.println(StackTest.check("([((([(([]))])))))])")); // false
System.out.println(StackTest.check("[](()()[[]])[][[([])")); // false

    
    }
}

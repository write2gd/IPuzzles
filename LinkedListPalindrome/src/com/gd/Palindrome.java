/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gd;

import com.gd.LinkedList.Node;

/**
 *
 * @author dasg
 */
public class Palindrome {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(2);
        linkedList.addNode(1);
        linkedList.printLinkedList();
        int palindromeCheck = isPalindrome(linkedList.root);
        if(palindromeCheck == 0){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
        linkedList.printLinkedList();

    }

    private static int isPalindrome(Node root) {        
        if (root == null || root.next == null) {
            return 1;
        }
        int result = root.value ;
        Node next =root;
        Node previous = root;
        Node middle = null;
        while (next != null) {
            result = next.value;
            next = next.next;            
            if(next !=null)next=next.next;
            if(next !=null)previous=previous.next;            
        }
        middle = previous;
        result = middle.value;
        reverseLinkedList(middle);
        
        result = middle.value;
        previous = root;
        result = previous.value;
        next = middle.next;
        result = next.value;
        result = 1;
        while(result ==1 && next !=null){
            if(previous.value != next.value){                
                result = 0; 
            }
            previous = previous.next;
            result = previous.value;
            next = next.next;
            result = next.value;
        }
       // reverseLinkedList(middle);
        return result;
    }
      private static Node reverseLinkedList(Node root) {
        if (root == null || root.next == null) {
            return root;
        }
        LinkedList.Node next = root.next;
        LinkedList.Node previous = root;
        previous.next = null;

        while (next != null) {
            LinkedList.Node temp = next.next;
            next.next = previous;
            previous = next;
            next = temp;
        }
        return previous;
    }
}

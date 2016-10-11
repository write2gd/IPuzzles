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
public class ReverseLinkedList {   
 public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 25; i <= 29; i++) {
            linkedList.addNode(i);
        }
        System.out.println("Linked List in Inserted Order:--");
        linkedList.printLinkedList();

        // Reverse the linked list
        LinkedList.Node root = reverseLinkedList(linkedList.root);
        linkedList.root = root;
        System.out.println("Linked List in Reverse Order:--");
        linkedList.printLinkedList();
    }

    private static LinkedList.Node reverseLinkedList(LinkedList.Node root) {
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

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
public class LinkedList {
    public Node root = null;

    public void printLinkedList() {
        Node temp = root;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void addNode(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
        }
    }

    public class Node {
        public Node(int val) {
            value = val;
            next = null;
        }

        public int value;
        public Node next;
    }
}

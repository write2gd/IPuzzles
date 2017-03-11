package com.gd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dasg
 * @param <T>
 */
public class BST<T extends Comparable<T>> {
    Node root = null;
     public void add(T val) {
        if (val == null) {
            throw new IllegalArgumentException("first argument to put() is null");
        }       
        root = put(root, val);
        
    }

    private Node put(Node node, T val) {
         if (node == null) {
            return new Node(val);
        }         
         int cmp = val.compareTo(node.value);
         if (cmp < 0) {
            node.left = put(node.left, val);
        } else if (cmp > 0) {
            node.right = put(node.right, val);
        } else {
            node.value = val;
        }
         return node;
        
    }
    public Node get(T val) {
        Node result = get(root, val);
        System.out.println("Value= "+result.value + " Left = "+result.left+" Right = "+result.right);
        return result;
    }

    private Node get(Node node, T val) {
        if (node == null) {
            return null;
        }
        int cmp = val.compareTo(node.value);
        if (cmp < 0) {
            return get(node.left, val);
        } else if (cmp > 0) {
            return get(node.right, val);
        } else {
            return node;
        }  
    }
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = 1;
        int i = 1;
        while (num > 0) {
            num = sc.nextInt();
            bst.add(num);
            i++;
        }
        System.out.println("Enter a number to Search: ");
        num = sc.nextInt();        
        bst.get(num);
        
    }
    class Node{
    Node left,right=null;
    T value;

    public Node(T value) {
        this.value = value;        
    }

        @Override
        public String toString() {
            return "Node{" + "left=" + this.left + ", right=" + this.right + ", value=" + this.value + '}';
        }
    
    
}
}


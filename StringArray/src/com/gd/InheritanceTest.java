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
public class InheritanceTest {
    public static void main(String[] args) {
        A a =new A();
        B b =new B();
        C c = new C();
        InheritanceTest i = new InheritanceTest();
        i.testprint(c);
        A[] ab = {new A(), new B(), new C()};
        ab[0].print();
        
    }
    public void testprint(A a){
        a.print();
        
    }
    
}
class A{
    void print(){
        System.out.println("from A");
    }
}
class B extends A{
    @Override
    void print(){
        System.out.println("from B");
    }
}
class C extends B{
    @Override
    void print(){
        System.out.println("from C");        
    }
}

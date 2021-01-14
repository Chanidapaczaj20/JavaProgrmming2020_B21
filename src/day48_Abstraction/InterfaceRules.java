package day48_Abstraction;

public interface InterfaceRules {

    int a = 100;// public static final by default ---> ไม่จำเป็นต้องใส่ is auto compiler

    // static {}

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);
    }

    // a = 100; by default it's final

    public default void m (){ // this default method can be place interface

    }

}
/*
Interface ---> to achieves abstract
Interface: cannot have objects
What we cna have:
    variables: public static and final by default
    methods: abstract method
            static methods
            default method
what we cannot have:
    constructor
    instance methods
    instance variables
    blocks


 */
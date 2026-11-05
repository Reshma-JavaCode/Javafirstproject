package com.streamapi.programming;

//Create a functional interface Message.
//Use a lambda expression to print "Hello Java".

//Functional interface
interface Message {
 public abstract String msg();
}

public class TestLambda01 {

 public static void main(String[] args) {

     Message m = () -> {
         return "Hello Java";
     };

     System.out.println(m.msg());
 }
}
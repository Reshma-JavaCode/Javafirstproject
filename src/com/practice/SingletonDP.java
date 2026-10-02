package com.practice;

public class SingletonDP {

    private SingletonDP() {
        // private constructor
    }

    private static final SingletonDP st = new SingletonDP();

    public static SingletonDP getData() {
        return st;
    }

    public static void main(String[] args) {

        SingletonDP obj1 = SingletonDP.getData();
        SingletonDP obj2 = SingletonDP.getData();

        // This should NOT be allowed
        SingletonDP obj3 = new SingletonDP(); // ❌ ERROR

        System.out.println(obj1 == obj2);
    }
}
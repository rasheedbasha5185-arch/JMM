package StackMemory;

public class StackDemo3 {
    public static void main(String[] args) {
        methodA();
    }

    static void methodA() {
        System.out.println("Inside methodA");
        methodB();
    }

    static void methodB() {
        System.out.println("Inside methodB");
        methodC();
    }

    static void methodC() {
        System.out.println("Inside methodC");
    }
}

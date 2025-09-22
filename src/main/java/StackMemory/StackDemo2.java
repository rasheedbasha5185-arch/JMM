package StackMemory;

public class StackDemo2 {
    public static void main(String[] args) {
        try {
            recursiveCall(1);
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow occurred!");
        }
    }

    static void recursiveCall(int count) {
        System.out.println("Recursion depth: " + count);
        recursiveCall(count + 1); // keeps adding frames to stack
    }
}

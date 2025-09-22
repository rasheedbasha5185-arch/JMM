package StackMemory;

public class StackDemo1 {
    public static void main(String[] args) {
        printNumbers(1, 5);
    }

    static void printNumbers(int start, int end) {
        if (start > end) return;
        System.out.println("Stack frame for number: " + start);
        printNumbers(start + 1, end);
    }
}

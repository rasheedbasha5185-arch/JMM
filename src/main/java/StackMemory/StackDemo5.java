package StackMemory;

public class StackDemo5 {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                recursiveCall(1);
            } catch (StackOverflowError e) {
                System.out.println(Thread.currentThread().getName() + ": Stack Overflow!");
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }

    static void recursiveCall(int count) {
        recursiveCall(count + 1);
    }
}

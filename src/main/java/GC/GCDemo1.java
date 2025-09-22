package GC;

public class GCDemo1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        for (int i = 0; i < 100000; i++) {
            String temp = new String("Object " + i);
        }

        System.out.println("Free memory before GC: " + runtime.freeMemory()/1024/1024 + " MB");
        System.gc(); // request GC
        System.out.println("Free memory after GC: " + runtime.freeMemory()/1024/1024 + " MB");
    }
}

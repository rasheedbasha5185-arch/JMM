package GC;

public class GCDemo4 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        String obj1 = new String("Object1");
        String obj2 = new String("Object2");

        System.out.println("Used memory: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");

        obj1 = null;
        obj2 = null;

        System.gc(); // reclaim memory

        System.out.println("Used memory after GC: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
    }
}

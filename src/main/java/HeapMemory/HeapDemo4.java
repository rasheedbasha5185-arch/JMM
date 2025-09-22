package HeapMemory;

public class HeapDemo4 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        String str = new String("Hello Heap");
        System.out.println("Used memory before nullifying: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");

        str = null; // eligible for GC
        System.gc();

        System.out.println("Used memory after GC: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
    }
}

package HeapMemory;

public class HeapDemo5 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        for(int i = 0; i < 5; i++) {
            int[] bigArray = new int[10_000_000]; // large allocation
            System.out.println("Used memory: " +
                    (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
        }

        System.gc();
        System.out.println("Memory after GC: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
    }
}

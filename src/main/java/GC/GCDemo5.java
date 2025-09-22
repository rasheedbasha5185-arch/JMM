package GC;

public class GCDemo5 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        for(int i = 0; i < 5; i++) {
            int[] bigArray = new int[10_000_000]; // large allocation
            System.out.println("Used memory: " +
                    (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
        }

        // Let GC automatically run
        System.out.println("Used memory after automatic GC (may run later): " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
    }
}

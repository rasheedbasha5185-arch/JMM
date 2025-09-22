package HeapMemory;

public class HeapDemo2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        for (int i = 0; i < 100000; i++) {
            String str = "Object " + i; // many small objects
        }

        System.out.println("Heap used after creating many small objects: " +
                (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
    }
}

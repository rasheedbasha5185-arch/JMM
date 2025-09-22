package HeapMemory;

public class HeapDemo1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Initial Heap (MB): " + runtime.totalMemory()/1024/1024);

        int[] arr = new int[1000000]; // allocate large array

        System.out.println("Heap after array allocation (MB): " + runtime.totalMemory()/1024/1024);
    }
}

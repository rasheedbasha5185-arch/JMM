package MemoryLog;

public class MemoryLoggingDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        for(int i = 0; i < 5; i++) {
            int[] array = new int[1_000_000]; // simulate memory usage
            System.out.println("Used memory after allocation: " +
                    (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
            Thread.sleep(2000);
        }
    }
}

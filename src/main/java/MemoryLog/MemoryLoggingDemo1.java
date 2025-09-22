package MemoryLog;

public class MemoryLoggingDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        for (int i = 0; i < 5; i++) {
            System.out.println("Total Memory: " + runtime.totalMemory()/1024/1024 + " MB");
            System.out.println("Free Memory: " + runtime.freeMemory()/1024/1024 + " MB");
            System.out.println("Used Memory: " +
                    (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB");
            System.out.println("------------------------------");
            Thread.sleep(2000);
        }
    }
}

package MemoryLog;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class MemoryLoggingDemo5 {
    public static void main(String[] args) {
        Runnable monitorTask = () -> {
            OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
            Runtime runtime = Runtime.getRuntime();

            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Used Heap: " +
                        (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " MB, CPU Load: " +
                        osBean.getProcessCpuLoad() * 100 + " %");
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }
        };

        Thread t1 = new Thread(monitorTask, "Monitor-Thread-1");
        Thread t2 = new Thread(monitorTask, "Monitor-Thread-2");

        t1.start();
        t2.start();
    }
}

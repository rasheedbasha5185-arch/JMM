package MemoryLog;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryLoggingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        for(int i = 0; i < 5; i++) {
            MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
            MemoryUsage nonHeapUsage = memoryBean.getNonHeapMemoryUsage();

            System.out.println("Heap Used: " + heapUsage.getUsed()/1024/1024 + " MB");
            System.out.println("Heap Max: " + heapUsage.getMax()/1024/1024 + " MB");
            System.out.println("Non-Heap Used: " + nonHeapUsage.getUsed()/1024/1024 + " MB");
            System.out.println("------------------------------");
            Thread.sleep(2000);
        }
    }
}

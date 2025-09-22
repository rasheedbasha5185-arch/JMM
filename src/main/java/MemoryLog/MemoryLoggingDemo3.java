package MemoryLog;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class MemoryLoggingDemo3 {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        for(int i = 0; i < 5; i++) {
            System.out.println("Process CPU Load: " + osBean.getProcessCpuLoad() * 100 + " %");
            System.out.println("System CPU Load: " + osBean.getSystemCpuLoad() * 100 + " %");
            System.out.println("Free Physical Memory: " + osBean.getFreePhysicalMemorySize()/1024/1024 + " MB");
            System.out.println("Total Physical Memory: " + osBean.getTotalPhysicalMemorySize()/1024/1024 + " MB");
            System.out.println("------------------------------");
            Thread.sleep(2000);
        }
    }
}

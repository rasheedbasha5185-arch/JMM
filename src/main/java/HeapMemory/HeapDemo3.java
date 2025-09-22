package HeapMemory;

import java.util.ArrayList;
import java.util.List;

public class HeapDemo3 {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        try {
            for (int i = 0; i < 10000; i++) {
                list.add(new byte[1024 * 1024]); // 1MB each
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught!");
        }
    }
}

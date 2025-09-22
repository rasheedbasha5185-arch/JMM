package GC;

import java.lang.ref.WeakReference;

public class GCDemo3 {
    public static void main(String[] args) {
        String str = new String("Hello WeakReference");
        WeakReference<String> weakRef = new WeakReference<>(str);

        System.out.println("Before nullifying: " + weakRef.get());
        str = null; // object eligible for GC
        System.gc();

        System.out.println("After GC: " + weakRef.get());
    }
}

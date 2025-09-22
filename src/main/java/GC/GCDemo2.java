package GC;

class DemoObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("DemoObject is being garbage collected");
    }
}

public class GCDemo2 {
    public static void main(String[] args) {
        DemoObject obj = new DemoObject();
        obj = null; // eligible for GC
        System.gc(); // request GC
        System.out.println("End of main method");
    }
}

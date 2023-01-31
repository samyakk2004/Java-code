
class A implements Runnable { // Imlpementing Runnable interface
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Apple");
            i += 1;
        }
    }
}

class B implements Runnable { // Imlpementing Runnable interface
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Banana");
            i += 1;
        }
    }
}

public class threading_using_interface {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        // Write class object in the arguments
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        // calling the start() method using Thread class object

        t1.start();
        t2.start();
    }
}
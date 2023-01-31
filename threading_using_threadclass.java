class A extends Thread { // Inheriting from thread class
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Apple");
            i += 1;
        }
    }
}

class B extends Thread { // Inheriting from thread class
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Banana");
            i += 1;
        }
    }
}

/*
 * class C extends Thread {
 * public void run() {
 * int i = 0;
 * while (i < 30) {
 * System.out.println("Mango");
 * i += 1;
 * }
 * }
 * }
 */

public class threading_using_threadclass {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        // start() method from thread class
        obj.start();
        obj2.start();

        // C obj3 = new C();
        // obj3.start();
    }
}
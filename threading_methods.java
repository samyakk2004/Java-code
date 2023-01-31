
class two extends Thread {
    public void run() {
        int i = 0;

        while (i < 30) {
            try {
                Thread.sleep(200); // sleep method
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Hii");
            i++;
        }
    }
}

class one extends Thread {
    public void run() {
        int i = 0;

        while (i < 30) {
            try {
                Thread.sleep(200); // sleep method
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}

public class threading_methods {
    public static void main(String[] args) {
        two ob1 = new two();
        one ob2 = new one();
        ob1.start();
        try {
            ob1.join(20); // join method
        } catch (Exception e) {
            System.out.println(e);
        }
        ob2.start();

    }
}
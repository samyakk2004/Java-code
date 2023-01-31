class one extends Thread { // threading by extending thread class
    @Override
    public void run() { // overriding run() method
        int i = 0;
        while (i < 10) {
            System.out.println(disp());
            System.out.println("Hii");
            i += 1;
        }
    }

    public String disp() {
        return "Juno";

    }
}

class two implements Runnable { // threading by implementing runnable interface
    @Override
    public void run() { // overriding run() method
        int i = 0;
        while (i < 10) {
            System.out.println("Hello");
            i += 1;
        }
    }

}

public class threading {
    public static void main(String[] args) {

        // thread class
        Thread ob1 = new one(); // dynamic dispatch
        // one ob1 = new one();
        ob1.start();

        // runnable interface
        two ob2 = new two();
        Thread ob3 = new Thread(ob2);
        ob3.start();
    }
}
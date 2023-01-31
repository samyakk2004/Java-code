
class two implements Runnable {
    public void run() {

    }
}

class one extends Thread {
    public one(String n) {
        super(n);
    }
}

public class threading_threadclass_constructors {
    public static void main(String[] args) {
        one ob1 = new one("Juno");
        System.out.println(ob1.getName());
        System.out.println(ob1.getId());

        System.out.println();

        Thread ob2 = new Thread();
        System.out.println(ob2.getName());
        System.out.println(ob2.getId());

        System.out.println();

        two ob3 = new two();
        Thread ob4 = new Thread(ob3, "Jason");
        System.out.println(ob4.getName());
        System.out.println(ob4.getId());
    }
}

import java.util.Scanner;

class parent {
    int x;

    public void setx(int n) {
        System.out.print("Base class X value: ");
        x = n;
    }

    public int getx() {
        return x;
    }

}

class child extends parent {

}

public class Inheritance {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputs: ");
        x = sc.nextInt();
        y = sc.nextInt();

        // Creating an object from parent class
        System.out.println("Base Class");
        parent obj = new parent();
        obj.setx(x);
        System.out.println(obj.getx());

        // Creating an object from child class
        System.out.println("\nDerived Class");
        child obj1 = new child();
        obj1.setx(y);
        System.out.println(obj1.getx());

    }
}
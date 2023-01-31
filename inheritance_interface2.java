import java.util.Scanner;

interface shape { // Interface 1
    String name = "CUBOID"; // Property of Interface

    int area();

    private void disp() { // Private method which cannot be accessed
        System.out.println("[Hello my friend....]");
    }

    default void disp2() { // Default method for interface shape (Common Method)
        disp();
        System.out.println("[This is a shape....]");
    }
}

abstract class shape2 { // abstract class
    abstract int volume();
}

// Multiple inheritance can be implemented using interfaces
class cuboid extends shape2 implements shape { // Inheriting a class and implementing an inheritance
    public int a, b, c;

    cuboid(int a, int b, int c) { // Cuboid constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int area() { // Implementing method of interface 1
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    int volume() { // Extending method of abstract class
        return a * b * c;
    }
}

public class inheritance_interface2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length, Breadth & Height :-");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        cuboid obj = new cuboid(a, b, c);
        obj.disp2();
        System.out.println("Shape: " + obj.name);
        System.out.println("Sureface Area: " + obj.area());
        System.out.println("Volume: " + obj.volume());
    }
}

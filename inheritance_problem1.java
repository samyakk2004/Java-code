import java.util.Scanner;

class rectangle {
    int a, b;

    rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return a * b;
    }
}

class cuboid extends rectangle {
    int c;

    cuboid(int a, int b, int c) {
        super(a, b);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int area() {
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    public int volume() {
        return a * b * c;
    }

}

public class inheritance_problem1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter length, breadth and height: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        cuboid obj = new cuboid(a, b, c);
        rectangle obj1 = new rectangle(a, b);
        System.out.println("Area of rectangle: " + obj1.area());
        System.out.println("Area of cuboid: " + obj.area());
        System.out.println("Volume of cuboid: " + obj.volume());

    }
}
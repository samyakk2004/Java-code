import java.util.Scanner;

// Circle
class circle {
    double r;

    public circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

// Square
class square {
    double a;

    public square(double a) {
        this.a = a;
    }

    public double area() {
        return a * a;
    }
}

// Rectangle
class rectangle {
    double a, b;

    public rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
}

// Cylinder
class cylinder extends circle {
    double h;

    public cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    @Override
    public double area() {
        return (2 * super.area()) + (2 * (super.area() / r) * h);
    }

    public double volume() {
        return super.area() * h;
    }
}

// Sphere
class sphere extends circle {
    public sphere(double r) {
        super(r);
    }

    @Override
    public double area() {
        return 4 * super.area();
    }

    public double volume() {
        return (super.area() * r) * 4 / 3;
    }
}

public class inheritance_problem3 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int ch;
        double r, a, b, h;
        System.out.println("[ENTER YOUR CHOICE....]");
        System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Cylinder\n5. Sphere");
        ch = sc.nextInt();
        System.out.println("------------------------------");
        switch (ch) {
            case 1: {
                System.out.println("[Enter your radius....]");
                System.out.print("=> ");
                r = sc.nextDouble();
                circle ob1 = new circle(r);
                System.out.println("Area of Circle: " + ob1.area());
                break;
            }

            case 2: {
                System.out.println("[Enter your side....]");
                System.out.print("=> ");
                a = sc.nextDouble();
                square ob1 = new square(a);
                System.out.println("Area of Square: " + ob1.area());
                break;
            }

            case 3: {
                System.out.println("[Enter your length and breadh....]");
                System.out.print("=> ");
                a = sc.nextDouble();
                System.out.print("=> ");
                b = sc.nextDouble();
                rectangle ob1 = new rectangle(a, b);
                System.out.println("Area of Rectangle: " + ob1.area());
                break;
            }

            case 4: {
                System.out.println("[Enter your radius and height....]");
                System.out.print("=> ");
                r = sc.nextDouble();
                System.out.print("=> ");
                h = sc.nextDouble();
                cylinder ob1 = new cylinder(r, h);
                System.out.println("Area of Cylinder: " + ob1.area());
                System.out.println("Volume of Cylinder: " + ob1.volume());
                break;
            }

            case 5: {
                System.out.println("[Enter your radius....]");
                System.out.print("=> ");
                r = sc.nextDouble();
                sphere ob1 = new sphere(r);
                System.out.println("Area of Sphere: " + ob1.area());
                System.out.println("Volume of Sphere: " + ob1.volume());
                break;
            }

            default: {
                System.out.println("[INVALID CHOICE]");
            }
        }
    }
}
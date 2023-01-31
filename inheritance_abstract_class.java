//Abstract Class (You can create an object)
abstract class shape {
    abstract float area(); // Abstract methods

    abstract float volume(); // Abstract methods

    void display() { // Not an Abstract class
        System.out.println("[This is a shape....]");
    }
}

class sphere extends shape {
    float r, ar, vol;

    sphere(float r) { // Constructer of sphere class
        this.r = r; // Using this keyword
    }

    float area() { // Implementing abstract methods
        ar = 4 * (3.14f) * (r * r);
        return ar;
    }

    float volume() { // Implementing abstract methods
        vol = (4 / 3) * (3.14f) * (r * r * r);
        return vol;
    }
}

class cylinder extends shape {
    float r, h, ar, vol;

    cylinder(float r, float h) { // Constructer of sphere class
        this.r = r; // Using this keyword
        this.h = h; // Using this keyword
    }

    float area() { // Implementing abstract methods
        ar = (2 * (3.14f) * r * h) + (2 * (3.14f) * (r * r));
        return ar;
    }

    float volume() { // Implementing abstract methods
        vol = (3.14f) * (r * r) * h;
        return vol;
    }
}

public class inheritance_abstract_class {
    public static void main(String[] args) {

        // Instantiating object for sphere
        sphere obj = new sphere(20.25f);
        obj.display();
        System.out.println("Area of Sphere: " + obj.area());
        System.out.println("Volume of Sphere: " + obj.volume());

        System.out.println("--------------------------------------");

        // Instantiating object for Cylinder
        cylinder obj1 = new cylinder(5, 2.25f);
        System.out.println("Area of Cylinder: " + obj1.area());
        System.out.println("Volume of Cylinder: " + obj1.volume());

        System.out.println("--------------------------------------");

        // Instantiating object for sphere with the base class (shape) as reference
        // Using dynamic method dispatch
        shape obj2 = new sphere(10);
        obj2.display();

    }
}

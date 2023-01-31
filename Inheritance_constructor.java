//import java.util.Scanner;

class parent {
    parent() {
        System.out.println("\nBase Constructor 1");
    }

    parent(int x) {
        System.out.println("\nOverloaded Base Constructor 2: " + x);
    }
}

class child extends parent {
    child() {
        System.out.println("\nChild Constructor 1\n");
    }

    child(int x, int y) {
        super(x);
        System.out.println("\nOverloaded Child Constructor 2: " + y);
    }

}

class child2 extends child {
    child2() {
        System.out.println("Child 2 Constructor 1");
    }

    child2(int x, int y, int z) {
        super(x, y);
        System.out.println("\nOverloaded Child2 Constructor 2: " + z);
    }
}

class Inheritance_constructor {
    public static void main(String[] args) {
        child2 obj = new child2(10, 20, 30);
    }
}
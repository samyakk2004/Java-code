interface shape { // Interface 1
    public int area();
}

interface shape2 { // Interface 2
    public int volume();
}

class cuboid implements shape, shape2 { // Implementing multiple inheritance using interfaces
    public int a, b, c;

    cuboid(int a, int b, int c) { // Cuboid constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override // Annotation
    public int area() { // Implementing method of interface 1
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    @Override
    public int volume() { // Implementing method of interface 2
        return a * b * c;
    }
}

public class inheritance_interface {
    public static void main(String[] args) {
        cuboid obj = new cuboid(10, 20, 30);
        System.out.println("\n" + obj.area());
        System.out.println(obj.volume());
    }
}

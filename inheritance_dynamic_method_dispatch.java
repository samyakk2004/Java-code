class parent {
    public void disp1() {
        System.out.println("Display 1 method of parent class");
    }

    public void disp2() {
        System.out.println("Display 2 method of parent class");
    }
}

class child extends parent {
    @Override
    // Overrided method from class parent
    public void disp1() {
        System.out.println("\nDisplay 1 method of child class (Overrided from parent class)\n");
    }

    public void disp3() {
        System.out.println("Display 3 method of child class");
    }
}

public class inheritance_dynamic_method_dispatch {
    public static void main(String[] args) {
        parent obj = new child();
        obj.disp1();
    }
}
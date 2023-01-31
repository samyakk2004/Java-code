import java.util.Scanner;

class employee {
    int id;
    String name;
    int salary;

    public void print() {
        System.out.print("\nName: " + name);
        System.out.print(" | ID: " + id);
    }

    public int salary() {
        return salary;
    }
}

class class_creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Class Creation---");

        // Instantiation of a new object under class employee
        employee obj = new employee();
        employee obj2 = new employee();

        // Setting attributes or setting properties
        obj.id = 9976;
        obj.name = "Juno";
        obj.salary = 50500;
        obj2.id = 9273;
        obj2.name = "Jason";
        obj2.salary = 22000;

        // Printing by calling a method from class employee
        obj.print();
        System.out.print(" | " + obj.salary());
        obj2.print();
        System.out.print(" | " + obj2.salary());
    }
}
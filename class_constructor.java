import java.util.Scanner;

class employee {
    private int id;
    private String name;

    // CONSTRUCTOR
    public employee(int i, String n) {
        id = i;
        name = n;
    }

    // CONSTRUCTOR OVERLOADING
    public employee() {
        id = 1010;
        name = "Jason";
    }

    // CONSTRUCTOR OVERLOADING
    public employee(String n) {
        id = 1210;
        name = n;
    }

    /*
     * public void setter(int n) {
     * id = n;
     * }
     */

    public int getter() {
        return id;
    }

    /*
     * public void setter1(String n1) {
     * name = n1;
     * }
     */

    public String getter2() {
        return name;
    }
}

public class class_constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        System.out.println("Enter name & id: ");
        name = sc.nextLine();
        id = sc.nextInt();
        employee obj = new employee(id, name);
        System.out.println("ID: " + obj.getter());
        System.out.println("Name: " + obj.getter2());
    }

}
//First java program

import java.util.Scanner;

class sq {
    private int a, b, area;

    public void setside(int x, int y) {
        a = x;
        b = y;
    }

    public int getsideA() {
        return a;
    }

    public int getsideB() {
        return b;
    }

    public void setarea(int ar) {
        if (ar == a * b) {
            area = ar;
        } else {
            System.out.println("Incorrect Area Entered");
        }
    }

    public int getarea() {
        return area;
    }

}

public class class_private_creation {
    public static void main(String args[]) {
        int a, b, ar;
        Scanner sc = new Scanner(System.in);
        sq obj = new sq();
        System.out.println("Enter the sides of a rectangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        obj.setside(a, b);
        System.out.println("Side 1: " + obj.getsideA());
        System.out.println("Side 2: " + obj.getsideB());
        System.out.println("Enter the area of the rectangle: ");
        ar = sc.nextInt();
        obj.setarea(ar);
        System.out.println("Area: " + obj.getarea());

    }
}

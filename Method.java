import java.util.Scanner;

class Method {

    // sum function
    int sum(int x, int y) {
        int s;
        s = x + y;
        return s;
    }

    // change funtion
    static void change(int[] arr) {
        arr[2] = 55;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 22, 56, 69, 90, 2 };
        int a, b, s;
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        Method obj = new Method();
        s = obj.sum(a, b);
        System.out.println("Sum: " + s);
        change(arr);
        System.out.println(arr[2]);

    }
}
import java.util.Scanner;

public class exceptions_try_catch {
    public static void main(String[] args) {
        int i, j, s;
        Scanner sc = new Scanner(System.in);
        boolean flg = true;
        while (flg) {
            i = sc.nextInt();
            j = sc.nextInt();
            try {
                s = i / j;
                System.out.println("Sum: " + s);
            } catch (Exception e) {
                System.out.print("Error: ");
                System.out.print("[" + e + "]");
            }
        }
    }
}

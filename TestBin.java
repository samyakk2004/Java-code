import java.util.Scanner;
import java.util.ArrayList;

public class TestBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ob = new ArrayList<>();
        ob = one();
        System.out.println(ob);
    }

    public static ArrayList<Integer> one() {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        return ob;
    }
}
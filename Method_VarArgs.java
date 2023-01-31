public class Method_VarArgs {

    static int sum(int x, int... arr) {
        int s = x;
        for (int i : arr) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        int a, b, c;
        a = sum(10, 50);
        b = sum(100, 20, 12);
        c = sum(5);
        System.out.println(a + " " + b + " " + c);
    }

}

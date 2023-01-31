class randclass {
    int a;

    randclass(int a) {
        this.a = a;
    }

    int getter() {
        return a;
    }

}

public class this_keyword {
    public static void main(String[] args) {
        randclass obj = new randclass(69);
        System.out.println(obj.getter());
    }
}
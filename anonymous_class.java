// anonymous class demonstration 

//@FunctionalInterface
interface test {
    void meth1();

    void meth2();
}

public class anonymous_class {
    public static void main(String[] args) {
        test ob = new test() {
            @Override
            public void meth1() {
                System.out.println("I'm Juno");
            }

            public void meth2() {
                System.out.println("Hello world!");
            }
        };
        ob.meth1();
        ob.meth2();
    }
}
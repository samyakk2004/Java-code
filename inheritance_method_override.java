class A {
    int sum(int a, int b) {
        return a + b;
    }

    int product(int a, int b) { // original method
        return a * b;
    }
}

class B extends A {
    @Override // Override annotation to indicate override
    int sum(int a, int b) { // Overrides the base class method (overrided method)
        return (a + b) * 100;
    }
}

class inheritance_method_override {
    public static void main(String[] args) {
        B obj = new B();
        A obj1 = new A();
        System.out.println("B: " + obj.product(12, 12));
        System.out.println("A: " + obj1.product(12, 12));
        System.out.println("B: " + obj.sum(12, 12)); // B has a different output since it was overrided
        System.out.println("A: " + obj1.sum(12, 12));
    }
}
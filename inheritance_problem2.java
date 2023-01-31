abstract class pen {
    abstract public void write();

    abstract public void refill();
}

class fpen extends pen {
    public void write() {
        System.out.println("[Writing....]");
    }

    public void refill() {
        System.out.println("[Refiling....]");
    }

    public void chngnib() {
        System.out.println("[Changing nib....]");
    }
}

class inheritance_problem2 {
    public static void main(String[] args) {
        pen obj = new fpen(); // Dynamic dispatch
        obj.write();
        obj.refill();
        obj.write();
        fpen obj1 = new fpen();
        obj1.chngnib();
    }
}
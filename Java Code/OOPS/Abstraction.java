abstract class A {
    abstract void print();
}

class B extends A {
    public void print() {
        System.out.println("printed");
    }
}

public class Abstraction {

    public static void main(String args[]) {
        A obj = new B();
        obj.print();
    }
}

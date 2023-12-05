
class base {
    base() {
        System.out.println("base con");
    }

    public void print() {
        System.out.println("this is base class");
    }
}

class derived extends base {
    derived() {
        System.out.println("derived con");
    }

    public void print1() {
        System.out.println("this is derived class");
    }
}

class Inheritance {

    public static void main(String args[]) {
        // derived obj = new derived();
        base obj2 = new base();

    }
}
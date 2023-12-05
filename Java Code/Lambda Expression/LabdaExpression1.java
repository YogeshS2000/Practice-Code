class LambdaExpression1 implements Printable {

    public void print() {
        System.out.println("hi");
    }

    public static void main(String args[]) {
        var obj = new LambdaExpression1();
        obj.print();
    }
}
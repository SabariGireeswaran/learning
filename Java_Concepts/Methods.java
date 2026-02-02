public class Methods {
    // static method (class-level helper)
    public static int add(int a, int b) {
        return a + b;
    }

    // instance method (works on object state)
    public int multiply(int a, int b) {
        return a * b;
    }

    // method overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("static add(2,3) = " + Methods.add(2, 3));

        Methods m = new Methods();
        System.out.println("instance multiply(3,4) = " + m.multiply(3, 4));

        System.out.println("overloaded add(1,2,3) = " + Methods.add(1, 2, 3));
    }
}
public class InterfacesAndAbstract {
    interface Shape {
        double area();
    }

    static class Circle implements Shape {
        private double r;
        public Circle(double r) { this.r = r; }
        public double area() { return Math.PI * r * r; }
    }

    abstract static class Vehicle {
        abstract void move();
    }

    static class Car extends Vehicle {
        @Override
        void move() { System.out.println("Car drives on road"); }
    }

    public static void main(String[] args) {
        Shape c = new Circle(2.0);
        System.out.println("Circle area = " + c.area());

        Vehicle v = new Car();
        v.move();
    }
}
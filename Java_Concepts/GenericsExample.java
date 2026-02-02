public class GenericsExample {
    static class Box<T> {
        private T value;
        public Box(T value) { this.value = value; }
        public T get() { return value; }
        public void set(T value) { this.value = value; }
        @Override
        public String toString() { return "Box(" + value + ")"; }
    }

    public static void main(String[] args) {
        Box<String> b1 = new Box<>("hello");
        Box<Integer> b2 = new Box<>(123);
        System.out.println(b1 + " and " + b2);
    }
}
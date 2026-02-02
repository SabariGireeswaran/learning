public class ClassesAndConstructors {
    static class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter
        public String getName() {
            return name;
        }

        // Simple method
        public void sayHi() {
            System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
        }

        @Override
        public String toString() {
            return "Person(name=" + name + ", age=" + age + ")";
        }
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        System.out.println(alice);
        alice.sayHi();
    }
}
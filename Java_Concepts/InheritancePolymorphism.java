public class InheritancePolymorphism {
    static class Animal {
        public void speak() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Dog: Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("Cat: Meow!");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog(); // upcasting
        Animal a2 = new Cat();

        a1.speak(); // Dog's speak()
        a2.speak(); // Cat's speak()

        // instanceof check
        if (a1 instanceof Dog) {
            System.out.println("a1 is a Dog");
        }
    }
}
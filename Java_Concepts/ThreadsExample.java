public class ThreadsExample {
    static class Counter implements Runnable {
        private final String name;
        public Counter(String name) { this.name = name; }
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " -> " + i);
                try { Thread.sleep(200); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Counter("A"));
        Thread t2 = new Thread(new Counter("B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads finished");
    }
}
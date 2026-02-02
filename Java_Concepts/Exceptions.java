public class Exceptions {
    static class MyCustomException extends Exception {
        public MyCustomException(String message) { super(message); }
    }

    public static int parsePositiveInt(String s) throws MyCustomException {
        try {
            int v = Integer.parseInt(s);
            if (v <= 0) throw new MyCustomException("Number must be positive");
            return v;
        } catch (NumberFormatException ex) {
            throw new MyCustomException("Not a valid integer: " + s);
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"10", "-5", "abc"};
        for (String s : inputs) {
            try {
                System.out.println("Parsed: " + parsePositiveInt(s));
            } catch (MyCustomException e) {
                System.out.println("Failed: " + e.getMessage());
            }
        }

        // finally example
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally always runs");
        }
    }
}
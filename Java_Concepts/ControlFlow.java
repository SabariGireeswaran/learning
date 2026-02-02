public class ControlFlow {
    public static void main(String[] args) {
        int n = 7;

        // if-else
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        // switch
        int day = 2;
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            default: dayName = "Unknown"; break;
        }
        System.out.println("dayName = " + dayName);

        // loops
        for (int i = 0; i < 3; i++) {
            System.out.println("for loop i=" + i);
        }

        int j = 0;
        while (j < 3) {
            System.out.println("while j=" + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while k=" + k);
            k++;
        } while (k < 1);
    }
}
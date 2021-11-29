package exceptionsAndFiles;

public class commonExceptions {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // 1. Identify the potential problem area
        // 2. Surround the problem area with try-catch

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            System.out.println(e.toString());
        }

        String[] states = {"CA", "BE", "TY", "TB"};
        for (int i = 0; i <= states.length; i++) {
            try {
                System.out.println(states[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index outside of array domain");
                System.out.println(e.toString());
            } finally {
                System.out.println("Iterating through array");
            }
        }

    }


}

package exceptionsAndFiles;

import java.util.Scanner;

public class PaymentsApp {

    public static void main(String[] args) {
        double payment = 0;
        boolean positivePayment = true;

        do {
            // 1. Ask the user for the input
            System.out.print("Please enter payment amount: ");

            // 2. Get the amount from user and test it
            Scanner in = new Scanner(System.in);

            // 3. Handle exceptions properly
            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    //throw error
                    throw new NegativePaymentException(payment);
                } else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("please enter positive");
                positivePayment = false;
            }
        } while (!positivePayment);

        // 4. Print confirmation
        System.out.println("The payment is successful");
    }

}

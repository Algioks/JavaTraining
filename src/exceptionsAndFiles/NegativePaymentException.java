package exceptionsAndFiles;

public class NegativePaymentException extends Exception {

    double payment;

    // 1. Constructor that takes the value that would throw exception
    // 2. Assign value of local class variable
    public NegativePaymentException(double payment) {
        this.payment = payment;
    }

    // 3. Override the toString() method to include the specific exception message
    public String toString() {
        return "Error: cannot take negative payment." + payment + "\n";
    }
}

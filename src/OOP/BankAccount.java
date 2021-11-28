package OOP;

public class BankAccount implements IRate {

    //Define variables

    // final >> constant (often static final)
    // static >> belongs to the CLASS not the object instance
    private static final String routingNumber = "545612";     // static variable
    String accountNumber;           // instance variables
    String accountType;             // instance variables
    String name;                    // instance variables
    double balance = 0;             // instance variables
    private String ssn;                     // instance variables

    //Constructor definitions: unique methods:
    //1. They are used to defining / setup / initialize properties of an object
    //2. Constructors are IMPLICITLY called upon INSTANTIATION
    //3. The same name as the class itself
    //4. Constructor have NO return type

    BankAccount() {
        System.out.println("New account created");
    }

    //Overloading: call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("New account: " + accountType);
    }

    BankAccount(String accountType, double initDeposit) {
        // initDeposit, accountType, Msg are all local variables
        System.out.println("New account: " + accountType);
        System.out.println("Initial deposit of: $" + initDeposit);
        String Msg = null;
        if (initDeposit < 1000) {
            Msg = "ERROR: Minimum deposit must be at least &1.000";
        } else {
            Msg = ("Thanks for your initial deposit of $" + initDeposit);
        }
        System.out.println(Msg);
        balance = initDeposit;
    }

    // GETTERS and SETTERS
    //
    //Allow the user to define the name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    //INTERFACE METHODS
    public void setRate() {
        System.out.println("SETTING RATE");
    }

    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }


    //define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount) {
        balance = balance + amount;
        showActivity("WITHDRAW");
    }

    // PRIVATE: can only ber called from within the class
    private void showActivity(String activity) {
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: $" + balance);
    }

    void checkBalance() {
        System.out.println("Balance is: " + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
        return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance + " ]";
    }

}

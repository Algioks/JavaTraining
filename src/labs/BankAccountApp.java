package labs;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("789456123", 1000);
        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(500);
        acc1.accrue();
        System.out.println(acc1.toString());

//        BankAccount acc2 = new BankAccount("123456124", 2000);
//        acc1.setName("Tom");
//        System.out.println(acc1.getName());
//
//
//        BankAccount acc3 = new BankAccount("456456125", 3000);
//        acc1.setName("Jerry");
//        System.out.println(acc1.getName());
    }
}


class BankAccount implements IInterest{
    //properties of bank account
    private static int iD = 1000; // internal ID
    private String accountNumber; // iD + random 2-digit number + first 2 of SSN
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    //constructor
    public BankAccount(String SSN, double initDeposit) {
        balance = initDeposit;
        System.out.println("New account created");
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }

    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + SSN.substring(0,2);
        System.out.println("Your account number is: " + accountNumber);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void payBill(double amount){
        balance = balance-amount;
        System.out.println("Paying bill " + amount);
        showBalance();
    }

    public void makeDeposit(double amount){
        balance = balance+amount;
        System.out.println("Making deposit " + amount);
        showBalance();
    }

    public void showBalance( ){
        System.out.println("Balance: "+ balance);
    }

    @Override
    public void accrue() {
        balance = balance*(1+rate/100);
        showBalance();
    }

    @Override
    public String toString() {
        return "[ Name: " + name + " ]\n[ Account number: " + accountNumber + " ]\n" + "[ Routing Number: "+ routingNumber + " ]\n" + "[ Balance: "+ balance + " ]";
    }
}
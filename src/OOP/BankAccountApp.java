package OOP;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        // THIS WAY OF ASSIGNING VALUES TO OBJECT IS NOT CORRECT. BETTER WAY IS TO USE ENCAPSULATION USING GETers and SETers
        //acc1.name = "Tom TOM";
        acc1.setName("Tom Tom");
        System.out.println(acc1.getName());
        acc1.setSsn("5446456456");
        System.out.println("SSN: " + acc1.getSsn());


        acc1.accountNumber = "65464564564";
        acc1.balance = 10000;
        acc1.deposit(1500);
        acc1.withdraw(2000);


        System.out.println(acc1.toString());


        /*
        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "65464564999";

        BankAccount acc3 = new BankAccount("Savings Accounts", 5000);
        acc3.accountNumber = "65464564666";
        acc3.checkBalance();



        //DEMO fr inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());*/

    }

}

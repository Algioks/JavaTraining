package dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class creditCardStatement {

    public static void main(String[] args) {

        //this method will read data from csv file
        List<String[]> transactions = new ArrayList<>();
        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\CCStatement.csv";
        String dataRow;
        double balance = 0;

        try {
            //open the file
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            //read the data as long as it's not empty
            while ((dataRow = br.toString()) != null ){

                //parse the data by commas
                String[] line = dataRow.split(",");

                //adding data to collection
                transactions.add(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        for(String[] transaction : transactions){
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.println(date + " " + type + " " + vendor + " $" +amount);

            if (type.equalsIgnoreCase("credit")){
                balance = balance + amount;
            }
            else if (type.equalsIgnoreCase("debit")){
                balance = balance - amount;
            }
            System.out.println(" " + balance + "\n");
        }

        if(balance > 0 ){
            System.out.println("balance: " + balance);
            System.out.println("Charging 10% fee of " + balance *0.10);
            System.out.println("new balance: " + balance*1.1);
        }else if(balance < 0){
            System.out.println("Thanks for overpayment");
        } else {
            System.out.println("Thanks for payment");
        }




    }

}

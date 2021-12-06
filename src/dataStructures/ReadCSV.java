package dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public static void main(String[] args) {

        //this method will read data from csv file
        List<String[]> data = new ArrayList<String[]>();
        String fileName = "C:\\Users\\PC\\Desktop\\projects\\JavaTraining\\Files\\accounts.csv";
        String dataRow;

        try {
            //open the file
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            //read the data as long as it's not empty
            while ((dataRow = br.toString()) != null ){

                //parse the data by commas
                String[] line = dataRow.split(",");

                //adding data to collection
                data.add(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String[] account : data){
            System.out.print("[ ");
            for(String field : account){
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }

}

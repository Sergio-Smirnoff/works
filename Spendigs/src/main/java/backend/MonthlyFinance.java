package backend;

import java.io.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthlyFinance {
    private File current;
    private Month month;
    private Year year;
    private ArrayList<Import> spendings = new ArrayList<>();
    public MonthlyFinance(Month month, Year year){
        String fileName = month.name() + year;
        current = new File(fileName);
        try {
            // Check if file exists
            if (current.exists()) {
                // Read file
                BufferedReader br = new BufferedReader(new FileReader(current));
                String line;
                while ((line = br.readLine()) != null) {
                    // Get each line
                    String[] arr = line.split("-");
                    spendings.add(new Import(Double.parseDouble(arr[0]),arr[2],
                            LocalDateTime.parse(arr[1]) ));
                }
                br.close();
            } else {
                // Create file
                current.createNewFile();
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

//Write the file
    // System.out.println("File created: " + file.getName());
    //FileWriter writer = new FileWriter(file);
    //writer.write("Hello, world!");
    //writer.close();

}

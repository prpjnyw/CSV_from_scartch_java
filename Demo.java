import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try{
            CSVReader csvFile = new CSVReader("/home/pui/Desktop/CSV/customers-100.csv");
            System.out.println(csvFile.numberOfRows());
            System.out.println(csvFile.numberOfField(100));
            System.out.println(csvFile.field(1,2));
        }

        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
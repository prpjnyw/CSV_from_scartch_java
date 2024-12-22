import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CSVReader {
    private String fileName ;
    private Scanner in ;
    private int nLines = 0 ;

    public CSVReader (String fileName) throws IOException
    {
        this.fileName = fileName ;
        this.in = new Scanner(new File(this.fileName));

        while(this.in.hasNextLine()) {
            this.in.nextLine();
            this.nLines++;
        }
        this.in.close();
    }

    public int numberOfRows(){
        return this.nLines ;
    }

    public int numberOfField(int  row) throws FileNotFoundException
    {
        this.in = new Scanner(new File(this.fileName));
        String tmp = "";
        for(int i=0; i < row; i++){
            this.in.nextLine();
        }
        tmp += this.in.nextLine();
        Scanner rec = new Scanner(tmp);
        rec.useDelimiter(",");
        int n = 0 ;
        while(rec.hasNext()){
            n++;
            rec.next();
        }
        this.in.close();

        return n;
    }

    public String field(int row, int column) throws FileNotFoundException
    {
        this.in = new Scanner(new File(this.fileName));
        String tmp = "";
        for(int i=0; i < row; i++){
            this.in.nextLine();
        }
        tmp += this.in.nextLine();
        Scanner rec = new Scanner(tmp);
        rec.useDelimiter(",");

        for(int i=0; i < column ; i++){
            rec.next();
        }
        return rec.next();
    }
}

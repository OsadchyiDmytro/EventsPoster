import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVParser {

    public String[] DataParser() throws IOException {
        String line = "";
        String splitBy = ",";
        String[] ivents = new String[0];
        BufferedReader br = null;
        try {
            //parsing a CSV file
            br = new BufferedReader(new FileReader("AllIvents.csv"));
            while ((line = br.readLine()) != null)   //check are we have a next line
            {
                ivents = line.split(splitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();// The printStackTrace() method in Java
            // is a tool used to handle exceptions and errors.
            // It is a method of Java’s throwable class which prints
            // the throwable along with other details like the
            // line number and class name where the exception occurred.
        } finally {
            assert br != null;
            br.close();
        }
        return ivents;
    }
}
/*I add a new class CSVParser and method DataParser*/



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVParser {
    public String[] DataParser() {
        String line = "";
        String splitBy = ",";
        String[] ivents = new String[]{};
        BufferedReader br = null;
        String fileName = "AllIvents.csv";
        String errorMassage = "Error reading a file: ";
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                return ivents = line.split(splitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(errorMassage + fileName);
        }
        return ivents;
    }
}




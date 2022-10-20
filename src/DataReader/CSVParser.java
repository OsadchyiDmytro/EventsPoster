package DataReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public static final String SPLIT_BY = ",";
    public static final String FILE_NAME = "AllIvents.csv";

    public static List<String[]> DataParser() {
        String line;
        List<String[]> readEvents = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            while ((line = br.readLine()) != null) {
                String[] allEvents = line.split(SPLIT_BY);
                readEvents.add(allEvents);
            }
        } catch (IOException e) {
            System.out.println("The specified file was not found or file is damaged: " + FILE_NAME);
        }
        return readEvents;
    }
}




package util;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;


import Model.Question;

public class CSVReaderUtil {

    public static List<Question> readQuestionsFromCSV(String csvFilePath) {
        List<Question> questions = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            String[] line;
            reader.readNext(); // Skip header
            while ((line = reader.readNext()) != null) {
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                questions.add(new Question(id, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }

}

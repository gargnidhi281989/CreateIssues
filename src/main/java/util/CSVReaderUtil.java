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
            String[] column = reader.readNext(); // Skip header
           
            while ((line = reader.readNext()) != null) {          
            	
                String module = line[0];
                String subModule = line[1];
            	String id = line[2];
                String name = line[3];
                String quesEnglish = line[4];
                String quesSpanish = line[5];
                String hintEnglish = line[6];
                String hintSpanish = line[7];
                String choiceId = line[8];
                String hintAnswerLang1 = line[9];
                String answerChoiceSpanish = line[10];
                //System.out.println("line number is :" + column[0]);
                questions.add(new Question(module,subModule,id, name,quesEnglish, quesSpanish, hintEnglish, hintSpanish,choiceId, hintAnswerLang1,answerChoiceSpanish, column));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }

}

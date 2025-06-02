package GitHubIssues.GitHubIssues;
import util.CSVReaderUtil;
import java.util.List;

import Model.Question;
import service.GitHubService;

/**
 * Hello world!
 *
 */
public class GithubIssuesUploader 
{
    public static void main( String[] args )
    {
    	String csvPath = "src/main/resources/questions.csv"; // Path to CSV file
        String token = " ";    
        String owner = " ";           
        String repo = "myTest";             // GitHub repo name

        List<Question> questions = CSVReaderUtil.readQuestionsFromCSV(csvPath);

        for (Question q : questions) {
        	GitHubService.sendIssueToGitHub(token, owner, repo, q);
        }

    }
}

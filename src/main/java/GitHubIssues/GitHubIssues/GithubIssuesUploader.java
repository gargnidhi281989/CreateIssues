package GitHubIssues.GitHubIssues;
import util.CSVReaderUtil;
import java.util.List;
import util.ConfigLoader;
import Model.Question;
import service.GitHubService;


public class GithubIssuesUploader 
{
    public static void main( String[] args )
    {
    	String csvPath = "src/main/resources/questions.csv"; // Path to CSV file
    	String token = ConfigLoader.get("token");
    	String owner = ConfigLoader.get("owner");
    	String repo = ConfigLoader.get("repo");

        List<Question> questions = CSVReaderUtil.readQuestionsFromCSV(csvPath);

        for (Question q : questions) {
        	GitHubService.sendIssueToGitHub(token, owner, repo, q);
        }

    }
}

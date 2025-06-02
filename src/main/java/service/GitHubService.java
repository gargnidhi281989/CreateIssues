package service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import Model.Question;

public class GitHubService {

	
    public static void sendIssueToGitHub(String token, String owner, String repo, Question question) {
        HttpClient client = HttpClient.newHttpClient();
        String url = "https://api.github.com/repos/" + owner + "/" + repo + "/issues";

        String jsonBody = String.format(
        	    "{\n" +
        	    "  \"title\": \"Q%d| %s\",\n" +
        	    "  \"body\": \"Auto-created from CSV\",\n" +
        	    "  \"labels\": [\"feature\"]\n" +
        	    "}", question.getQuestionID(), question.getQuestionName().replace("\"", "\\\""));


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/vnd.github+json")
                .header("Authorization", "Bearer " + token)
                .header("X-GitHub-Api-Version", "2022-11-28")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Created issue for Question ID " + question.getQuestionID() +
                    ": HTTP " + response.statusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

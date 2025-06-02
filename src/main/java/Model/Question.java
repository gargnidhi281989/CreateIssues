package Model;

 public class Question {
    private int questionID;
    private String questionName;
    private String module;
    private String subModule;

    public Question(int questionID, String questionName) {
        this.questionID = questionID;
        this.questionName = questionName;
    }

    public String getModule() {
        return module;
    }
    
    public String getSubModule() {
        return subModule;
    }
    
    public int getQuestionID() {
        return questionID;
    }

    public String getQuestionName() {
        return questionName;
    }

    @Override
    public String toString() {
        return "Question [questionID=" + questionID + ", questionName=" + questionName + "]";
    }

}
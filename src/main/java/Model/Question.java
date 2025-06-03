package Model;

 public class Question {
    private String questionID;
    private String questionName;
    private String module;
    private String subModule;
    private String quesEnglish;
    private String quesSpanish;
    private String[] column;

    public Question(String module, String subModule, String questionID, String questionName,String quesEnglish, String quesSpanish, String[] column) {
        this.questionID = questionID;
        this.questionName = questionName;
        this.module = module;
        this.subModule = subModule;
        this.quesEnglish = quesEnglish;
        this.quesSpanish = quesSpanish;
        this.column = column;
    }

    public String getDescription() {
    	String desc = String.format(
    		    "### | %s | %s |\\n | %s | %s |",
    		    column[4], column[5], quesEnglish, quesSpanish
    		);
    		return desc;
    	
    }
        
    public String getModule() {
        return module;
    }
    
    public String getSubModule() {
        return subModule;
    }
    
    public String getQuestionID() {
        return questionID;
    }

    public String getQuestionName() {
        return questionName;
    }

    @Override
    public String toString() {
        return "Question [module=" + module + ",subModule=" + subModule + ",questionID=" + questionID + ", questionName=" + questionName + "]";
    }

}
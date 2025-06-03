package Model;

 public class Question {
    private String questionID;
    private String questionName;
    private String module;
    private String subModule;
    private String quesEnglish;
    private String quesSpanish;
    private String hintEnglish;
    private String hintSpanish;
    private String choiceId;
    private String answerChoiceLang1;
    private String answerChoiceSpanish;
    private String[] column;

    public Question(String module, String subModule, String questionID, String questionName,String quesEnglish, String quesSpanish, String hintEnglish, String hintSpanish,String choiceId, String answerChoiceLang1, String answerChoiceSpanish, String[] column) {
        this.questionID = questionID;
        this.questionName = questionName;
        this.module = module;
        this.subModule = subModule;
        this.quesEnglish = quesEnglish;
        this.quesSpanish = quesSpanish;
        this.hintEnglish = hintEnglish;
        this.hintSpanish = hintSpanish;
        this.choiceId = choiceId;
        this.answerChoiceLang1 = answerChoiceLang1;
        this.answerChoiceSpanish = answerChoiceSpanish;
        this.column = column;
    }

    public String getDescription() {
        String desc = String.format(
        	    "### | %s | %s |\\n" +
        	    	    "| %s | %s |\\n" +
        	    	    "### | %s | %s |\\n" +
        	    	    "| %s | %s |\\n" +
        	    	    "### | %s | %s |\\n" +
        	    	    "| %s | %s | \\n" +
        	    	    "### | %s | %s |\\n" +
        	    	    "| %s | %s |",
        	    	    column[4], column[5],
        	    	    quesEnglish, quesSpanish,
        	    	    column[6], column[7],
        	    	    hintEnglish, hintSpanish,
        	    	    column[8], column[9],
        	    	    choiceId, answerChoiceLang1.replace("\n", "<br>"),
        	    	    column[8], column[10],
        	    	    choiceId, answerChoiceSpanish.replace("\n", "<br>")
        	    	);
        desc = desc.replace("\"", "\\\"");
       
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
package com.example.ponmithranfaq;

public class faqmodel {
    private String question,answer,description;
    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public faqmodel(String question, String answer, String description) {
        this.question = question;
        this.answer = answer;
        this.description = description;
        this.expandable=false;


    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "faqmodel{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}

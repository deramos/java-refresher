package com.kairos.java.quizapp;

public class QuestionService {
    Question[] questions = new Question[3];

    public QuestionService() {
        questions[0] = new Question(1, "Hello bye", "A", "B", "C", "D", "B");
        questions[1] = new Question(1, "Hello bye 2", "A", "B", "C", "D", "A");
        questions[2] = new Question(1, "Hello bye 3", "A", "B", "C", "D", "C");
    }

    public void displayQuestions() {
        for(Question question : questions){
            System.out.println(question.getQuestion());
        }
    }
}

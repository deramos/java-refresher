package com.kairos.java.quizapp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[3];
    String[] selections = new String[3];

    public QuestionService() {
        questions[0] = new Question(1, "Hello bye 1", "A", "B", "C", "D", "B");
        questions[1] = new Question(1, "Hello bye 2", "A", "B", "C", "D", "A");
        questions[2] = new Question(1, "Hello bye 3", "A", "B", "C", "D", "C");
    }

    public void displayQuestions() {
        int i = 0;
        for(Question question : questions) {
            System.out.println("Question No. : " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println("--- --- --- --- ---");
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());
            System.out.println("--- --- --- --- ---");
            // get user answer
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.next();
            selections[i] = selection;
            i++;
        }

        for(String s: selections){
            System.out.println(s);
        }
    }
}

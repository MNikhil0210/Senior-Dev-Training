package StructuralPatterns.BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {
    private final List<String> questions = new ArrayList<>();
    private int current = 0;
    public JavaQuestions() {
        questions.add("What is class? ");
        questions.add("What is interface? ");
        questions.add("What is abstraction? ");
    }
    @Override
    public void nextQuestion() {
        if( current <= questions.size()-1 )
            current++;
        System.out.println(current);
    }

    @Override
    public void previousQuestion() {
        if( current > 0 )
            current--;
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestions() {
        for (String question : questions) {
            System.out.println(question);
        }
    }
}

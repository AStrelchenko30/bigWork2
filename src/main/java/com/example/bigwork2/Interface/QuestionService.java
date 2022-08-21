package com.example.bigwork2.Interface;

import com.example.bigwork2.model.Question;

import java.text.CollationElementIterator;
import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}

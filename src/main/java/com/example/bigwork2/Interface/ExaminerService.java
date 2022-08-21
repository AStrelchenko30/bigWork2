package com.example.bigwork2.Interface;

import com.example.bigwork2.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}

package com.example.bigwork2.Service;

import com.example.bigwork2.Exciptions.tooMuchQuestions;
import com.example.bigwork2.Interface.ExaminerService;
import com.example.bigwork2.Interface.QuestionService;
import com.example.bigwork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> newCollection = new ArrayList<Question>();

        for (int i = 0; i < amount; i++) {
            Question newQuestion = questionService.getRandomQuestion();
            if (!newCollection.contains(newQuestion)) {
                newCollection.add(newQuestion);
            }
        }
        if (newCollection.size() <= amount) {
            return newCollection.stream().distinct().collect(Collectors.toList());
        } else {
            throw new tooMuchQuestions();
        }
    }
}

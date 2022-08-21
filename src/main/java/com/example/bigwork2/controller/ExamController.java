package com.example.bigwork2.controller;

import com.example.bigwork2.Interface.ExaminerService;
import com.example.bigwork2.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/questionsByAmount")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping
    public Collection<Question> getQuestions(int amount){
        return examinerService.getQuestions(amount);
    }
}

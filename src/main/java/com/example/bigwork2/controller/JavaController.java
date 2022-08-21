package com.example.bigwork2.controller;

import com.example.bigwork2.Interface.QuestionService;
import com.example.bigwork2.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/exam/java")
public class JavaController {

    private final QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public List<Question> addQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        service.add(question, answer);
        return new ArrayList<>(service.getAll());
    }

    @GetMapping("/remove")
    public List<Question> removeQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        Question newQuestion = new Question(question, answer);
        if (service.getAll().contains(newQuestion)) {
            service.remove(newQuestion);
            return service.getAll().stream().toList();
        }
        return service.getAll().stream().toList();
    }

    @GetMapping
    public Collection<Question> getQuestions() {
        return service.getAll();
    }
}

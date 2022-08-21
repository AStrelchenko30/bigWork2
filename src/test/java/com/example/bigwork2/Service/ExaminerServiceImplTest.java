package com.example.bigwork2.Service;

import com.example.bigwork2.Exciptions.tooMuchQuestions;
import com.example.bigwork2.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    @Test
    void getQuestions() {
        Question question1 = new Question("question1", "answer1");

        Question question2 = new Question("question2", "answer2");
        Question question3 = new Question("question3", "answer3");
        Question question4 = new Question("question4", "answer4");
        Set<Question>questions=Set.of(question1,question2,question3,question4);
        when(javaQuestionService.getRandomQuestion()).thenReturn(question1,question3,question4);
        assertThat(examinerService.getQuestions(3)).containsExactly(question4,question2,question1);
    }
}
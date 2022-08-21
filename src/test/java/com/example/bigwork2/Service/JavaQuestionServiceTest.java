package com.example.bigwork2.Service;

import com.example.bigwork2.Interface.ExaminerService;
import com.example.bigwork2.Interface.QuestionService;
import com.example.bigwork2.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    Set<Question> actualSet;
    Set<Question> expectedSet=new HashSet<>();
    Collection<Question> expected;
    Question question1;
    Question question2;
    Question question3;
    JavaQuestionService javaQuestionService=new JavaQuestionService();



    @BeforeEach
    public void setUp() {
        expectedSet.add(new Question("Какого цвета небо", "голубое"));
        actualSet = new HashSet<>();
        question1 = new Question("Какого цвета небо", "голубое");
        question2=new Question("А кто хороший мальчик?","Дружок");
        question3=new Question("Сколько людей на планете","Очень много");
        javaQuestionService.add(question1);
        javaQuestionService.add(question2);
        javaQuestionService.add(question3);
    }

    @Test
    void shouldAddByQuestionAndAnswer() {
        actualSet.add(question1);
        assertEquals(expectedSet, actualSet);
    }

    @Test
    void shouldAddByQuestionQuestion() {
        actualSet.add(question1);
        assertEquals(expectedSet, actualSet);
    }

    @Test
    void remove() {
        actualSet.add(question1);
        actualSet.remove(question1);
       expectedSet.remove(question1);
        assertEquals(expectedSet, actualSet);
    }

    @Test
    void getAll() {
        Collection<Question> actual=new ArrayList<>();
        actual.add(question1);
        actual.add(question2);
        actual.add(question3);
        assertEquals(javaQuestionService.getAll(), new HashSet<>(actual));

    }


    @Test
    void getRandomQuestion() {
        Collection<Question> actual=new ArrayList<>();
        actual.add(question3);
        assertEquals(javaQuestionService.getRandomQuestion(),actual);
    }

}

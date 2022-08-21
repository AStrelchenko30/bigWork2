package com.example.bigwork2.Service;

import com.example.bigwork2.Interface.QuestionService;
import com.example.bigwork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class JavaQuestionService implements QuestionService {

    Set<Question> questions=new HashSet<>();


    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
            return question;
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return new ArrayList<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        //int randomIndex=random.nextInt(questions.size());
        int randomIndex = random.nextInt(questions.size() - 1);
        return questions.stream().collect(Collectors.toList()).get(randomIndex);
    }
}

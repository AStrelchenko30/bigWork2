package com.example.bigwork2.Exciptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class tooMuchQuestions extends RuntimeException {
    public tooMuchQuestions() {
    }

    public tooMuchQuestions(String message) {
        super(message);
    }

    public tooMuchQuestions(String message, Throwable cause) {
        super(message, cause);
    }

    public tooMuchQuestions(Throwable cause) {
        super(cause);
    }

    public tooMuchQuestions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

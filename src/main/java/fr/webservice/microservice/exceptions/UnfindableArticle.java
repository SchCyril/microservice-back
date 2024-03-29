package fr.webservice.microservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UnfindableArticle extends RuntimeException {
    public UnfindableArticle(String s) {
        super(s);
    }
}

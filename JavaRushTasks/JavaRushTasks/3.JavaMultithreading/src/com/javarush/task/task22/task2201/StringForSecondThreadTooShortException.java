package com.javarush.task.task22.task2201;

public class StringForSecondThreadTooShortException extends RuntimeException {

    String message = "java.lang.StringIndexOutOfBoundsException: String index out of range: -1";

    public String getMessage() {
        return message;
    }


}

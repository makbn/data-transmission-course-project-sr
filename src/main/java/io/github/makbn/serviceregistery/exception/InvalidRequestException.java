package io.github.makbn.serviceregistery.exception;

public class InvalidRequestException extends Exception {

    public InvalidRequestException(String message) {
        super(message);
    }


    public static InvalidRequestException getInstance(String message) {
        return new InvalidRequestException(message);
    }
}

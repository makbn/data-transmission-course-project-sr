package io.github.makbn.serviceregistery.exception;

public class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }

    public static AccessDeniedException getInstance() {
        return new AccessDeniedException("access denied!");

    }

    public static AccessDeniedException getInstance(String msg) {
        return new AccessDeniedException(msg);

    }
}

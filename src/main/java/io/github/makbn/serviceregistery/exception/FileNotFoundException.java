package io.github.makbn.serviceregistery.exception;

import java.io.IOException;

public class FileNotFoundException extends Exception {
    public static IOException get(String s) {
        return new java.io.FileNotFoundException(s);
    }
}

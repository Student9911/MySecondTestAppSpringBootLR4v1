package ru.aurakhov.mysecondtestapspringbootlr4v1.exception;

public class UnsupportedCodeException extends Exception{
    // Конструктор с сообщением об ошибке
    public UnsupportedCodeException(String message) {
        super(message);
    }
}

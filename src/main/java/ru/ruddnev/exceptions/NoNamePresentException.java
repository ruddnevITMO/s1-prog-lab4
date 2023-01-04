package ru.ruddnev.exceptions;

public class NoNamePresentException extends Exception {
    public NoNamePresentException() {
        super("Извините, но имя обязательно для выполнения программы!");
    }
}

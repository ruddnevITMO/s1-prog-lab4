package ru.ruddnev.exceptions;

public class NoNamePresentException extends Exception {
    public NoNamePresentException() {
        super("Извините, имя обязательно для выполнения программы!");
    }
}

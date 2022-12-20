package ru.ruddnev.exceptions;

public class NoNamePresent extends Exception {
    public NoNamePresent() {
        super("Извините, имя обязательно для выполнения программы!");
    }
}

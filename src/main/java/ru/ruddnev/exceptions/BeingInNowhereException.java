package ru.ruddnev.exceptions;

public class BeingInNowhereException extends RuntimeException {
    public BeingInNowhereException(String name) {
        super("Пребывая нигде, " + name + " не смог стоять на месте.");
    }
}

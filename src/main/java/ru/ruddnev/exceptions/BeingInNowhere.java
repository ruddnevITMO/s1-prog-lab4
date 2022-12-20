package ru.ruddnev.exceptions;

public class BeingInNowhere extends RuntimeException {
    public BeingInNowhere(String name) {
        super("Пребывая нигде, " + name + " не смог стоять на месте.");
    }
}

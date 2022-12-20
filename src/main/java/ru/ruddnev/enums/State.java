package ru.ruddnev.enums;

public enum State {

    SITTING,
    ONFOOT,
    FLOATING;

    public State getUp() {
        return switch (this) {
            case SITTING -> ONFOOT;
            case ONFOOT -> FLOATING;
            default -> ONFOOT;
        };
    }
}
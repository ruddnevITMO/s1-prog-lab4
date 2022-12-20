package ru.ruddnev.objects;

public class Buffet {
    private int amountOfPlates = 17;

    public boolean takeAPlate() {
        if (amountOfPlates >= 1) {
            System.out.println("Из буфета взяли тарелку.");
            amountOfPlates -= 1;
            return true;
        } else {
            System.out.println("В буфете нет тарелок!");
            return false;
        }
    }
}

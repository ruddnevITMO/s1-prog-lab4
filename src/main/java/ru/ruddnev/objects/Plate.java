package ru.ruddnev.objects;

public class Plate {
    int amountOfPorridgeLumps;

    public Plate() {
        amountOfPorridgeLumps = 0;
    }

    public void receiveFood(int amount) {
        amountOfPorridgeLumps += amount;
        System.out.println("В тарелку положили немного каши.");
    }

    public String getAmountOfPorridge() {
        return "В тарелке сейчас " + amountOfPorridgeLumps + " комков каши";
    }

    public boolean takeLumps() {
        if (amountOfPorridgeLumps > 0) {
            amountOfPorridgeLumps -= 25;
            System.out.println("Из тарелки взяли часть каши.");
            return true;
        } else {
            System.out.println("Больше каши в тарелке нет!");
            return false;
        }
    }
}

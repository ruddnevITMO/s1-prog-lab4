package ru.ruddnev.objects;


public class Pot {
    int amountOfPorridgeLumps;
    final int amountOfStuckPorridgeLumps;


    public Pot() {
        amountOfPorridgeLumps = 75;
        amountOfStuckPorridgeLumps = 25;
    }

    public String getAmountOfPorridge() {
        return "В кастрюле сейчас " + amountOfPorridgeLumps + " комков каши";
    }
    public boolean takeLumps() {
        if (amountOfPorridgeLumps >= amountOfStuckPorridgeLumps) {
            amountOfPorridgeLumps -= 25;
            System.out.println("Из кастрюли взято немного каши");
            return true;
        } else if (amountOfPorridgeLumps > 0) {
            amountOfPorridgeLumps -= 25;
            System.out.println("Из кастрюли взято немного прилипшей к стенкам каши");
            return true;
        } else {
            System.out.println("Больше каши в кастрюле нет!");
            return false;
        }
    }


}

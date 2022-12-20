package ru.ruddnev.locations;

public class Kitchen extends Room {
    int maxSoundOverhearPercent;
    String maxSoundType;
    public Kitchen() {
    }

    public void setMaxSound(int percent, String typeOfSound) {
        this.maxSoundOverhearPercent = percent;
        this.maxSoundType = typeOfSound;

        System.out.println("Самый шумный звук на кухне - " + typeOfSound + ", он перекрывает " + percent + "% звуков на кухне!");
    }
}

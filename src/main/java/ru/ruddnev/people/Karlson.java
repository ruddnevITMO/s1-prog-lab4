package ru.ruddnev.people;
import ru.ruddnev.enums.Look;
import ru.ruddnev.interfaces.IGrabbable;
import ru.ruddnev.locations.Room;
import ru.ruddnev.interfaces.IComparableLook;


public final class Karlson extends Human implements IComparableLook, IGrabbable {

    public int bunsInPockets = (int) Math.round(Math.random() * 2) + 3; // between 3 and 5 buns

    public Karlson(String name, Room room) {
        super(name, room);
        setLook(Look.MOODY);
    }




    public void showSeriousness() {
        System.out.println(this.getName() + " всем своим видом показывал, что ему было не до смеха.");
    }

    public void smackLips() {
        System.out.println(this.getName() + " причмокивал губами");
    }

    public void eatPorridge(int amount) {
        System.out.println(this.getName() + " съел " + amount + " комков каши");
    }

    public void eatBuns(int amount) {
        bunsInPockets -= amount;
        String wayOfSaying;
        switch (amount) {
            case 2, 3, 4 -> wayOfSaying = "булочки";
            case 1 -> wayOfSaying = "булочку";
            default -> wayOfSaying = "булочек";
        }
        System.out.println(this.getName() + " за мгновение проглотил " + amount + " " + wayOfSaying);
    }

    public void pointAt(String mostNotablePicture, Look lookType) {
        String describeLook;
        switch (lookType) {
            case INTERESTED -> describeLook = "С большим интересом";
            case MOODY -> describeLook = "Потерянно";
            case HAPPY -> describeLook = "С огромной улыбкой на лице";
            default -> describeLook = "Спокойно";
        }
        System.out.println(describeLook + " ткнул пухлым пальчиком " + this.getName() + " в " + mostNotablePicture);
    }
}

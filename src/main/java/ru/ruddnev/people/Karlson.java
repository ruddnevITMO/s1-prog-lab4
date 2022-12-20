package ru.ruddnev.people;
import ru.ruddnev.enums.Look;
import ru.ruddnev.interfaces.IGrabbable;
import ru.ruddnev.locations.Room;
import ru.ruddnev.interfaces.IComparableLook;


public class Karlson extends Human implements IComparableLook, IGrabbable {

    public Karlson(String name, Room room) {
        super(name, room);
        setLook(Look.MOODY);
    }

    public void eat(int amount) {
        System.out.println(this.getName() + " съел " + amount + " комков каши");
    }


}

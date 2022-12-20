package ru.ruddnev.people;
import ru.ruddnev.locations.Room;
import ru.ruddnev.interfaces.IComparableLook;
import ru.ruddnev.enums.State;

public final class Malysh extends Human implements IComparableLook {
    public State state = State.SITTING;


    public Malysh(String name, Room room) {
        super(name, room);
    }

    public Malysh(String name, Room room, Object firstClosestThing) {
        this(name, room);
        setClosestThing(firstClosestThing);
    }


    public void setClosestThing(Object thing) {
        closestThing = thing;
    }


    public void getUpQuick() {
        this.state = state.getUp();
        System.out.println(this.getName() + " вскочил.");
    }

}

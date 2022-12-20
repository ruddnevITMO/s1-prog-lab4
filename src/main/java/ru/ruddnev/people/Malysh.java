package ru.ruddnev.people;
import ru.ruddnev.locations.Room;
import ru.ruddnev.interfaces.IComparableLook;
import ru.ruddnev.enums.State;

public class Malysh extends Human implements IComparableLook {
    public State state = State.SITTING;

    public Malysh(String name, Room room) {
        super(name, room);
    }


    public void getUpQuick() {
        this.state = state.getUp();
        System.out.println(this.getName() + " вскочил.");
    }

}

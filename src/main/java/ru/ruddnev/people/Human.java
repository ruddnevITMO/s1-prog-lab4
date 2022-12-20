package ru.ruddnev.people;

import ru.ruddnev.locations.Room;
import ru.ruddnev.enums.Look;
import ru.ruddnev.objects.Pot;
import ru.ruddnev.objects.Plate;
import java.util.Objects;

public abstract class Human {
    private String name;
    private Room room;
    private Look look;
    public Plate leftHandContains;
    public Pot rightHandContains;

    public Human() {

    }
    public Human(String name, Room room) {
        setName(name);
        setRoom(room);
    }

    public void setName(String sname) {
        this.name = sname;
    }

    public String getName() {
        return this.name;
    }

    public void setRoom(Room splace) {
        this.room = splace;
    }
    public Room getRoom() {
        return this.room;
    }

    public Look getLook() {
        return this.look;
    }

    public void setLook(Look newLook) {
        this.look = newLook;
    }

    public void leftHandGrab(Plate thing) {
        this.leftHandContains = thing;
    }
    public void rightHandGrab(Pot thing) {
        this.rightHandContains = thing;
    }

    public void say(String text) {
        System.out.println(text + " - сказал " + this.name);
    }


    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject != null && this.getClass() == otherObject.getClass()) {
            Human human = (Human)otherObject;
            return Objects.equals(this.name, human.name) && Objects.equals(this.getRoom(), human.getRoom());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.room, this.name, this.leftHandContains, this.rightHandContains, this.look);
    }

    public String toString() {
        String stringName = this.getClass().getName();
        return stringName + "[name='" + this.name + "'place='" + this.room + "']";
    }
}

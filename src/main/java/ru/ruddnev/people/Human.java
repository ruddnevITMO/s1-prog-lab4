package ru.ruddnev.people;

import ru.ruddnev.locations.Room;
import ru.ruddnev.enums.Look;
import ru.ruddnev.objects.Pot;
import ru.ruddnev.objects.Plate;
import ru.ruddnev.exceptions.BeingInNowhere;
import java.util.Objects;

public abstract class Human {
    private String name;
    private Room room;
    private Look look;
    public Plate leftHandContains;
    public Pot rightHandContains;
    public Object closestThing;


    public Human(String name, Room room) {
        setName(name);
        if (room == null) {
            throw new BeingInNowhere(name);
        }
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

    public void moveTo(Object object, Human human) {
        if (this.closestThing == object) {
            human.closestThing = object;
            this.closestThing = null;
            System.out.println(this.getName() + " придвинул " + object.getClass().getSimpleName() + " ближе к " + human.getName());
        } else {
            System.out.println(this.getName() + " попытался придвинуть " + object.getClass().getSimpleName() + " ближе к " + human.getName() + ", но она была слишком далеко");
        }
    }


    public void lookSomeWay(Human otherHuman) {
        String looksHow;
        switch (this.getLook()) {
            case MOODY -> looksHow = "угрюмо";
            case HAPPY -> looksHow = "радостно";
            default -> looksHow = "спокойно";
        }
        System.out.println(this.getName() + " " + looksHow + " глядит на " + otherHuman.getName());

    }

    public void lookNormally() {
        System.out.println(this.getName() + " поглядел");
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

    public void think(String text) {
        System.out.println("\"" + text + "\", подумал " + this.name);
    }

    public void deepThink(String text) {
        System.out.println(this.name + " обдумывает.");
        this.think(text);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        } else if (otherObject != null && this.getClass() == otherObject.getClass()) {
            return this.hashCode() == otherObject.hashCode();
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.room, this.name, this.leftHandContains, this.rightHandContains, this.look);
    }

    public String toString() {
        String stringName = this.getClass().getName();
        return stringName + "[name='" + this.name + "'place='" + this.room + "']";
    }
}

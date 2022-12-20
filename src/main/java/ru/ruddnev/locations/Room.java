package ru.ruddnev.locations;
import java.util.Objects;

public abstract class Room {
    private String name;
    public Room(String name) {
        setName(name);
    }

    public Room() {
        this("Неопознанное помещение");
    }


    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return "Комната, которая называется \"" + this.name + "\"";
    }
}

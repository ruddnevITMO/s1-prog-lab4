package ru.ruddnev;

import ru.ruddnev.locations.Kitchen;
import ru.ruddnev.objects.Buffet;
import ru.ruddnev.objects.Pot;
import ru.ruddnev.people.Karlson;
import ru.ruddnev.people.Malysh;
import ru.ruddnev.objects.Cloud;

public class Main {
    public static void main(String[] args) throws InterruptedException { // The only purpose of "throws InterruptedException" is for Thread.sleep() not to result in an error.
        Kitchen kitchen = new Kitchen();
        Buffet buffet = new Buffet();
        Karlson karlson = new Karlson( "Вентиляторный", kitchen);
        Malysh malysh = new Malysh("Молодой", kitchen);

        System.out.println(malysh.toString());

        malysh.getUpQuick();
        malysh.say(karlson.getName() + ", вот тебе тарелка, клади себе каши, сколько хочешь!");
        Cloud cloud = new Cloud();
        if (karlson.compareToCloud(karlson.getLook(), cloud)) {
            System.out.println(karlson.getName() + " был мрачный, как туча.");
        } else {
            System.out.println(karlson.getName() + " совсем не был похож на тучу.");
        }

        karlson.grabPlate(karlson, buffet);
        Pot pot = new Pot();
        karlson.grabPot(karlson, pot);

        while (pot.takeLumps()) {
            karlson.leftHandContains.receiveFood(25);
            Thread.sleep(1000);
        }

        System.out.println(karlson.leftHandContains.getAmountOfPorridge());
        System.out.println(karlson.rightHandContains.getAmountOfPorridge());

        kitchen.setMaxSound(100, "Чавканье");
        while (karlson.leftHandContains.takeLumps()) {
            karlson.eat(25);
            Thread.sleep(1000);
        }
        kitchen.setMaxSound(12, "Шум посудомойки");







    }
}
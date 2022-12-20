package ru.ruddnev;

import ru.ruddnev.exceptions.NoNamePresentException;
import ru.ruddnev.locations.Room;
import ru.ruddnev.objects.Buffet;
import ru.ruddnev.objects.Pot;
import ru.ruddnev.people.Karlson;
import ru.ruddnev.people.Malysh;
import ru.ruddnev.objects.Newspaper;
import ru.ruddnev.enums.Look;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException { // The only purpose of "throws InterruptedException" is for Thread.sleep() not to result in an error.

        // Реализация анонимного класса
        Room kitchen = new Room() {
            int maxSoundOverhearPercent;
            String maxSoundType;

            @Override
            public void setMaxSound(int percent, String typeOfSound) {
                this.maxSoundOverhearPercent = percent;
                this.maxSoundType = typeOfSound;

                System.out.println("Самый шумный звук на кухне - " + typeOfSound + ", он перекрывает " + percent + "% звуков на кухне!");
            }
        };

        Buffet buffet = new Buffet();

        System.out.print("Введите имя для Карлсона: ");
        Scanner scanner = new Scanner(System.in);
        String karlsonName = scanner.nextLine();

        try {
            if (karlsonName.isEmpty()) {
                throw new NoNamePresentException();
            }
        } catch (NoNamePresentException theException) {
            System.out.println(theException.getMessage());
            System.out.println("Но у карсона должно быть имя, поэтому нам придется назвать его Безымянным");
            karlsonName = "Безымянный";
        }

        Karlson karlson = new Karlson( karlsonName, kitchen);
        Newspaper aif = new Newspaper("Аргументы и факты", "фотографию Белого парохода");
        Malysh malysh = new Malysh("Молодой", kitchen, aif);

        karlson.lookSomeWay(malysh);
        karlson.smackLips();
        karlson.showSeriousness();

        malysh.getUpQuick();
        malysh.say(karlson.getName() + ", вот тебе тарелка, клади себе каши, сколько хочешь!");

        // реализация локального класса
        class Cloud {
            public final Look look;
            public Cloud() {
                look = Look.MOODY;
            }
            public Look getLook() {
                return look;
            }
        }


        Cloud cloud = new Cloud();
        if (karlson.compareToCloud(karlson.getLook(), cloud.getLook())) {
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
            karlson.eatPorridge(25);
            Thread.sleep(1000);
        }
        kitchen.setMaxSound(12, "Шум посудомойки");

        karlson.say("Приступим к булочкам!");
        karlson.eatBuns(2);
        malysh.deepThink("Может, правильнее всего просто дать Карлсону газету? Пусть сам все прочтет");
        while (karlson.bunsInPockets > 0) {
            karlson.eatBuns(1);
            Thread.sleep(1000);
        }

        malysh.moveTo(aif, karlson);
        karlson.lookNormally();
        karlson.pointAt(aif.mostNotablePicture, Look.INTERESTED);








    }
}
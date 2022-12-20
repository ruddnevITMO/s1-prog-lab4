package ru.ruddnev.interfaces;

import ru.ruddnev.objects.Buffet;
import ru.ruddnev.people.Human;
import ru.ruddnev.objects.Pot;
import ru.ruddnev.objects.Plate;

public interface IGrabbable {
    default void grabPlate(Human grabber, Buffet buffet) {
        if (!buffet.takeAPlate()) {
            System.out.println("В буфете не было тарелок, и Карлсон не смог поесть каши.");
            System.exit(0);
        }
        Plate plate = new Plate();
        grabber.leftHandGrab(plate);
    }

    default void grabPot(Human grabber, Pot pot) {
        grabber.rightHandGrab(pot);
    }
}

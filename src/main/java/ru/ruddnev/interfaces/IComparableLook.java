package ru.ruddnev.interfaces;

import ru.ruddnev.objects.Cloud;
import ru.ruddnev.enums.Look;

public interface IComparableLook {
    default boolean compareToCloud(Look selfLook, Cloud tucha) {
        return selfLook == tucha.look;
    }
}

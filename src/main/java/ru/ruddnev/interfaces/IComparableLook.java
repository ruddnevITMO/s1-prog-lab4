package ru.ruddnev.interfaces;

import ru.ruddnev.enums.Look;

public interface IComparableLook {
    default boolean compareToCloud(Look selfLook, Look tuchaLook) {
        return selfLook == tuchaLook;
    }
}

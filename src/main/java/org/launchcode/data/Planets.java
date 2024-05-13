package org.launchcode.data;

public enum Planets {

    //    MERCURY("Ἑρμῆς"),
//    VENUS("Ἀφροδίτη"),
//    EARTH("Γῆ"),
//    MARS("Ἄρης"),
//    JUPITER("Ζεύς"),
//    SATURN("Χρόνος"),
//    URANUS("Οὐρανός"),
//    NEPTUNE("Πωσειδῶν");
    MERCURY("Hermes", 88),
    VENUS("Aphrodite", 225),
    EARTH("Gaia", 365),
    MARS("Ares", 687),
    JUPITER("Zeus", 4333),
    SATURN("Chronos", 10759),
    URANUS("Ouranos", 30687),
    NEPTUNE("Poseidon", 60200);

    private final String name;
    private final int yearLength;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}

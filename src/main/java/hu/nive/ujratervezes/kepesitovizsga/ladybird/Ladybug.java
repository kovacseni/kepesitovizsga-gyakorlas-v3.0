package hu.nive.ujratervezes.kepesitovizsga.ladybird;

import java.util.Objects;

public class Ladybug {

    private String hungarianName;
    private String latinName;
    private String genus;
    private int numberOfPoints;

    public Ladybug(String hungarianName, String latinName, String genus, int numberOfPoints) {
        this.hungarianName = hungarianName;
        this.latinName = latinName;
        this.genus = genus;
        this.numberOfPoints = numberOfPoints;
    }

    public String getHungarianName() {
        return hungarianName;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getGenus() {
        return genus;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladybug ladybug = (Ladybug) o;
        return Objects.equals(hungarianName, ladybug.hungarianName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hungarianName);
    }
}

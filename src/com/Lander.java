package com;

import java.util.Objects;

public class Lander {
    private String name;
    private String kontinent;
    private long flache;
    private long bevolkerung;
    private String hauptstadt;

    public Lander(String name, String kontinent, long flache, long bevolkerung, String hauptstadt) {

        this.name = name;
        this.kontinent = kontinent;
        this.flache = flache;
        this.bevolkerung = bevolkerung;
        this.hauptstadt = hauptstadt;
    }

    public String getName() {
        return name;
    }

    public String getKontinent() {
        return kontinent;
    }

    public long getFlache() {
        return flache;
    }

    public long getBevolkerung() {
        return bevolkerung;
    }

    public String getHauptstadt() {
        return hauptstadt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    public void setFlache(long flache) {
        this.flache = flache;
    }

    public void setBevolkerung(long bevolkerung) {
        this.bevolkerung = bevolkerung;
    }

    public void setHauptstadt(String hauptstadt) {
        this.hauptstadt = hauptstadt;
    }

    @Override
    public String toString() {
        return "Lander{" +
                "name='" + name + '\'' +
                ", kontinent='" + kontinent + '\'' +
                ", flache=" + flache +
                ", bevolkerung=" + bevolkerung +
                ", hauptstadt='" + hauptstadt + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lander lander = (Lander) o;
        return Objects.equals(name, lander.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

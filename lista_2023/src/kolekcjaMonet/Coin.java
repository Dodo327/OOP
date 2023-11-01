package kolekcjaMonet;

import java.util.Objects;

public class Coin implements Comparable {
    private final String name;
    private final int year;
    private final int value;

    public Coin(String name, int year, int value) {
        this.name = name;
        this.year = year;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year && Objects.equals(name, coin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.value, ((Coin) o).value);
    }

}

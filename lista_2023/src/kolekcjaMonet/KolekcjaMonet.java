package kolekcjaMonet;

import java.util.*;

public class KolekcjaMonet {
    public static void main(String[] args) {
        List<Coin> coinList = new ArrayList<>();
        Coin m1 = new Coin("10 zł Chrobry Au", 1925, 1300);
        coinList.add(m1);
        coinList.add(new Coin("20 zł Chrobry Au", 1925, 2500));
        coinList.add(new Coin("5 zł Piłsudski strzelecki Ag", 1934, 300));
        coinList.add(new Coin("5 zł Piłsudski strzelecki Ag", 1934, 100));
        coinList.add(new Coin("Półtorak Koronny Z3W", 1622, 15));
        coinList.add(new Coin("Trojak Litewski Z3W", 1925, 70));
        coinList.add(new Coin("Denar WJ", 1396, 80));
        coinList.add(new Coin("Denar krzyżowy", 950, 150));

        info(coinList);

        coinList.sort(Coin::compareTo);
        System.out.println("-------------------------");

        info(coinList);

        Set<Coin> set = new HashSet<>(coinList);
        coinList.clear();
        coinList.addAll(set);
        coinList.sort(Coin::compareTo);

        info(coinList);

    }

    private static void info(List<Coin> coinList) {
        System.out.println("----------------------------------------------------------------");
        for (Coin coin : coinList) {
            System.out.print("Nazwa - " + coin.getName());
            System.out.print(", Rok - " + coin.getYear());
            System.out.println(", Wartość - " + coin.getValue());
        }
    }
}

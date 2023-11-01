package Kontrola;

import java.util.*;

public class KomputerKontrolny {
    public static void main(String[] args) {
        String[] miasta = {"Warszawa", "Berlin", "Paryż", "Londyn", "Madryt", "Rzym"};
        Map<Integer, Samolot> nrSamoloty = new HashMap<>();
        ArrayList<Samolot> samoloty = new ArrayList<>();
        int nr = 1;

        Random random = new Random();

        while (nrSamoloty.size() != 10) {
            int godzina = random.nextInt(2000, 2401);

            try {
                nrSamoloty.put(nr, new SamolotPasazerski(random.nextInt(501), random.nextInt(11),
                        miasta[random.nextInt(miasta.length)], new int[]{godzina / 100, godzina % 100}, 300,
                        random.nextInt(301)));
                nr++;
            } catch (WyjatekTransportu e) {
                System.out.println(e.getMessage());
            }
        }

        nrSamoloty.forEach((k, v) -> samoloty.add(v));

        while (!samoloty.isEmpty()) {
            ListIterator<Samolot> it = samoloty.listIterator();
            while (it.hasNext()) {
                Samolot samolot = it.next();
                samolot.iloscPaliwa -= random.nextInt(50, 201);
                try {
                    samolot.getIloscPaliwa();
                } catch (WyjatekBrakuPaliwa e) {
                    System.out.println(e.getMessage());
                    it.remove();
                }
                System.out.println(samolot);
            }
        }
    }
}

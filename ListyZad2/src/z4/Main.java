package z4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kangur> kangurs = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            kangurs.add(new Kangur(i));
        }

        for(int i = 0; i < 10; i++) {
            kangurs.get(i).skok();
        }

        Iterator<Kangur> it = kangurs.iterator();
        while (it.hasNext()) {
            it.next().skok();
        }

        HashMap<Integer, String> kangurImie = new HashMap<>();
        for (Kangur k : kangurs) {
            kangurImie.put(k.nrKangura, "Jacek");
        }

        Iterator<Integer> it2 = kangurImie.keySet().iterator();

        while (it2.hasNext()) {
            int ka = it2.next();
            System.out.println(kangurImie.get(ka));
        }
    }


}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CosTam> t1 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            t1.set(i, new CosTam());
        }

        ArrayList<ArrayList> t2 = new ArrayList<>();

        t2.set(0, t1);

    }
}

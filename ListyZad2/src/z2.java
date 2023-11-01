import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class z2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(12);
        l1.add(123);
        l1.add(1234);
        l1.add(12345);

        List<Integer> l2 = new ArrayList<>();

        Iterator<Integer> it = l1.iterator();

        while (it.hasNext()) {
            l2.add(0, it.next());
        }

        System.out.println(l1);
        System.out.println(l2);
    }
}
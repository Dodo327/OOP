package z3;

public class z3 {
    public static void main(String[] args) {
        Command c1 = new Command("abc");
        Command c2 = new Command("efg");
        Command c3 = new Command("hij");
        Command c4 = new Command("klm");
        Command c5 = new Command("nop");

        Klasa q = new Klasa();
        q.wypelnij(c1);
        q.wypelnij(c2);
        q.wypelnij(c3);
        q.wypelnij(c4);
        q.wypelnij(c5);

        for (Command c : q.q) {
            c.operation();
        }


    }
}

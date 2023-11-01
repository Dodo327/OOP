package z3;

import java.util.LinkedList;
import java.util.Queue;

public class Klasa {
    Queue<Command> q = new LinkedList<>();

    public Queue<Command> wypelnij(Command c) {
        q.add(c);
        return q;
    }
}

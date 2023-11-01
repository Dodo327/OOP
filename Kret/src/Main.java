import Whatever.Environment;
import Whatever.Gatunek;

public class Main {
    public static void main(String[] args) {
        Environment environment = new Environment(6,6,4,5, Gatunek.EUROPEA);
        environment.runMole();
    }
}
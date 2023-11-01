package grafika;

public class Main {
    public static void main(String[] args) {
        Punkt3D punkt3D_1 = new Punkt3D();
        Punkt punkt_1 = (Punkt)punkt3D_1;
        Punkt3D punkt3D_2 = (Punkt3D) punkt_1;
        System.out.println(punkt_1);
    }

}
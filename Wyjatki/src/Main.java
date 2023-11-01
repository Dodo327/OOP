import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] tab1 = new int[5];

        tab1[3] = 4;

        System.out.println("tab1[3] = " + tab1[3]);

        try {
            tab1[5] = 6;
        } catch (ArrayIndexOutOfBoundsException exception) {
            tab1[tab1.length - 1] = 6;
            System.out.println("Zmiana indexu");
            System.out.println(exception);


        } finally {
            for (int i : tab1) {
                System.out.println(i);
            }
            System.out.println("git");
        }

        int a = 100;
        int b;

//        try {
//            System.out.print("Podaj liczbę: ");
//            b = scanner.nextInt();
//
//            if (b == 0) {
//                throw new WyjatekDzieleniaPrzezZero("Dzielenie przez zero");
//            }
//            System.out.println("100 / " + b + " = " + 100 / b);
//
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        } catch (WyjatekDzieleniaPrzezZero e) {
//           System.out.println("Dzielenie przez 0 niemożliwe.");
//            System.out.println(e.getMessage());
//        }

        System.out.print("Podaj dzielnik: ");
        b = scanner.nextInt();
        System.out.print("Podaj dzielną: ");
        int c = scanner.nextInt();
        int d;
        try {
            d = dzielenie(b, c);
        } catch (WyjatekDzieleniaPrzezZero e) {
            e.printStackTrace();
        }
    }


    private static int dzielenie(int a, int b) throws WyjatekDzieleniaPrzezZero{
        if (b == 0){
            throw new WyjatekDzieleniaPrzezZero();
        }
        return a/b;
    }
}

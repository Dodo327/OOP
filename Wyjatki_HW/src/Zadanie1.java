public class Zadanie1 {
    public static void main(String[] args) {
        Integer x = null;
        int liczba;
        try {
            liczba = 10 / 0;
            x = liczba;
        } catch (ArithmeticException e) {
            System.out.println("Nieprawidłowa operacja arytmetyczna");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("Brak danych");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Błąd ogólny");
            System.out.println(e);
        } finally {
            System.out.println("Finally 1.");
        }

        try {
            x.toString();
        } catch (ArithmeticException e) {
            System.out.println("Nieprawidłowa operacja arytmetyczna");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("Brak danych");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Błąd ogólny");
            System.out.println(e);
        } finally {
            System.out.println("Finally 2.");
        }
    }
}

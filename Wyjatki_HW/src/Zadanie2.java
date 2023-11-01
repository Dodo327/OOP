public class Zadanie2 {
    public static void main(String[] args) {
        int[] lista = new int[4];

        try {
            System.out.println(lista[5]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Za duży indeks.");
        }

        TestowaKlasa test = new TestowaKlasa(1,0);
        try {
            System.out.println(test.test());
        } catch (SuperWyjatek e){
            System.out.println(e.wiadomosc);
        }

        try {
            test.x = 1;
            test.test2();
        } catch (SuperWyjatek e){
            System.out.println("Złapany");
        }

        test.f();


        A c = new C();
        c.test();
    }
}

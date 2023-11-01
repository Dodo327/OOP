package mini;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista1 = new List<>();

        info(lista1);

        lista1.pushFront(123);

        info(lista1);

        lista1.pushFront(456);
        lista1.pushFront(789);

        info(lista1);

        System.out.println(lista1.find(123));

        lista1.insertBefore(123,666);

        info(lista1);

        lista1.insertAfter(123, 222);
        lista1.insertAfter(123,2137);

        info(lista1);


    }

    private static <T> void info(List<T> lista1) {
        System.out.println("Czy pusta - " + lista1.isEmpty());
        System.out.println("Ilosc elementow - " + lista1.size());
        if (lista1.isEmpty()) {
            System.out.println("Lista pusta.");
        } else System.out.println("Pierwszy element - " + lista1.first());
        System.out.println(lista1);
    }
}

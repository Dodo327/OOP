public class SuperWyjatek extends Exception{
    String wiadomosc;

    public SuperWyjatek() {
    }
    public SuperWyjatek(String string) {
        wiadomosc = string;
    }

    public void wyswietlWiadomosc(){
        System.out.println(wiadomosc);
    }
}

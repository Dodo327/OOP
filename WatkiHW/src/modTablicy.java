public class modTablicy implements Runnable{
    int mojaLiczba;
    int mojSen;
    static int[] lista = new int[20];


    public modTablicy(int mojaLiczba, int mojSen) {
        this.mojaLiczba = mojaLiczba;
        this.mojSen = mojSen;
    }

    @Override
    public void run() {
        int min = 100;
        int ind = 0;

        for (int i = 0; i < lista.length; i++) {
            int x = lista[i];
            if (x < min){
                min = x;
                ind = i;
            }
        }
        if (min >= mojaLiczba){
            try {
                throw new InterruptedException();
            } catch (InterruptedException ignored) {}
        }
        lista[ind] = mojaLiczba;
        wypisz();
        try {
            Thread.sleep(mojSen * 1000);
        } catch (InterruptedException ignored) {}
    }

    public void wypisz(){
        for (int x: lista) {
            System.out.printf(x + " ");
        }System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread w1 = new Thread(new modTablicy(20,3));
        Thread w2 = new Thread(new modTablicy(11,1));
        Thread w3 = new Thread(new modTablicy(30,1));
        Thread w4 = new Thread(new modTablicy(15,4));

        w1.start();
        w1.join();
        w2.start();
        w2.join();
        w3.start();
        w3.join();
        w4.start();
        w4.join();
    }
}

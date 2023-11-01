public class Watek1 extends Thread{
    String msg;
    int counter = 0;
    int k;

    public Watek1(String msg, int k) {
        this.msg = msg;
        this.k = k;
    }

    @Override
    public void run() {
        while(counter != k) {
            System.out.println(msg);
            counter++;
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Watek1 w1 = new Watek1("Ala ma kota", 20);
        Watek1 w2 = new Watek1("xyzxyzxyzxyzxyzxyzxyzxyz", 10);
        Watek1 w3 = new Watek1("…………………………………..", 30);

        w1.start();
        w1.join();
        w2.start();
        w2.join();
        w3.start();
        w3.join();
    }

}



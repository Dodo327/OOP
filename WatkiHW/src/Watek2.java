public class Watek2 extends Thread{
    private String msg;
    private int p, k;
    private int counter = 0;

    public Watek2(String msg, int p, int k){
        this.msg = msg;
        this.p = p * 1000;
        this.k = k;
    }

    @Override
    public void run() {


        try {
            while (k != counter) {
                System.out.println(msg);
                counter++;

            }
            Thread.sleep(p);
        }catch(InterruptedException ignored){}
    }


    public static void main(String[] args) throws InterruptedException {
        Watek2 w1 = new Watek2("Ala ma kota.", 2, 20);
        Watek2 w2 = new Watek2("xyzxyzxyzxyzxyzxyzxyzxyz", 3, 10);
        Watek2 w3 = new Watek2("...................", 1, 30);

        w1.start();
        w1.join();
        w2.start();
        w2.join();
        w3.start();
        w3.join();
    }

}

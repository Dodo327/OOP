public class Watek3 implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("Jestem daemonem!!!");
        }
    }

    public static void main(String[] args) {
        Thread w1 = new Thread(new Watek3());
        w1.setDaemon(true);
        w1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Funckja main");
        }
    }
}



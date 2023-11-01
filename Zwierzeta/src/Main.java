abstract class Zwierz{

    protected abstract void dajGlos();
    @Override
    public String toString(){
        return "To jest zwierzę";
    }
}

interface Latajace{
    int SKRZYDLA = 2;
    public void lec();
}

class Kot extends Zwierz{

    @Override
    protected void dajGlos(){
        System.out.println("Miau");
    }

    @Override
    public String toString(){
        return "To jest kot";
    }
}

class Pies extends Zwierz{

    @Override
    protected void dajGlos(){
        System.out.println("Hau");
    }

    @Override
    public String toString(){
        return "To jest pies";
    }
}

class Sokol extends Zwierz implements Latajace{

    @Override
    protected void dajGlos(){
        System.out.println("Kra");
    }

    @Override
    public void lec(){
        //TODO
    }
}

public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();
        System.out.println(kot);
        System.out.println(pies);
    }


}
package Pociag;

public class Lokomotywa implements Ruch{
    int licznik = 1;
    @Override
    public void go() throws RozjebanaLokomotywa{
        if (licznik % 20 == 0){
            throw new RozjebanaLokomotywa();
        }
        licznik++;

    }

    @Override
    public void stop() {

    }
}

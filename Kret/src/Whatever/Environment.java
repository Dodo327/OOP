package Whatever;

import java.util.Random;

public class Environment {
    public ObiektyZiemne[][] environment;
    final private int wartoscOdD = 3;
    MoleMotion kret;

    Environment(int m, int n, int numL, int numD) {
        environment = new ObiektyZiemne[m][n];
        Random random = new Random();
        int x, y;

        for (int i = 0; i < numL; i++) {
            while (true) {
                x = random.nextInt(0, m);
                y = random.nextInt(0, n);
                if (environment[x][y] == null) {
                    environment[x][y] = new Larwa(random.nextInt(3, 5));
                    break;
                }
            }
        }
        for (int i = 0; i < numD; i++) {
            while (true) {
                x = random.nextInt(0, m);
                y = random.nextInt(0, n);
                if (environment[x][y] == null) {
                    environment[x][y] = new Dzdzownica(wartoscOdD);
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (environment[i][j] == null) {
                    environment[i][j] = new Gleba(0);
                }
            }
        }
    }

    public Environment(int m, int n, int numL, int numD, Gatunek gatunekKreta) {
        environment = new ObiektyZiemne[m][n];
        Random random = new Random();
        int x, y;

        for (int i = 0; i < numL; i++) {
            while (true) {
                x = random.nextInt(0, m);
                y = random.nextInt(0, n);
                if (environment[x][y] == null) {
                    environment[x][y] = new Larwa(random.nextInt(3, 5));
                    break;
                }
            }
        }
        for (int i = 0; i < numD; i++) {
            while (true) {
                x = random.nextInt(0, m);
                y = random.nextInt(0, n);
                if (environment[x][y] == null) {
                    environment[x][y] = new Dzdzownica(wartoscOdD);
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (environment[i][j] == null) {
                    environment[i][j] = new Gleba(0);
                }
            }
        }

        this.kret = new Kret(gatunekKreta, environment);
    }

    public void runMole(){
        for (int i = 0; i < 10; i++){
            kret.goMole();
            getEnvironment();
        }
    }

    public void getEnvironment() {
        StringBuilder tablica = new StringBuilder();
        for (ObiektyZiemne[] obiekty : environment) {
            for (int j = 0; j < environment[0].length; j++) {
                if (obiekty[j] instanceof Gleba) {
                    tablica.append('#');
                }
                if (obiekty[j] instanceof Dzdzownica) {
                    tablica.append("{}");
                }
                if (obiekty[j] instanceof Larwa) {
                    tablica.append("@");
                }
                if (obiekty[j] == null) {
                    tablica.append(" ");
                }
            }
            tablica.append('\n');
        }
        System.out.println(tablica);
    }
}

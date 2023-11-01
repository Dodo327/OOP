public class TestowaKlasa {
    int x;
    int y;

    public TestowaKlasa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int test() throws SuperWyjatek {
        if (y == 0){
            throw new SuperWyjatek("Źle");
        }
        return x/y;
    }

    public void test2() throws SuperWyjatek2, SuperWyjatek3, SuperWyjatek4 {
        if (x == 0){
            throw new SuperWyjatek2();
        } else if (x == 1) {
            throw new SuperWyjatek3();
        } else {
            throw new SuperWyjatek4();
        }
    }

    public void f() {
        try{
            g();
        } catch (Exception e){
            System.out.println("Coś");
        }
    }

    public void g() throws SuperWyjatek4{
        throw new SuperWyjatek4();
    }
}

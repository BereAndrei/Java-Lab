package lab4;

public class Rectangle extends Patrat{
    private int latura2;

    public Rectangle(int latura1, int latura2) {
        super(latura1);
        this.latura2 = latura2;
    }

    public int calculArie(){
        return this.getLatura1() * this.latura2;
    }

    public int calculPerimetru(){
        return this.getLatura1()*2 + latura2*2;

    }

    public int getLatura2() {
        return latura2;
    }

    public void setLatura2(int latura2) {
        this.latura2 = latura2;
    }
}

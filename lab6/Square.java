package lab6;

public class Square extends Shape implements Exemplu{
    public Square(Integer l) {
        super(l);
    }

    @Override
    public Double area() {
        return (double) (l * l);
    }

    @Override
    public Integer perimeter() {
        return 4 * l;
    }

    @Override
    public void methodExemplu() {

    }
}

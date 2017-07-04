package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}

package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class Circles {

    public double getAreaPub(){
        Circle c = new Circle();
        return c.area();
    }

    public void getAreaDef(){
        Circle c = new Circle();
        c.fillColour();
        c.fillColour(2);
        c.fillColour(3.5f);
    }
}

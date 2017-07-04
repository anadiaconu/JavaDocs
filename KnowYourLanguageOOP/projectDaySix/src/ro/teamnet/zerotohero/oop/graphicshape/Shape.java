package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class Shape extends AbstractShape implements ShapeBehaviour {
    protected int color;
    protected float saturation;

    public double area(){
        return 0;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }
}

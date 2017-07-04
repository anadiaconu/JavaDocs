package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class Circle extends Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle() {
        this.xPos = 2;
        this.yPos = 3;
        this.radius = 2;
    }

    public Circle(int xPos) {
        this.xPos = xPos;
        this.yPos = 3;
        this.radius = 2;
    }

    public Circle(int yPos, int xPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = 2;
    }

    public Circle(int yPos, int xPos, int radius) {
        this.xPos = yPos;
        this.yPos = xPos;
        this.radius = radius;
    }

    @Override
    public double area() {
        return java.lang.Math.PI*radius*radius ;
    }

    @Override
    public String toString() {
        return "Center = (" +
                 xPos +
                ", " + yPos +
                ") and radius = " + radius;
    }

    public void fillColour(){
        System.out.println(super.color);
    }
    public void fillColour(int color){
        super.setColor(color);
        System.out.println("The circle colour is now "+ color+"!");
    }
    public void fillColour(float saturation){
        super.setSaturation(saturation);
        System.out.println("The circle saturation is now " + saturation+"!");
    }
}

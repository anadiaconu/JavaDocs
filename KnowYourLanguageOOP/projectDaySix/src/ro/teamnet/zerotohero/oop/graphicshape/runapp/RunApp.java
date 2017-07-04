package ro.teamnet.zerotohero.oop.graphicshape.runapp;

import ro.teamnet.zerotohero.oop.graphicshape.*;
import ro.teamnet.zerotohero.oop.graphicshape.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.exceptions.MyException;

import java.util.Scanner;
/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class RunApp {
    public static void main(String[] args) {
        Circles c = new Circles();
        System.out.println("The default circle area is " + c.getAreaPub());
        c.getAreaDef();
        Canvas can = new Canvas();
        can.paint();
        Shape s = new Circle(10);
        ShapeBehaviour sb = new Square(10);
        System.out.println("Square area is: "+sb.area());
        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));


        MyException me = new MyException();
        me.getSomeText();



    }
}

package ro.teamnet.zerotohero.reflection.demoobjects;

/**
 * Created by Ana.Diaconu on 12-Jul-17.
 */
public class MyPrimitive extends MyPrimitiveSuper {
   private int number;
   public Integer b;

    public MyPrimitive() {
    }

    public MyPrimitive(int number, Integer b) {
        this.number = number;
        this.b = b;
    }

    public class InClass1{

   }

   public class InClass2{

    }

    public int suma (int a, int b){
        return a+b;
    }


    @Override
    public String toString() {
        return "MyPrimitive{" +
                "number=" + number +
                ", b=" + b +
                '}';
    }
}

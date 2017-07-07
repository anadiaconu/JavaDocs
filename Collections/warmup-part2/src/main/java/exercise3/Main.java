package exercise3;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Ana.Diaconu on 07-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<StudentExtension,BigDecimal>map1 = new HashMap<StudentExtension, BigDecimal>();
        HashMap<StudentExtension2,BigDecimal>map2 = new HashMap<StudentExtension2, BigDecimal>();
        HashMap<StudentExtension3,BigDecimal>map3 = new HashMap<StudentExtension3, BigDecimal>();
        HashMap<StudentExtension4,BigDecimal>map4 = new HashMap<StudentExtension4, BigDecimal>();

        StudentExtension se11 = new StudentExtension("Marian","Ion1");
        StudentExtension se12 = new StudentExtension("Marian","Ion2");
        StudentExtension2 se21 = new StudentExtension2("Marian","Ion1");
        StudentExtension2 se22 = new StudentExtension2("Marian","Ion2");
        StudentExtension3 se31 = new StudentExtension3("Marian","Ion1");
        StudentExtension3 se32 = new StudentExtension3("Marian","Ion2");
        StudentExtension4 se41 = new StudentExtension4("Marian","Ion1");
        StudentExtension4 se42 = new StudentExtension4("Marian","Ion2");

        map1.put(se11,new BigDecimal(32));
        map1.put(se12,new BigDecimal(32));
        map2.put(se21,new BigDecimal(32));
        map2.put(se22,new BigDecimal(32));
        map3.put(se31,new BigDecimal(32));
        map3.put(se32,new BigDecimal(32));
        map4.put(se41,new BigDecimal(32));
        map4.put(se42,new BigDecimal(32));

        System.out.println(se11.equals(se12));
        System.out.println(se21.equals(se22));
        System.out.println(se31.equals(se32));
        System.out.println(se41.equals(se42));

    }
}

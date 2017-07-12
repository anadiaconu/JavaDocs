package ro.teamnet.zerotohero.reflection;

import ro.teamnet.zerotohero.reflection.demoobjects.MyEnum;
import ro.teamnet.zerotohero.reflection.demoobjects.MyPrimitive;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
public class ClassReflectionDemoMain {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //TODO get the class for a String object, and print it
        System.out.println("something".getClass().getName());
        System.out.println("something".getClass().getCanonicalName());
        System.out.println("something".getClass().getSimpleName());

        //TODO get the class of an Enum, and print it
        Enum myEnum = MyEnum.Oi;
        System.out.println(myEnum.getClass().getSimpleName());

        //TODO get the class of a collection, and print it
        HashMap hm = new HashMap();
        System.out.println(hm.getClass().getSimpleName());

        //TODO get the class of a primitive type, and print it
        System.out.println(int.class.getCanonicalName());

        //TODO get and print the class for a field of primitive type
        Field f = MyPrimitive.class.getDeclaredField("number");

        System.out.println(f.getType());


        //TODO get and print the class for a primitive type, using the wrapper class
        Field g = MyPrimitive.class.getDeclaredField("b");

        System.out.println(g.getType());

        //TODO get the class for a specified class name
        System.out.println(MyPrimitive.class.getSimpleName());

        //TODO get the superclass of a class, and print it
        System.out.println(MyPrimitive.class.getSuperclass().getSimpleName());
        //TODO get the superclass of the superclass above, and print it
        System.out.println(MyPrimitive.class.getSuperclass().getSuperclass().getSimpleName());

        //TODO get and print the declared classes within some other class
        Class [] v = MyPrimitive.class.getDeclaredClasses();
        for(int i = 0; i<v.length; i++)
            System.out.println(v[i].getSimpleName());

        //TODO print the number of constructors of a class
        Constructor[] a = MyPrimitive.class.getDeclaredConstructors();
        for(int i = 0; i<a.length; i++)
            System.out.println(a[i]);

        //TODO get and invoke a public constructor of a class

        MyPrimitive mp = new MyPrimitive();
        Constructor c = mp.getClass().getConstructor(int.class,Integer.class);
        System.out.println(c.newInstance(2, 3).toString());


        //TODO get and print the class of one private field 
        Field f3 = MyPrimitive.class.getDeclaredField("number");
        f3.setAccessible(true);
        System.out.println(f3.getType());

        //TODO set and print the value of one private field for an object
        Field f4 = MyPrimitive.class.getDeclaredField("number");
        f4.setAccessible(true);
        f4.set(mp, 3);
        System.out.println(f4.get(mp));

        //TODO get and print only the public fields class

        Field [] field = MyPrimitive.class.getFields();
        for(int i=0; i<field.length;i++)
            System.out.println(field[i]);

        //TODO get and invoke one public method of a class
        
        Method method = mp.getClass().getMethod("suma", int.class, int.class);
        System.out.println(method.invoke(mp,2, 3));

        //TODO get and invoke one inherited method of a class
       
		method = mp.getClass().getSuperclass().getMethod("product", int.class,int.class);
        System.out.println(method.invoke(mp, 2, 3));

		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
        for(int i =0; i<10;i++)
            mp.suma(2,3);
        System.out.println(System.currentTimeMillis());
        //TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
        for(int i =0; i<10;i++) {
            method = mp.getClass().getMethod("suma", int.class, int.class);
            method.invoke(mp, 3,2);
        }
        System.out.println("invoke " +System.currentTimeMillis());

    }
}

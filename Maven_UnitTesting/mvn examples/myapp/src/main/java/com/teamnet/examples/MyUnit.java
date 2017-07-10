package com.teamnet.examples;


/**
 * Created by Ana.Diaconu on 10-Jul-17.
 */
public class MyUnit {
    public String concatenate (String one, String two){
        if (one == null && two != null)
            return two;
        else if (two == null && one != null)
            return one;
        else if (two == null && one == null)
            return null;
        return one + two;
    }

    public boolean getBoolean(){
        return new java.util.Random().nextBoolean();

    }
}

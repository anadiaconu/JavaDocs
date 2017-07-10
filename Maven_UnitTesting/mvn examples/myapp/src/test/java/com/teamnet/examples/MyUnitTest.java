package com.teamnet.examples;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Ana.Diaconu on 10-Jul-17.
 */
public class MyUnitTest {

    @Test
    public void testConcatenate(){
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals ("onetwo", result);

    }

    @Test
    public void testConcatNulls(){
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate(null, null);

        assertEquals (null, result);

        result = myUnit.concatenate(null, "Ana");

        assertEquals ("Ana", result);

        result = myUnit.concatenate("Ana", null);

        assertEquals ("Ana", result);
    }

    @Test
    public void testGetBoolean(){

        MyUnit myUnit = new MyUnit();
        assertNotNull(myUnit.getBoolean());

       // assertThat(123, is(123));
       // assertTrue ((Boolean)myUnit.getBoolean() instanceof Boolean);
    }

}

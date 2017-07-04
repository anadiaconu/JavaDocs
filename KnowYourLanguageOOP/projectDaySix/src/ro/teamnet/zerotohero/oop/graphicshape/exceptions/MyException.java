package ro.teamnet.zerotohero.oop.graphicshape.exceptions;

import java.util.Scanner;

/**
 * Created by Ana.Diaconu on 04-Jul-17.
 */
public class MyException extends Exception {
    public MyException(){}
    public MyException(String message){
        super(message);
    }

    public void getSomeText(){
        getSomeTextReloaded();
    }

    public void getSomeTextReloaded(){
        try {
            getSomeTextException();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void getSomeTextException() throws MyException{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String myString = keyboard.nextLine();
        try{

            if(myString.contains(" "))
            {
                throw new MyException();
            }
        } catch (MyException e){

            System.out.println("Avem exceptie in: " + e);
            e.getCause();
            throw e;
        }
    }
}

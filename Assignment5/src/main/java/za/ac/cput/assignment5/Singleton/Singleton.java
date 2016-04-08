package za.ac.cput.assignment5.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by student on 2016/04/08.
 */
public class Singleton
{
    private static Singleton lawyer = new Singleton();
    
    private Singleton(){}

    //Get the only object available
    public static Singleton getInstance(){
        return lawyer;
    }

    public void showMessage(){
        System.out.println("Lawyer");
    }
}

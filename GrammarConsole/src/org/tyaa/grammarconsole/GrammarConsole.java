/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.grammarconsole;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
//import org.tyaa.libdemo.MyClass;

/**
 *
 * @author student
 */
public class GrammarConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws
            ClassNotFoundException
            , NoSuchMethodException
            , IllegalAccessException
            , IllegalArgumentException, InvocationTargetException {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you want? (1/2)");
        String choice = sc.next();
        if (choice.equals("1")) {
            System.out.println("2 * 2 = 4");
        } else {
            System.out.println("Input a number");
            Integer number = sc.nextInt();

            //System.out.println(MyClass.numberToString(number));
            Class<?> myClass = Class.forName("org.tyaa.libdemo.MyClass");
            Method numberToString =
                myClass.getMethod("numberToString", Integer.class);
            System.out.println(numberToString.invoke(null, number));
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeocin;

/**
 *
 * @author Estudiantes
 */
public class Excepciones {
    
    
    public static void mostrarArreglo (int [] a)throws ArrayIndexOutOfBoundsException{
            System.out.println(a[5]);
    }    
    public static void divisionCero (int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
    public static void stringInvalido (String a) throws NumberFormatException{
        System.out.println("Numero convertido: " + Integer.parseInt(a));
    }
    public static void stringFueraTamaño (String a) throws StringIndexOutOfBoundsException{
        char c = a.charAt(5);
        System.out.println("Caracter en posicion 5: " + c);
    }
    public static void valorNoExiste (String a) throws NullPointerException{
        System.out.println(a.length());
    }
}

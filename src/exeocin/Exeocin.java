/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeocin;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Exeocin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0, eleccion = 1;
        Scanner miau = new Scanner(System.in);

        do {
            System.out.println("Ingrese la opcion que desee probar");
            opcion = miau.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        Excepciones.divisionCero(10, 0);
                    } catch (ArithmeticException e) {
                        System.out.println("La division entre 0 es indeterminada");
                    }
                    break;
                case 2:
                    try {
                        int[] arreglo = {1, 2, 3, 4, 5};
                        Excepciones.mostrarArreglo(arreglo);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Indice no valido");
                    }
                    break;
                case 3:
                    try {
                        Excepciones.stringInvalido("ABC");
                    } catch (NumberFormatException e) {
                        System.out.println("No es posble convertir esa cadena"
                                + " a numeros");
                    }
                    break;
                case 4:
                    try{
                        Excepciones.stringFueraTamaño("Hola");
                    }catch (StringIndexOutOfBoundsException e){
                        System.out.println("Posisicion fuera de la cadena");
                    }
                case 5:
                    try{
                        Excepciones.valorNoExiste(null);
                    }catch (NullPointerException e){
                        System.out.println("Variable vacia.");
                    }
                case 6:
                    try {
                        //pasar el semestre sin perder nada :c ni llorar.
                    } catch (ArrayStoreException e) {
                        System.out.println("Indice no valido");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println("Si desea repetir el programa, oprima \"1\"");
            eleccion = miau.nextInt();
        } while (eleccion == 1);
    }

}

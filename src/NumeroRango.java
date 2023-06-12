/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ashley
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase contiene un programa que imprime todos los números entre dos números ingresados por el usuario,
 * excluyendo los números de entrada.
 */
public class NumeroRango {

    /**
     * Imprime todos los números entre dos números ingresados por el usuario, excluyendo los números de entrada.
     *
     * @param start el primer número del rango (excluido)
     * @param end   el segundo número del rango (excluido)
     * @return una lista de los números entre los dos números ingresados
     */
    public List<Integer> imprimirNumerosEnRango(int start, int end) {
        List<Integer> numerosEnRango = new ArrayList<>();
        for (int i = start + 1; i < end; i++) {
            numerosEnRango.add(i);
        }
        return numerosEnRango;
    }

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int start = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int end = scanner.nextInt();

        NumeroRango rango = new NumeroRango();
        List<Integer> numerosEnRango = rango.imprimirNumerosEnRango(start, end);

        System.out.println("Números en el rango:");
        for (int numero : numerosEnRango) {
            if(numero%2 == 0){
                 System.out.println(numero);
            }
           
        }
    }
}


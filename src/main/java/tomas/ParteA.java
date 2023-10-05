/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class ParteA {

    public static void main(String[] args) {

        //Declaración de variables y objetos. 
        Scanner teclado = new Scanner(System.in);
        String calcetin = "Calcetin";
        String camiseta = "Camiseta";
        String batidoFresa = "Batido de Fresa";

        double precioCalcetin;
        double precioCamiseta;
        double precioBatidoFresa;

        // Se preguntan los precios de los productos al usuario. 
        System.out.println("Dime el precio de 1: " + calcetin);
        precioCalcetin = teclado.nextDouble();
        System.out.println("Dime el precio de 1: " + camiseta);
        precioCamiseta = teclado.nextDouble();
        System.out.println("Dime el precio de 1: " + batidoFresa);
        precioBatidoFresa = teclado.nextDouble();
        teclado.nextLine();

        // Se muestran los precios unitarios de los productos. 
        System.out.println("\n" + calcetin + " --- " + precioCalcetin + "€");
        System.out.println(camiseta + " --- " + precioCamiseta + "€");
        System.out.println(batidoFresa + " --- " + precioBatidoFresa + "€");

        //Se calcula el precio total de todos los productos suponiendo que 
        //solo se compra una unidad de cada uno de los que hay. 
        double precioTotal = (precioCalcetin + precioCamiseta + precioBatidoFresa);

        String resultado = """
                           \n
                           *****************************************************
                           
                           Precio de Venta Total: %.2f €
                           
                           *****************************************************
                           """.formatted(precioTotal);
        //Se muestran los valores por Scanner. 
        System.out.println(resultado);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomas;

import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 *
 */
public class ParteB {

    public static void main(String[] args) {
        //Declaración de variables y objetos. 
        String producto1;
        String producto2;
        String producto3;

        double precioProducto1;
        double precioProducto2;
        double precioProducto3;

        int cantidadProducto1;
        int cantidadProducto2;
        int cantidadProducto3;

        producto1 = JOptionPane.showInputDialog("Introduce el nombre del primer producto");
        producto2 = JOptionPane.showInputDialog("Introduce el nombre del segundo producto");
        producto3 = JOptionPane.showInputDialog("Introduce el nombre del tercer producto");

        precioProducto1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de: " + producto1));
        precioProducto2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de: " + producto2));
        precioProducto3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de: " + producto3));

        cantidadProducto1 = Integer.parseInt(JOptionPane.showInputDialog("Que cantidad de " + producto1 + " quieres comprar"));
        cantidadProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Que cantidad de " + producto2 + " quieres comprar"));
        cantidadProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Que cantidad de " + producto3 + " quieres comprar"));


        float precioVentaLinea_1 = cantidadProducto1 * (float)precioProducto1;
        float precioVentaLinea_2 = cantidadProducto2 * (float)precioProducto2;
        float precioVentaLinea_3 = cantidadProducto3 * (float)precioProducto3;
        
        
        
        double precioVentaSinIVA = (precioVentaLinea_1 + precioVentaLinea_2 + precioVentaLinea_3);
        final double IVA = 0.16;
        
        
        boolean vendidoMasDe1000 = (precioVentaSinIVA>1000);
        JOptionPane.showMessageDialog(null, "¿Es verdadero que se han vendido más de 1000€?" + vendidoMasDe1000);
        
        
        
        String resutado = """
                          %s       ---  %.3f   ---   %d    ---   %.3f
                          Precio Venta Total(16%% IVA)  --- 
                          """.formatted(producto1,precioProducto1,cantidadProducto1,precioVentaLinea_1);
        System.out.println(resutado);
        
        
        
        

    }
}

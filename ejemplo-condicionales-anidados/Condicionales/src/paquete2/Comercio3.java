/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    // Existe una modificacion en el proceso de la problematica el porcentaje 
    de descuento del seguro sera ingresado por teclado. Considerar los valores
    posibles a ingresar son: 1-15, Si la persona ingresa un valor fuera del 
    rango el valor de porcentaje sera 10 
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro = 8;
        double adicionalSeguro;
        int descseguro = 0;
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();   
        
        System.out.println("Ingrese el descuento del seguro");
        descseguro = entrada.nextInt();
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        // calcular el descuento del seguro 
        if (descseguro<=15){
            
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        // Condicionales anidados
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * descseguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    }
}

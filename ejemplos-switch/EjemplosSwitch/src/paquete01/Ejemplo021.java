/*


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int dianacido;
        int mesnacido;
        int yearnacido;
                
        System.out.println("Ingrese el dia de su nacimiento");
        dianacido = entrada.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        mesnacido = entrada.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        yearnacido = entrada.nextInt();
        
        String mesCadena = "";
        
        switch (mesnacido) {
            case 1:
                mesCadena = "Enero";
                break;

            case 2:
                mesCadena = "Febrero";
                break;

            case 3:
                mesCadena = "Marzo";
                break;

            case 4:
                mesCadena = "Abril";
                break;

            case 5:
                mesCadena = "Mayo";
                break;

            case 6:
                mesCadena = "Junio";
                break;

           case 7:
                mesCadena = "Julio";
                break;

            case 8:
                mesCadena = "Agosto";
                break;

            case 9:
                mesCadena = "Septiembre";
                break;

            case 10:
                mesCadena = "Octubre";
                break;
                
            case 11:
                mesCadena = "Noviembre";
                break;

            case 12:
                mesCadena = "Diciembre";
                break;             

            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        System.out.printf("Usted ha nacido el %d de %s de %d",
                dianacido, mesCadena, yearnacido);
                
    }
}
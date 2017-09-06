/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_lab4;

import java.util.Scanner;

/**
 *
 * @author datos2
 */
public class ED_LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x=0,opcion=0;
        String xy;
        while(x!=3)
        {
            
            System.out.println("LABORATORIO 4");
             System.out.println("1. Aritmetica modular");
             System.out.println("2. Multiplicacion");
             opcion=leer.nextInt();
             switch(opcion)
             {
                 case 1:
                    
                     System.out.println("Ingrese elemento");
                     xy=leer.next();
                     System.out.println("El indice es "+x(xy));
                     
                     
                     
                     
                 break;
                 default:
                     break;
             }
        }
       
    }
   
    static int x(String dato)
    {
        int tvasc=0;  //variable acumuladora para el valor ascci para determinar el tamaño del vector
        for(int r=0;r<dato.length();r++)
        {
              tvasc=tvasc+dato.codePointAt(r);
        }
        System.out.println("Tamaña del vector calculado "+tvasc);
        return 0;
    }
    
}

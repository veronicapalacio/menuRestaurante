/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menurestaurante;

import java.util.Scanner;

/**
 *
 * @author veronicap
 */
public class Menurestaurante {
    private static int opcionentradas;
    private static int estado = 0;
     public static void entradas  () {
        String opcion;
       /* System.out.println("1) nachos ");*/
        System.out.println("2) flautas");
        Scanner a =  new Scanner(System.in);
        opcionentradas =  a.nextInt();
        
        
    }
     private static void menuprincipal (){
         System.out.println("MENU!");
         System.out.println("1) ENTRADAS ");
         System.out.println("2) PLATO FUERTE");
         System.out.println("3) BEBIDAS");
         System.out.println("4) SALIR");
     
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (estado == 0){
        menuprincipal();
        Scanner a =  new Scanner(System.in);
        opcionentradas =  a.nextInt();        
        /*switch (opcionentradas) {
            case 1:
                System.out.println("nachos");
                break;
            case 2:
                System.out.println("flautas");

                break;
            default:
                throw new AssertionError();
        }*/
        switch (opcionentradas) {
            case 1:
                System.out.println("1 .nachos");
                System.out.println("2 .flautas");
                
                break;
            case 2:
                System.out.println("Burros mixtos");
                System.out.println("Quesadillas");
                break;
            case 3:
                System.out.println("Coca Cola");
                System.out.println("Tamarindo");
                break;
            case 4:
                estado = 1;
                break;
            default:
        }
        
        }
    }
    
}






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejersicio3;
import java.util.Scanner;
/**
 *
 * @author WilChess
 */
public class Ejersicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //al reves letras
                //WILMER ABRAHAM QUIM HERNANDEZ
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe el texto que quieres modificar: ");
        String var = sc.next();
        
        String varInvertida = "";
        
        for(int i = var.length() - 1; i >= 0; i--) {
            varInvertida += var.charAt(i);
        }
        
        System.out.println("Normal: " + var);
        System.out.println("Al reves: " + varInvertida);
        
    }
    
}

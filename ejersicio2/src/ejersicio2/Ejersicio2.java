/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejersicio2;
import java.util.Scanner;
/**
 *
 * @author WilChess
 */
public class Ejersicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tabla de multiplicar
                //WILMER ABRAHAM QUIM HERNANDEZ
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("numero a multiplicar");
        numero = sc.nextInt();
        
        for (int i = 1; i < 11 ; i++){
            int res = numero*i;
            System.out.println( numero + "x" + i + "=" + res);
        };
        
        
    }
    
}

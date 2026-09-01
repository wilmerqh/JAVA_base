/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejersicio1;
import java.util.Scanner;
/**
 *
 * @author WilChess
 */
public class Ejersicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CALCULADORA DE PROMEDIO
        //WILMER ABRAHAM QUIM HERNANDEZ
        
        int numero;
        Scanner sc = new Scanner(System.in);
        int numero2;
        int numero3;
        
        
        System.out.println("primera nota");
        numero = sc.nextInt();
        System.out.println("segunda nota");
        numero2 = sc.nextInt(); 
        System.out.println("tercera nota");
        numero3 = sc.nextInt();
        
        int[] nota = {numero, numero2, numero3};
        
                
        int suma = 0;
        
        
        for (int i = 0; i < nota.length; i++) {
             suma = suma + nota[i];
             
        }
        double promedio = suma / (double) nota.length; 
        System.out.println("El promedio es: " + promedio); 
        
        if (promedio >= 60){
            System.out.println("aprobado");
        }else{
            System.out.println("resprobado");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo;
import java.util.Scanner;

/**
 *
 * @author WilChess
 */
public class circulo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // CALCULADORA DE PROMEDIO
        //WILMER ABRAHAM QUIM HERNANDEZ
        
       
        Scanner sc = new Scanner(System.in);
        int form;
        double numero;
        double operacion;
        double radio;
        
        
        System.out.println("Que desea calcular? \nArea = 1 \nCircunferencia = 2");
        form = sc.nextInt();
        System.out.println("proporcione el radio del circulo");
        numero = sc.nextInt(); 

        radio = numero  * numero;
        
        if (form == 1){
           operacion = 3.1416 * radio; 
           System.out.println("El area del sirculo es: " + operacion);
        }else if (form == 2){
            operacion = 2 * 3.1416 * radio;
            System.out.println("La circunferencia es: " + operacion);
        }else{
            System.out.println("la funcion seleccionada no existe");
        }
        
     }
    
}

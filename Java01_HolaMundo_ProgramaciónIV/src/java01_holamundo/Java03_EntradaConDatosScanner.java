
package java01_holamundo;
import java.util.Scanner; // Sirve para importar Scanner.

public class Java03_EntradaConDatosScanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cual es tu nombre? " );
        String nombre = sc.nextLine();
        
        System.out.print("¿Cual es tu edad? " );
        int edad = sc.nextInt();
        
        System.out.println("Hola, bienvenido " + nombre + " tienes " + edad + " anios.");
    }
    
}

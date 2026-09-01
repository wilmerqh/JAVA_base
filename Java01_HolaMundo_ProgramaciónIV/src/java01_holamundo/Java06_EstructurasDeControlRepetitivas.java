package java01_holamundo;
import java.util.Scanner; // Sirve para importar Scanner.

public class Java06_EstructurasDeControlRepetitivas {
    public static void main(String[]args){
    /*//Bucle While
    int contador = 1;
    
    while (contador<=5){
        System.out.println("Vuelta No."+contador);
        contador++; //Sumar al 1 contador (Hasta que equivalga al contador 5)
       
    }*/
    //Bucle do-while
    /*int numero;
    Scanner sc = new Scanner(System.in);
    
    do {
            System.out.println("Escribe un número positivo: ");
            numero = sc.nextInt();
    } while(numero<=0);*/
    //Bucle For
    //Imprimir los números del 1 al 10
    for (int i = 1; i<=10; i++){
         System.out.println(i);
    }
}
    
}

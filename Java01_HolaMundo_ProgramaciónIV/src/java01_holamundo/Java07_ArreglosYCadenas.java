package java01_holamundo;

public class Java07_ArreglosYCadenas {
        public static void main(String[]args){
        //Arreglos de 5 enteros
        int[] notas={90, 85, 70, 60, 95};
        
        //System.out.println(notas[0]);
        //System.out.println(notas[4]);       
                
        //Recorrer el arreglo con un for
        /*int suma = 0;
        for (int i = 0; i<notas.length;i++){
            suma = suma + notas[i];
        }
        double promedio = suma / 5.0;
        System.out.println("Promedio " + promedio);*/
        
        String texto = "Programación";
 
        System.out.println(texto.length());        // 12  (cantidad de caracteres)
        System.out.println(texto.toUpperCase());   // PROGRAMACIÓN
        System.out.println(texto.charAt(0));       // P   (carácter en la posición 0)
        System.out.println(texto.substring(0, 7)); // Program
    }
}

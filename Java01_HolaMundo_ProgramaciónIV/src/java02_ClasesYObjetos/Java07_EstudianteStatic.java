package java02_ClasesYObjetos;

public class Java07_EstudianteStatic {
    String nombre;
    static int totalEstudiantes = 0; //Compartir con todos.
    
    public Java07_EstudianteStatic(String nombre){
        this.nombre = nombre;
        // aumenta cada vez que se crea un estudiante
        totalEstudiantes++; 
    }
     //Miembros estáticos (static)
    /*
    Normalmente cada objeto tiene su propia copia de los atributos. 
    Pero a veces necesitamos un dato compartido por todos los 
    objetos de la clase: para eso sirve static.
    */
    public static void main(String[] args) {
        new Java07_EstudianteStatic("Ana");
        new Java07_EstudianteStatic("Pedro");
        new Java07_EstudianteStatic("Ana");

        
        System.out.println("Total de estudiantes: " + Java07_EstudianteStatic.totalEstudiantes);
    }
    
    /*
Crea una clase Producto con nombre, precio y cantidad en 
inventario. Incluye un método que calcule el valor total del 
inventario de ese producto y otro que aplique un descuento 
al precio.
*/
}

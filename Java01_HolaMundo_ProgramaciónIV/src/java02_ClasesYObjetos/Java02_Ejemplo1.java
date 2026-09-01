package java02_ClasesYObjetos;

public class Java02_Ejemplo1 {
             String nombre;
             int edad;
             double promedio;
             
            //Método (acción)
            void presentarse(){
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " anios.");
            }
            
            public static void main(String[]args){
                //Crear un objeto
                Java02_Ejemplo1 e1 = new Java02_Ejemplo1();
                
                //Al objeto le estoy asignando valores a sus atributos
                e1.nombre = "Lucas";
                e1.edad = 15;
                e1.promedio = 88.5;
                //Llamando a su método (acción).
                e1.presentarse();
                
                //Nuevo objeto
                //... e1 a e2
                
            }
    
}

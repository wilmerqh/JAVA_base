//Tema: Constructores
/* Es un método especial que se ejecuta
automáticamente al crear el objeto y sirve para darle
valores iniciales*/
package java02_ClasesYObjetos;
public class Java03_EstudianteConstructor {
    String nombre;
    int edad;
    double promedio;
    
    //Crear constructor parametrizado
    public Java03_EstudianteConstructor(String nombre, int edad, double promedio){
        /*This = Significa "Guarda en el atributo 
        del objeto el valor que llegó como parámetro*/
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    //Método
    void presentarse(){
        System.out.println("Hola soy " + nombre + " y tengo " + edad + " anios");
    }  
    
    public static void main(String[]args){
    //Creamos el objeto
    Java03_EstudianteConstructor e1 = new Java03_EstudianteConstructor("Tomas",21,60.9);
    e1.presentarse();
    }
}

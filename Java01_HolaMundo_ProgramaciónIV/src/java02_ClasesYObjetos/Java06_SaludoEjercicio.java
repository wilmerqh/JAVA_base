package java02_ClasesYObjetos;


public class Java06_SaludoEjercicio {
    //Método saludar.
    public String saludar(){
        return "Hola!";
    }
    //Sobrecarga con un paramétro.
    public String saludar(String nombre){
        return "Hola " + nombre + "!";
    }
    
    public static void main(String[]args){
        Java06_SaludoEjercicio h1 = new Java06_SaludoEjercicio();
        String saludo = h1.saludar();
        String saludo1 = h1.saludar("Alejandro");
        
        System.out.println(saludo);
        System.out.println(saludo1);
    }

}

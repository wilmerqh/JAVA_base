package java02_ClasesYObjetos;

public class Java05_Calculadora_SobreCargadeMetodos {
    
    //Método sumar
    public int sumar(int a,int b){
        return a + b;
    }
    //Sobrecargando por cantidad de parámetros
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
    //Sobrecarga por tipo de parámetros
    public double sumar(double a, double b){
        return a + b;
    }
    
    public static void main(String[]args){
        Java05_Calculadora_SobreCargadeMetodos calculo = new Java05_Calculadora_SobreCargadeMetodos();
        
        int resultado1 = calculo.sumar(1, 2); //Primer método
        int resultado2 = calculo.sumar(5,2,3);//Segundo método
        double resultado3 = calculo.sumar(2.5,3.5);//Tercer método
        
        System.out.println("Suma de 2 enteros: " + resultado1);
        System.out.println("Suma de 3 enteros: " + resultado2);
        System.out.println("Suma de 2 decimales: " + resultado3);
        //Java06_SaludoEjercicio
        //Crear una clase llamada Java06_SaludoEjercicio con un método
        //sobrecargado llamado saludar;
        //Mensaje esperado
        //Hola!
        //Hola, Alejandro!
    }
}

//Encapsulamiento
package java02_ClasesYObjetos;
/*
El encapsulamiento es uno de los pilares de la POO. 
Consiste en proteger los datos de un objeto para que 
no se modifiquen de cualquier manera desde afuera. 
La idea es: los atributos se ocultan y solo se accede a ellos a
través de métodos controlados.
*/

/*
Modificadores de acceso.
- private: el atributo o método solo puede usarse dentro de una
misma clase, es el más restrictivo.
- public: puede utilizarse en cualquier parte de mi programa.
*/
public class Java04_CuentaBancaria {
    private String titular;
    private double saldo;
    //Aquí utilizamos un constructor ya que tiene parametros.
    public Java04_CuentaBancaria(String titular, double saldoInicial){
        //La conversión de variables.
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    //Getter: permitir leer el saldo
    public double getSeldo(){
        //Retorna el saldo
        return saldo;
    }
    //Get: obtener
    //Set: Asignar o modificar el valor de un atributo privado.
    
//Setter controlado: solo depositar montos positivos.
    public void depositar(double monto){
        if(monto > 0){
            //que se actualiza el monto actual y se suma con el deposito.
            saldo = saldo + monto;
            System.out.println("Deposito de: "  + monto);
            System.out.println("Su saldo es: " + saldo);
        } else{
            System.out.println("El monto debe ser positivo.");
        }
    }
    
    //Método para retiro de dinero
    public void retirar(double monto){
        if(monto > 0 && monto <= saldo){
            saldo = saldo - monto;
            System.out.println("Retiro de: "  + monto);
            System.out.println("Su saldo es: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }
    
    public static void main(String[]args){
    //Creamos el objeto
    Java04_CuentaBancaria p1 = new Java04_CuentaBancaria("Tomas",20.5);
    p1.depositar(100.0);
    p1.retirar(50.0);
    }
    
}


package productopanaderia;

import java.util.Scanner; // Importamos la herramienta para poder leer lo que el usuario escribe en el teclado

// CLASE 1: Objeto (Tiene que ser la pública porque así se llama tu archivo)
public class ProductoPanaderia {
    
    // 1. Encapsulamiento (Atributos privados)
    // Usamos 'private' para que nadie pueda cambiar el precio o el inventario desde fuera de esta clase sin permiso.
    private String nombre;       // Guarda el texto del nombre del pan (ej. "Concha")
    private double precio;       // Guarda el precio con decimales (ej. 2.50)
    private int cantidad;        // Guarda los números enteros del stock (ej. 50 panes)
    private boolean esIntegral;  // Guarda un valor de verdadero o falso (true/false)

    // 2. Atributo estático (Variable global de la clase)
    // Al ser 'static', esta variable no le pertenece a un solo pan, sino a la panadería entera.
    // Sirve para llevar la cuenta de cuántos tipos de pan hemos registrado en total.
    public static int contador = 0;

    // 3. Constructor 1: Parametrizado (Sobrecarga de constructores)
    // Es el "molde" principal. Se usa cuando queremos crear un pan dándole todos sus datos desde el principio.
    public ProductoPanaderia(String nombre, double precio, int cantidad, boolean esIntegral) {
        this.nombre = nombre;         // 'this' significa "el atributo de esta clase toma el valor de la variable que me mandaron"
        this.precio = precio;
        this.cantidad = cantidad;
        this.esIntegral = esIntegral;
        contador++;                   // Cada vez que usamos este molde, sumamos 1 al contador estático
    }

    // 3. Constructor 2: Por defecto (Sobrecarga)
    // Es el "molde" secundario. Se usa cuando creamos un pan pero no le damos ningún dato.
    // Nosotros le ponemos datos genéricos por defecto para que no dé error.
    public ProductoPanaderia() {
        this.nombre = "Pan Básico";
        this.precio = 1.0;
        this.cantidad = 10;
        this.esIntegral = false;
        contador++;                   // También suma 1 al contador estático porque de todos modos se creó un pan
    }

    // Getters y Setters obligatorios (Las puertas de acceso a las variables privadas)
    // Get (Obtener/Leer) - Return devuelve el valor.
    // Set (Establecer/Cambiar) - Recibe un nuevo valor y lo guarda en la variable privada.
    public String getNombre() { return nombre; }
    public void setNombre(String n) { nombre = n; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double p) { precio = p; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int c) { cantidad = c; }
    
    public boolean getEsIntegral() { return esIntegral; }
    public void setEsIntegral(boolean e) { esIntegral = e; }

    // 4. Método toString() básico
    // Sirve para que, cuando queramos imprimir el objeto, no salgan símbolos raros, sino un texto ordenado.
    public String toString() {
        return nombre + " | Precio: Q" + precio + " | Cantidad: " + cantidad;
    }

    // 5. Método sobrecargado 1 (Venta normal)
    // Calcula el total multiplicando el precio del pan por los que el cliente quiere llevar.
    public double cobrar(int comprar) {
        return precio * comprar;
    }

    // 5. Método sobrecargado 2 (Venta con el REQUISITO EXTRA de docena)
    // Se llama igual que el de arriba ("cobrar"), pero Java sabe cuál usar porque este recibe dos parámetros (int y boolean).
    public double cobrar(int comprar, boolean revisarDocena) {
        double total = precio * comprar; // Primero calculamos el total normal
        
        // REQUISITO EXTRA: Si el booleano es verdadero Y además compró 12 o más panes iguales...
        if (revisarDocena == true && comprar >= 12) {
            System.out.println("¡Descuento de docena aplicado!");
            return total * 0.85; // Multiplicar por 0.85 es matemáticamente igual a quitarle el 15% (descuento)
        }
        return total; // Si no llegó a la docena, le cobramos el total normal
    }
}

// CLASE 2: Principal (Aquí arranca el programa, por eso lleva el 'main')
// No lleva la palabra "public" para que NetBeans no exija que el archivo se llame igual que esta clase.
class PanaderiaDonaRosa {

    public static void main(String[] args) {
        // Activamos el lector del teclado
        Scanner leer = new Scanner(System.in);
        
        // 6. Arreglo de 4 objetos (Como una caja con 4 compartimentos para guardar panes)
        ProductoPanaderia[] panes = new ProductoPanaderia[4];
        
        // Llenamos los compartimentos creando los objetos con el 'new'
        panes[0] = new ProductoPanaderia("Frances", 2.0, 50, false);
        panes[1] = new ProductoPanaderia("Concha", 3.0, 30, false);
        panes[2] = new ProductoPanaderia("Integral", 4.0, 20, true);
        panes[3] = new ProductoPanaderia(); // Aquí usamos el constructor vacío (el de por defecto)

        // 7. Variables de 4 tipos distintos 
        int opcion = 0;          // Tipo 1: Entero (Para el menú)
        String texto = "";       // Tipo 2: Cadena de texto (Para buscar nombres)
        boolean hallado = false; // Tipo 3: Booleano (Para saber si encontramos el pan o no)
        char letra = 'a';        // Tipo 4: Carácter (Solo está para cumplir el requisito de la hoja de trabajo)

        // 8. Ciclo repetitivo do-while (Hacer - Mientras)
        // Todo el menú está adentro para que se repita una y otra vez hasta que el usuario decida salir.
        do {
            // Imprimimos el menú en pantalla (\n sirve para dar un salto de línea)
            System.out.println("\n1. Ver panes\n2. Buscar\n3. Comprar\n4. Salir");
            System.out.print("Elija: ");
            opcion = leer.nextInt(); // Leemos el número que ingresó el usuario
            leer.nextLine(); // Limpiamos el salto de línea sobrante del teclado para que no dé errores luego

            // 9. Estructura selectiva (switch)
            // Decide qué camino tomar dependiendo del número que guardó la variable 'opcion'
            switch (opcion) {
                case 1:
                    // 10. Ciclo for (Para recorrer el arreglo)
                    // Empieza en 0 y va aumentando hasta llegar al tamaño máximo del arreglo (panes.length)
                    for (int i = 0; i < panes.length; i++) {
                        // Imprime cada pan usando el método toString() que hicimos arriba
                        System.out.println(panes[i].toString());
                    }
                    // Demostramos que el atributo estático funciona mostrando el total contado
                    System.out.println("Panes registrados: " + ProductoPanaderia.contador);
                    break;

                case 2:
                    System.out.print("Buscar: ");
                    texto = leer.nextLine(); // Leemos qué quiere buscar
                    hallado = false; // Asumimos que no lo hemos encontrado todavía
                    
                    // Recorremos todos los panes otra vez para buscar
                    for (int i = 0; i < panes.length; i++) {
                        // 11. Manejo de cadenas 
                        // toLowerCase() convierte todo a minúsculas para que no importe si escribió "CONCHA" o "concha"
                        // contains() revisa si una palabra contiene a otra
                        // trim() borra los espacios en blanco que el usuario pudo poner por accidente al final
                        if (panes[i].getNombre().toLowerCase().contains(texto.toLowerCase().trim())) {
                            System.out.println("Sí hay: " + panes[i].getNombre());
                            hallado = true; // Cambiamos a true porque sí lo encontramos
                        }
                    }
                    // Si el ciclo terminó y 'hallado' sigue siendo falso, damos el aviso
                    if (hallado == false) System.out.println("No existe.");
                    break;

                case 3:
                    System.out.print("Nombre exacto a comprar: ");
                    String nombreCompra = leer.nextLine();
                    
                    // Recorremos el arreglo para buscar el pan exacto que quiere comprar
                    for (int i = 0; i < panes.length; i++) {
                        // equalsIgnoreCase compara que sea exactamente el mismo nombre sin importar mayúsculas
                        if (panes[i].getNombre().equalsIgnoreCase(nombreCompra)) {
                            System.out.print("¿Cuántos?: ");
                            int cuantos = leer.nextInt(); // Leemos cuántos panes quiere
                            
                            // Verificamos si hay suficiente stock en el inventario
                            if (cuantos <= panes[i].getCantidad()) {
                                
                                // Aquí llamamos al método sobrecargado y cumplimos el REQUISITO EXTRA
                                // Le mandamos los panes a comprar y un 'true' para que el método revise si aplica la docena
                                double aPagar = panes[i].cobrar(cuantos, true);
                                
                                // ACTUALIZAR STOCK: Usamos el Setter para guardar el nuevo valor. 
                                // El nuevo valor es: (lo que había antes) menos (lo que acaba de comprar)
                                panes[i].setCantidad(panes[i].getCantidad() - cuantos); 
                                
                                System.out.println("Pagas: Q" + aPagar);
                            } else {
                                System.out.println("No hay suficientes.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Adiós."); // Mensaje de despedida
                    break;
            }
        // El ciclo se repite MIENTRAS la opción sea diferente (!=) de 4. Si es 4, termina el programa.
        } while (opcion != 4); 
    }
}
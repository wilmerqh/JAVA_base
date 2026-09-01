/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author WilChess
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private double precio;
    
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        setPrecio(precio); 
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Me equivoque, el precio que intente asignar debe ser mayor que 0.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("El titulo de mi libro es " + titulo + ", su autor es " + autor + " y le asigne un precio de " + precio);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herel
        Libro libro1 = new Libro("Luna de Pluton", "Dross", 11.07);
        
        System.out.println("Aqui imprimo los datos del primer objeto que cree:");
        libro1.mostrarInfo();
        
        System.out.println();
        System.out.println("Voy a probar mi validacion ingresando un precio negativo:");
        libro1.setPrecio(-5.00);
        
        System.out.println();
        System.out.println("Ahora le pongo un precio valido para ver el cambio:");
        libro1.setPrecio(15.50);
        libro1.mostrarInfo();
    }
}
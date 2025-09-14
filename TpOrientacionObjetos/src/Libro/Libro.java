
package Libro;

public class Libro {
    // Atributos privados (encapsulados)
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor de la clase
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        // El constructor también puede llamar al setter con validación
        setAnioPublicacion(anioPublicacion); 
    }

    // --- Getters (para obtener los valores de los atributos) ---
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    // --- Setter (para establecer el valor del año con validación) ---
    
    public void setAnioPublicacion(int anio) {
        // Validación: el año no puede ser futuro o negativo.
        if (anio <= 2025 && anio > 0) {
            this.anioPublicacion = anio;
            System.out.println("El año de publicación se actualizó a: " + this.anioPublicacion);
        } else {
            System.out.println("Error: El año de publicación ingresado (" + anio + ") no es válido.");
        }
    }
}
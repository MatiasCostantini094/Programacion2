
package EditorVideo_Proyecto_Render;

/**
 *
 * @author matia
 */
public class EditorVideo {
    
    /**
     * Demuestra la Dependencia de Creación: 
     * crea (new) una instancia de Render DENTRO del método.
     */
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("INICIANDO EXPORTACIÓN para el proyecto: " + proyecto.getNombre());
        
        // La creación ocurre aquí, dentro del método, estableciendo la asociación:
        Render nuevoRender = new Render(formato, proyecto);
        
        System.out.println("EXPORTACIÓN COMPLETADA en formato " + formato + ".");
        
        // El objeto creado es retornado. El EditorVideo no lo almacena.
        return nuevoRender;
    }
}
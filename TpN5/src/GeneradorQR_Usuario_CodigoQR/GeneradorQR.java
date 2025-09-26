
package GeneradorQR_Usuario_CodigoQR;

/**
 *
 * @author matia
 */
public class GeneradorQR {
    
    /**
     * Demuestra la Dependencia de Creación: 
     * crea (new) una instancia de CodigoQR DENTRO del método.
     */
    public CodigoQR generar(String valor, Usuario usuario) {
        // La creación ocurre aquí:
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        
        System.out.println("INFO: GeneradorQR ha completado la creación del CódigoQR.");
        
        // El objeto creado es retornado y la referencia desaparece de GeneradorQR
        return nuevoCodigo;
    }
}
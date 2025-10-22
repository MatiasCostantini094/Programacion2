
package Parte2.Punto5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException
/**
 *
 * @author matia
 */
;
public class LecturaSegura {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(" Error al leer el archivo: " + e.getMessage());
        }
    }
}

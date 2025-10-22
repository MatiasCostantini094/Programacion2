
package Parte1;

import java.util.ArrayList;
import java.util.List;
import Parte1.Pago.Pago;             
import Parte1.Pago.PagoConDescuento; 

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente; // <-- AÑADIR ATRIBUTO CLIENTE 

    // CONSTRUCTOR 
public Pedido(Cliente cliente) {
    this.productos = new ArrayList<>();
    this.estado = "PENDIENTE";
    this.cliente = cliente;
}
// MÉTODO PARA AGREGAR PRODUCTOS
public void agregarProducto(Producto producto) {
    productos.add(producto);
}
//  MÉTODO PARA CALCULAR TOTAL
@Override
public double calcularTotal() {
    double total = 0.0;
    for (Producto p : productos) {
        total += p.calcularTotal(); // Usa la interfaz Pagable
    }
    return total;
}
   
    // MÉTODO PARA PROCESAR EL PAGO 
    public void procesarPago(Pago medioDePago) {
        double montoAPagar = this.calcularTotal();

        System.out.println("\n--- Procesando Pago por $" + montoAPagar + " ---");
        
        //  Polimorfismo
        if (medioDePago instanceof PagoConDescuento) {
            PagoConDescuento pagoConDesc = (PagoConDescuento) medioDePago;
            double factor = pagoConDesc.aplicarDescuento(0.15); // Descuento de ejemplo
            montoAPagar *= factor;
            System.out.println("-> Monto Final con Descuento: $" + montoAPagar);
        }

        medioDePago.procesarPago(montoAPagar);
        this.setEstado("PAGADO"); // Llama al método de notificación
    }
    
    // MÉTODO 
    public void setEstado(String nuevoEstado) {
        if (!this.estado.equalsIgnoreCase(nuevoEstado)) {
            this.estado = nuevoEstado;
            // Pedido llama a la interfaz Notificable del cliente
            if (this.cliente != null) {
                this.cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
            }
        }
    }
    
    
}

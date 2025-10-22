
package Parte1;

/**
 *
 * @author matia
 */

import Parte1.Pago.Pago;
import Parte1.Pago.TarjetaCredito;
import Parte1.Pago.PayPal;

public class EcommerceApp {
    public static void main(String[] args) {
        
        //  Inicialización 
        Cliente cliente = new Cliente("Martina Lopez", "martina.l@mail.com");
        
        // El Pedido ahora recibe el cliente en el constructor
        Pedido pedido = new Pedido(cliente); 
        
        Producto camisa = new Producto("Camisa de Lino", 45.00);
        Producto pantalon = new Producto("Pantalon Jeans", 80.00);

        pedido.agregarProducto(camisa);
        pedido.agregarProducto(pantalon);

        
        System.out.println("-------------------------------------------------");
        System.out.println(" Total a pagar (Pagable): $" + pedido.calcularTotal());
        System.out.println("-------------------------------------------------");

        //  Proceso de Pago 
        
        // Se instancia la clase TarjetaCredito, pero la variable es de tipo Pago
        Pago pagoTarjeta = new TarjetaCredito();
        pedido.procesarPago(pagoTarjeta);
        
        // Se instancia la clase PayPal, pero la variable es de tipo Pago
        Pago pagoPayPal = new PayPal(); 
        pedido.procesarPago(pagoPayPal);
        
        //  Notificaciones 
        pedido.setEstado("EN CAMINO"); // Llama al notificar() del Cliente
        pedido.setEstado("ENTREGADO"); // Llama al notificar() del Cliente
    }
}

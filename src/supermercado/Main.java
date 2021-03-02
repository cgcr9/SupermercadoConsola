/*
 * Elaborado por: Cristina Guadalupe Che Requena
 * Email: cgcr97@gmail.com
 */
package supermercado;

import supermercado.Aplicacion.ServicioProductos;

/**
 *
 * @author Cristina
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioProductos servicio = new ServicioProductos();
        
        servicio.ImprimirTodosProductos();
        servicio.ImprimirProductosMenoresA25();
        servicio.ImprimirProductoMasBarato();
        servicio.ImprimirProductoMasCaro();
    }

    
}

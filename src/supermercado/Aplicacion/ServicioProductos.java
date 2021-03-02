package supermercado.Aplicacion;

import java.util.List;
import supermercado.Modelos.Producto;

/**
 *
 * @author Cristina
 */
public class ServicioProductos implements IServicioProductos {
    
    private supermercado.Dominio.ServicioProductos ServicioDominio = new supermercado.Dominio.ServicioProductos();
    private List<Producto> productos;
    
    
    public ServicioProductos(){
        this.productos = ServicioDominio.ObtenerProductos();
    }
        
    @Override
    public void ImprimirTodosProductos() {
        ImprimirDobleLinea("Todos los productos");
        
        List<Producto> productosOrdenados = ServicioDominio.OrdenarProductos(this.productos);
        
        productosOrdenados.forEach((producto) -> {
            System.out.println(producto.toString());
        });         
;         
    }

    @Override
    public void ImprimirProductosMenoresA25() {
        ImprimirDobleLinea("Productos de precio menor a $25:");
        
        List<Producto> productosFiltrados = ServicioDominio.OrdenarProductos(
                ServicioDominio.FiltrarProductos(this.productos, 25));
        
        productosFiltrados.forEach((producto) -> {
            System.out.println(producto.toString());
        });
        
        ImprimirDobleLinea();
    }

    private void ImprimirDobleLinea(String titulo) {
        System.out.println("================================");
        System.out.println(titulo);
        System.out.println("================================");
    }
    
    private void ImprimirDobleLinea() {
        System.out.println("================================");
    }    

    @Override
    public void ImprimirProductoMasBarato() {
        Producto productoMasBarato = ServicioDominio.ObtenerProductoMasBarato(this.productos);
        
        if(productoMasBarato != null)
            System.out.println("Producto más barato: " + productoMasBarato.Nombre);
    }

    @Override
    public void ImprimirProductoMasCaro() {
        Producto productoMasCaro = ServicioDominio.ObtenerProductoMasCaro(this.productos);
        
        if(productoMasCaro != null){
            System.out.println("Producto más caro: " + productoMasCaro.Nombre);
        }
    }
}

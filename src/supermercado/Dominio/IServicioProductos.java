package supermercado.Dominio;

import java.util.List;
import supermercado.Modelos.Producto;

/**
 *
 * @author Cristina
 */
public interface IServicioProductos {
    
    public List<Producto> ObtenerProductos();
    
    public List<Producto> OrdenarProductos(List<Producto> productos);
    
    public List<Producto> FiltrarProductos(List<Producto> productos, double precio);
    
    public Producto ObtenerProductoMasBarato(List<Producto> productos);
    
    public Producto ObtenerProductoMasCaro(List<Producto> productos);
}

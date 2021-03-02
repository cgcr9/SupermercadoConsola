package supermercado.Dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import supermercado.Modelos.Producto;

        
/**
 *
 * @author Cristina
 */
public class ServicioProductos implements IServicioProductos{

    @Override
    public List<Producto> ObtenerProductos() {
        List<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto("Papa", 24, "kg"));
        listaProductos.add(new Producto("Huevo", "12 piezas", 27));
        listaProductos.add(new Producto("Leche", 29, 1.5));
        listaProductos.add(new Producto("Agua", 22, 5.5));
        
        return listaProductos;
    }
    
    @Override
    public List<Producto> OrdenarProductos(List<Producto> productos) {
        Comparator<Producto> comparacionPorNombre = Comparator.comparing((p) -> p.getNombre());

        List<Producto> productosOrdenados = productos.stream().sorted(comparacionPorNombre)
                    .collect(Collectors.toList());

        return productosOrdenados;
    }
    
    @Override
    public List<Producto> FiltrarProductos(List<Producto> productos, double precio){                
        List<Producto> productosFiltrados = productos.stream().filter((p) -> p.Precio < 25.0)
                .collect(Collectors.toList());
        
        return productosFiltrados;
    }

    @Override
    public Producto ObtenerProductoMasBarato(List<Producto> productos) {
        Producto productoPrecioMenor = productos.get(0);
        
        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).compareTo(productoPrecioMenor) < 0){
                productoPrecioMenor = productos.get(i);
            }
        }
        
        return productoPrecioMenor;
    }

    @Override
    public Producto ObtenerProductoMasCaro(List<Producto> productos) {
        Producto productoMasCaro = productos.get(0);
        
        for(int i= 0; i< productos.size(); i++){
            if(productos.get(i).compareTo(productoMasCaro) > 0){
                productoMasCaro = productos.get(i);
            }
        }
        
        return productoMasCaro;
    }

}

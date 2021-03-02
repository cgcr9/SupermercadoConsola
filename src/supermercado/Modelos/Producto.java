/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Modelos;

import com.sun.istack.internal.Nullable;
import java.text.DecimalFormat;

/**
 *
 * @author Cristina
 */
public class Producto implements Comparable<Producto> {
    
    public String Nombre;
    public Double Precio;
    public @Nullable Double Litros;
    public String Contenido;
    public String UnidadVenta;
    
    public Producto(String nombre, double precio, double litros){
        this.Nombre = nombre;
        this.Precio = precio;
        this.Litros = litros;
    }
    
    public Producto(String nombre, String contenido, double precio){
        this.Nombre = nombre;
        this.Precio = precio;
        this.Contenido = contenido;
    }
    
    public Producto(String nombre, double precio, String unidadVenta){
        this.Nombre = nombre;
        this.Precio = precio;
        this.UnidadVenta = unidadVenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public Double getLitros() {
        return Litros;
    }

    public String getContenido() {
        return Contenido;
    }

    public String getUnidadVenta() {
        return UnidadVenta;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.Precio.compareTo(producto.Precio);
    }
        
    @Override
    public String toString(){
        String infoProducto = "- Nombre: " + this.Nombre;
        
        if(this.Litros != null){
            infoProducto = infoProducto.concat( " /// Litros: " + this.Litros);
        }        
        if(this.Contenido != null){
            infoProducto = infoProducto.concat( " /// Contenido: " + this.Contenido);
        }
        
        DecimalFormat formato = new DecimalFormat("###");
        infoProducto = infoProducto.concat( " /// Precio: $" + formato.format(this.Precio));
        
        if(this.UnidadVenta != null){
            infoProducto = infoProducto.concat( " /// Unidad de venta: " + this.UnidadVenta);
        }        
        return infoProducto;
    }
}

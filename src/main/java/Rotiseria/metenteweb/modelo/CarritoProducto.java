package Rotiseria.metenteweb.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito_producto")
public class CarritoProducto {

    @EmbeddedId
    private CarritoProductoId id = new CarritoProductoId();

    @ManyToOne
    @MapsId("carritoId")
    @JoinColumn(name = "carrito_id")
    private Carrito carrito;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private int cantidad;
    private double precio;

    public CarritoProducto(Carrito carrito, Producto producto, int cantidad, double precio) {
        this.carrito = carrito;
        this.producto = producto;
        this.id = new CarritoProductoId(carrito.getIdCarrito(), producto.getIdProducto());
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters

}
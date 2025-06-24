package Rotiseria.metenteweb.modelo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CarritoProductoId implements Serializable {

    private Long carritoId;
    private Long productoId;

    public CarritoProductoId() {}

    public CarritoProductoId(Long carritoId, Long productoId) {
        this.carritoId = carritoId;
        this.productoId = productoId;
    }

    public Long getCarritoId() { return carritoId; }
    public void setCarritoId(Long carritoId) { this.carritoId = carritoId; }

    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarritoProductoId)) return false;
        CarritoProductoId that = (CarritoProductoId) o;
        return carritoId.equals(that.carritoId) &&
                productoId.equals(that.productoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carritoId, productoId);
    }
}
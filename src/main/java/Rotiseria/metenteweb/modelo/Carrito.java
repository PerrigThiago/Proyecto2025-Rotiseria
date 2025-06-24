package Rotiseria.metenteweb.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "carrito")
@Data // crea getters and setters
@NoArgsConstructor // crea constructor sin argumentos
@AllArgsConstructor // crea todos los tipos de constructores
@Builder //
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Long idCarrito;

    @Column(name = "num_producto", nullable = false)
    private int numProducto;

    @Column(nullable = false)
    private int precio;

    @Column(nullable = false)
    private int total;

    @Column(name = "cant_producto", nullable = false)
    private int cantProducto;

    @Column(nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarritoProducto> productos;

}
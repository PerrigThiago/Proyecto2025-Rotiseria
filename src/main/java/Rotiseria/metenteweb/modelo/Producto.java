package Rotiseria.metenteweb.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "producto")
@Data // crea getters and setters
@NoArgsConstructor // crea constructor sin argumentos
@AllArgsConstructor // crea todos los tipos de constructores
@Builder //
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false)
    private int precio;

    @Column(nullable = false)
    private int cantidad;

    @Column(name = "grupo", nullable = false, length = 50)
    private String grupo;

    @Column(name = "sub_grupo", nullable = false, length = 50)
    private String subGrupo;

    @Column
    @Lob
    private byte[] imagen;

    @Column(nullable = false, length = 255)
    private String descripcion;

    @Column(nullable = false)
    private boolean disponibilidad;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "producto")
    private List<CarritoProducto> carritos;

}


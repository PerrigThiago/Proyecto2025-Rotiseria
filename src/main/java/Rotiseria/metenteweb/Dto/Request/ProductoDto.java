package Rotiseria.metenteweb.Dto.Request;

import Rotiseria.metenteweb.modelo.CarritoProducto;
import Rotiseria.metenteweb.modelo.Usuario;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class ProductoDto {

    private String nombre;


    private int precio;


    private int cantidad;


    private String grupo;


    private String subGrupo;


    private byte[] imagen;


    private String descripcion;

    private boolean disponibilidad;


    private Usuario usuario;


    private List<CarritoProducto> carritos;
}
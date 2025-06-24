package Rotiseria.metenteweb.controlador;

import Rotiseria.metenteweb.Dto.Request.ProductoDto;
import Rotiseria.metenteweb.modelo.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoControlador {
    @GetMapping
    public List<Producto> getProductos(){
        return List.of(new Producto());
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id){
        return new Producto();
    }

    @PostMapping()
    public Long postProducto(@RequestBody ProductoDto dto) {
        return 1L;
    }
}
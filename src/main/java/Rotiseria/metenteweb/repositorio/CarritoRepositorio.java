package Rotiseria.metenteweb.repositorio;

import Rotiseria.metenteweb.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepositorio extends JpaRepository<Carrito, Long> {
}

package pe.edu.cibertec.RC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.RC.Model.Carrito;

public interface CartDao extends JpaRepository<Carrito, Integer> {
}

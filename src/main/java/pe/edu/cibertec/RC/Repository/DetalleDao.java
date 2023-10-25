package pe.edu.cibertec.RC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.RC.Model.Detalle;

public interface DetalleDao extends JpaRepository<Detalle, Integer> {
}

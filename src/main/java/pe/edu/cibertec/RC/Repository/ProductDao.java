package pe.edu.cibertec.RC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.RC.Model.Productos;

public interface ProductDao extends JpaRepository<Productos, Long> {

}

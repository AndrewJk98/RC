package pe.edu.cibertec.RC.Repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.RC.Model.Venta;

public interface VentaDao extends JpaRepository<Venta, Integer> {
}

package pe.edu.cibertec.RC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.RC.Model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<Usuarios, Integer> {
    Usuarios findByEmail(String email);
    Usuarios findByPhone(String phone);
}

package pe.edu.cibertec.RC.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Users")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public long id;
    @Getter @Setter
    public String nombres;
    @Getter @Setter
    public String apellidos;
    @Getter @Setter
    public String direccion;
    @Getter @Setter
    public String dni;
    @Getter @Setter
    public String correo;


}

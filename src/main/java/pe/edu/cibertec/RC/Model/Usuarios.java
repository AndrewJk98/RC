package pe.edu.cibertec.RC.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Users")
@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public int id;
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

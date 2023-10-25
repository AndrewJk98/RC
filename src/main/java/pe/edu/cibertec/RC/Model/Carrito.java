package pe.edu.cibertec.RC.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cart")
@Entity
public class Carrito {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Getter @Setter
public int id;
@Getter @Setter
public String nombre;
@Getter @Setter
public String precio;
@Getter @Setter
public String descipcion;
@Getter @Setter
public String categoria;

}

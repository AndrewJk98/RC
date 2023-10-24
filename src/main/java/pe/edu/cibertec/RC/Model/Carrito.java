package pe.edu.cibertec.RC.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cart")
public class Carrito {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Getter @Setter
public long id;
@Getter @Setter
public String nombre;
@Getter @Setter
public String precio;
@Getter @Setter
public String descipcion;
@Getter @Setter
public String categoria;

}

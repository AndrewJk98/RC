package pe.edu.cibertec.RC.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class Carrito {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Getter @Setter
public String id;
@Getter @Setter
public String nombre;
@Getter @Setter
public String precio;
@Getter @Setter
public String descipcion;
@Getter @Setter
public String categoria;

}

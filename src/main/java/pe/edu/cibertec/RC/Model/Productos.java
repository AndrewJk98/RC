package pe.edu.cibertec.RC.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Products")
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public int ProductoId;
    @Getter @Setter
    public String NombreProducto;
    @Getter @Setter
    public String MarcaProducto;
    @Getter @Setter
    public String DetalleProducto;
    @Getter @Setter
    public String PrecioProducto;
    @Getter @Setter
    public String EstadoProducto;
    @Getter @Setter
    private String imagenProducto;

}

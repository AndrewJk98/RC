package pe.edu.cibertec.RC.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Products")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    public long ProductoId;
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

}

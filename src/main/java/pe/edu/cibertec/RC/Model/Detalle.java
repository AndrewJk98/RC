package pe.edu.cibertec.RC.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Detail")
@Entity
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long idDetalle;
    @Getter @Setter
    private int idVenta;
    @Getter @Setter
    private int idProducto;
    @Getter @Setter
    private String imagen;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private int cantidad;
    @Getter @Setter
    private double precio;
    @Getter @Setter
    private double subtotal;

}

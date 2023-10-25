package pe.edu.cibertec.RC.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Detail")
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

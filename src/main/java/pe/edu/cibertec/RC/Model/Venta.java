package pe.edu.cibertec.RC.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int idVenta;
    @Getter @Setter
    private Date fechaRegistro;
    @Getter @Setter
    private double montoTotal;
}

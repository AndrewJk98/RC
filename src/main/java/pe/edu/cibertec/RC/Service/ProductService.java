package pe.edu.cibertec.RC.Service;

import pe.edu.cibertec.RC.Model.Productos;

import java.util.List;

public interface ProductService {
    public List<Productos> Listado();
    public Productos findByProductId(int ProductoId);
    public Productos agregar(Productos productos);
    public Productos update(int ProductoId, Productos productos);
    public void delete(int ProductoId);
}

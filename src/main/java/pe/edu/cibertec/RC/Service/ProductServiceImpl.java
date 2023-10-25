package pe.edu.cibertec.RC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.RC.Model.Productos;
import pe.edu.cibertec.RC.Repository.ProductDao;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Productos> Listado() {
        return (List<Productos>) productDao.findAll();
    }

    @Override
    public Productos findByProductId(int ProductoId) {
        return productDao.findById(ProductoId).orElse(null);
    }

    @Override
    public Productos agregar(Productos productos) {
        return productDao.save(productos);
    }

    @Override
    public Productos update(int ProductoId, Productos productos) {
        Productos productosDB = productDao.findById(ProductoId).get();
        productosDB.setNombreProducto(productos.getNombreProducto());
        productosDB.setMarcaProducto(productos.getMarcaProducto());
        productosDB.setDetalleProducto(productos.getDetalleProducto());
        productosDB.setPrecioProducto(productos.getPrecioProducto());
        productosDB.setEstadoProducto(productos.getEstadoProducto());
        productosDB.setImagenProducto(productos.getImagenProducto());
        return productDao.save(productosDB);
    }

    @Override
    public void delete(int ProductoId) {
        Productos productosDB = productDao.findById(ProductoId).get();
        productDao.delete(productosDB);
    }
}

package pe.edu.cibertec.RC.Model;

public class Productos {
    public int ProductoId;
    public String NombreProducto;
    public String MarcaProducto;
    public String DetalleProducto;
    public String PrecioProducto;
    public String EstadoProducto;


    public Productos(int productoId, String nombreProducto, String marcaProducto,
                     String detalleProducto, String precioProducto, String estadoProducto) {
        ProductoId = productoId;
        NombreProducto = nombreProducto;
        MarcaProducto = marcaProducto;
        DetalleProducto = detalleProducto;
        PrecioProducto = precioProducto;
        EstadoProducto = estadoProducto;
    }

    public int getProductoId() {
        return ProductoId;
    }

    public void setProductoId(int productoId) {
        ProductoId = productoId;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return MarcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        MarcaProducto = marcaProducto;
    }

    public String getDetalleProducto() {
        return DetalleProducto;
    }

    public void setDetalleProducto(String detalleProducto) {
        DetalleProducto = detalleProducto;
    }

    public String getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        PrecioProducto = precioProducto;
    }

    public String getEstadoProducto() {
        return EstadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        EstadoProducto = estadoProducto;
    }
}

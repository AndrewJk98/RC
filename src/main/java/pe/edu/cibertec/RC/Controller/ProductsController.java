package pe.edu.cibertec.RC.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.edu.cibertec.RC.Model.Detalle;
import pe.edu.cibertec.RC.Model.Productos;
import pe.edu.cibertec.RC.Model.Venta;
import pe.edu.cibertec.RC.Repository.DetalleDao;
import pe.edu.cibertec.RC.Repository.ProductDao;
import pe.edu.cibertec.RC.Repository.VentaDao;

import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes({"carrito,","total"})
public class ProductsController {

    @Autowired
    private VentaDao ventaDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private DetalleDao detalleDao;

    @GetMapping("/index")
    public String Listado(Model model){

        model.addAttribute("productos", productDao.findAll());
        return"index";
    }

    @GetMapping("/agregar/{idproducto}")
    public String agregar(@PathVariable int ProductId , HttpSession session){

        Productos producto = productDao.findById(ProductId).orElse(null);
        if(producto != null){

            List<Detalle> carrito = getCarrito(session);

            boolean encontrado = actualizarCarrito(producto, carrito);

            if (!encontrado) {
                Detalle detalle = crearDetalle(producto);
                carrito.add(detalle);
            }

        }

        return "redirect:/index";

    }


    @GetMapping("/carrito")
    public String carrito(Model model, HttpSession session) {
        List<Detalle> carrito = getCarrito(session);
        double subtotal = calcularSubtotal(carrito);
        double precioEnvio = calcularPrecioEnvio(carrito);
        double descuento = calcularDescuento(carrito);
        double total = subtotal + precioEnvio - descuento;

        actualizarModelo(model, subtotal, precioEnvio, descuento, total);

        return "carrito";
    }
    @GetMapping("/pagar")
    public String realizarPagoYRegistrar(HttpSession session, Model model) {
        List<Detalle> carrito = getCarrito(session);
        double total = getTotal(session);

        Venta venta = crearVenta(total);
        ventaDao.save(venta);

        guardarDetallesVenta(carrito, venta);

        actualizarSesionCarritoYTotal(session, carrito, total);

        model.addAttribute("mensaje", "se realizo la venta.");

        return "carrito";
    }

    private void guardarDetallesVenta(List<Detalle> carrito, Venta venta) {
        for (Detalle detalle : carrito) {
            detalle.setIdVenta((venta.getIdVenta()));
            detalleDao.save(detalle);
        }
    }

    private void actualizarSesionCarritoYTotal(HttpSession session, List<Detalle> carrito, double total) {
        actualizarSesionCarritoYTotal(session,carrito,total);
        session.setAttribute("total", total);
    }

    private List<Detalle> getCarrito(HttpSession session) {
        return (List<Detalle>) session.getAttribute("carrito");
    }

    private boolean actualizarCarrito(Productos producto, List<Detalle> carrito) {
        for (Detalle detalle : carrito) {
            if (detalle.getIdProducto() == producto.getProductoId()) {
                detalle.setCantidad(detalle.getCantidad() + 1);
                detalle.setSubtotal(detalle.getCantidad() * detalle.getPrecio());
                return true;
            }
        }
        return false;
    }
    private Detalle crearDetalle(Productos producto) {
        Detalle detalle = new Detalle();
        detalle.setIdProducto((producto.getProductoId()));
        detalle.setDescripcion(producto.getDetalleProducto());
        detalle.setPrecio(Double.parseDouble(producto.getPrecioProducto()));
        detalle.setCantidad(1);
        detalle.setSubtotal(Double.parseDouble(producto.getPrecioProducto()));
        detalle.setImagen(producto.getImagenProducto());
        return detalle;
    }



    private double calcularSubtotal(List<Detalle> carrito) {
        return carrito.stream().mapToDouble(Detalle::getSubtotal).sum();
    }

    private double calcularPrecioEnvio(List<Detalle> carrito) {

        return 0.0;
    }

    private double calcularDescuento(List<Detalle> carrito) {

        return 0.0;
    }

    private Venta crearVenta(double total) {
        Venta venta = new Venta();
        venta.setFechaRegistro(new Date());
        venta.setMontoTotal(total);
        return venta;
    }

//joel hizo esto


    private void actualizarModelo(Model model, double subtotal, double precioEnvio, double descuento, double total) {
        model.addAttribute("subtotal", subtotal);
        model.addAttribute("precioEnvio", precioEnvio);
        model.addAttribute("descuento", descuento);
        model.addAttribute("total", total);
    }

    private double getTotal(HttpSession session) {
        return (double) session.getAttribute("total");
    }
}

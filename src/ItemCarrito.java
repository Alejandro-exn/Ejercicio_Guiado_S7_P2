public class ItemCarrito {

    // Asociación con Producto: se guarda la referencia, no se copian sus atributos
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String mostrarInformacion() {
        return producto.getNombre() + " x " + cantidad
                + " = $" + String.format("%.2f", calcularSubtotal());
    }
}
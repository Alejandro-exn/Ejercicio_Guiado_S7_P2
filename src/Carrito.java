import java.util.ArrayList;

public class Carrito {

    // Composición: el carrito crea y controla sus ítems
    private ArrayList<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        // Desafío: no se agregan cantidades menores o iguales a cero
        if (producto != null && cantidad > 0) {
            ItemCarrito item = new ItemCarrito(producto, cantidad); // creación interna
            items.add(item);
        }
    }

    public int obtenerCantidadItems() {
        return items.size();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public boolean eliminarItem(int posicion) {
        if (posicion >= 0 && posicion <= items.size() - 1) {
            items.remove(posicion);
            return true;
        }
        return false;
    }

    public String mostrarResumen() {
        if (items.isEmpty()) {
            return "El carrito está vacío.\nTotal: $0.00";
        }

        String resumen = "";
        for (int i = 0; i < items.size(); i++) {
            resumen += i + ". " + items.get(i).mostrarInformacion() + "\n";
        }
        resumen += "Total: $" + String.format("%.2f", calcularTotal());
        return resumen;
    }

    // Desafío adicional
    public ItemCarrito obtenerItemMayorSubtotal() {
        ItemCarrito mayor = null;
        for (ItemCarrito item : items) {
            if (mayor == null || item.calcularSubtotal() > mayor.calcularSubtotal()) {
                mayor = item;
            }
        }
        return mayor;
    }
}
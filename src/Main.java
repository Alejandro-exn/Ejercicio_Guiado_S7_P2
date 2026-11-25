public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("P01", "Mouse", 25.50);
        Producto p2 = new Producto("P02", "Teclado", 45.00);
        Producto p3 = new Producto("P03", "Audífonos", 37.00);

        Carrito carrito = new Carrito();


        System.out.println("=== CARRITO VACÍO ===");
        System.out.println("Ítems: " + carrito.obtenerCantidadItems());
        System.out.println(carrito.mostrarResumen());
        System.out.println();

        ItemCarrito prueba = new ItemCarrito(new Producto("T01", "Prueba", 10.00), 3);
        System.out.println("Subtotal de prueba (10 x 3): " + prueba.calcularSubtotal());
        System.out.println();


        carrito.agregarProducto(p1, 2);
        carrito.agregarProducto(p2, 1);
        System.out.println("=== DESPUÉS DE AGREGAR 2 PRODUCTOS ===");
        System.out.println("Ítems: " + carrito.obtenerCantidadItems());
        System.out.println(carrito.mostrarResumen());
        System.out.println();


        System.out.println("Total calculado: $" + String.format("%.2f", carrito.calcularTotal()));
        System.out.println("Total manual:    $91.00");
        System.out.println();


        carrito.agregarProducto(p3, 3);
        System.out.println("=== CON TRES PRODUCTOS ===");
        System.out.println(carrito.mostrarResumen());
        System.out.println();


        boolean eliminado = carrito.eliminarItem(1);
        System.out.println("Eliminar posición 1: " + eliminado);
        System.out.println(carrito.mostrarResumen());
        System.out.println();

        System.out.println("Eliminar posición 10: " + carrito.eliminarItem(10));
        System.out.println("Eliminar posición -1: " + carrito.eliminarItem(-1));
        System.out.println("Ítems: " + carrito.obtenerCantidadItems());
        System.out.println();


        System.out.println("=== DESAFÍO ===");
        carrito.agregarProducto(p2, 0);
        carrito.agregarProducto(p2, -5);
        System.out.println("Ítems después de intentar agregar cantidad 0 y -5: "
                + carrito.obtenerCantidadItems());


        ItemCarrito mayor = carrito.obtenerItemMayorSubtotal();
        if (mayor != null) {
            System.out.println("Ítem de mayor subtotal: " + mayor.mostrarInformacion());
        }


        System.out.println("Producto p2 sigue existiendo: " + p2.mostrarInformacion());
    }
}
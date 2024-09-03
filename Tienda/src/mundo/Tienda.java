/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: tienda
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;



class Tienda {
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;

    public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
        this.producto1 = p1;
        this.producto2 = p2;
        this.producto3 = p3;
        this.producto4 = p4;
    }

    // Retornar el nombre del producto más costoso
    public String productoMasCostoso() {
        Producto masCostoso = producto1;

        if (producto2.calcularPrecioFinal() > masCostoso.calcularPrecioFinal()) {
            masCostoso = producto2;
        }
        if (producto3.calcularPrecioFinal() > masCostoso.calcularPrecioFinal()) {
            masCostoso = producto3;
        }
        if (producto4.calcularPrecioFinal() > masCostoso.calcularPrecioFinal()) {
            masCostoso = producto4;
        }

        return masCostoso.getNombre();
    }

    // Retornar el nombre del producto más económico
    public String productoMasEconomico() {
        Producto masEconomico = producto1;

        if (producto2.calcularPrecioFinal() < masEconomico.calcularPrecioFinal()) {
            masEconomico = producto2;
        }
        if (producto3.calcularPrecioFinal() < masEconomico.calcularPrecioFinal()) {
            masEconomico = producto3;
        }
        if (producto4.calcularPrecioFinal() < masEconomico.calcularPrecioFinal()) {
            masEconomico = producto4;
        }

        return masEconomico.getNombre();
    }

    // Vender una cantidad de unidades del producto dado
    public boolean venderProducto(String nombreProducto, int cantidad) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            // Suponiendo que existe un método para manejar la venta y actualizar la cantidad (no implementado en la clase Producto actual)
            return true;
        }
        return false;
    }

    // Aumentar el inventario de un producto dado
    public void abastecerProducto(String nombreProducto, int cantidad) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            // Suponiendo que existe un método para aumentar la cantidad en inventario (no implementado en la clase Producto actual)
        }
    }

    // Retornar el nombre del producto con menor cantidad en bodega
    public String productoConMenorInventario() {
        // Este método depende de la implementación de inventario en la clase Producto, que no está presente actualmente.
        return null;
    }

    // Buscar el producto por su nombre
    private Producto buscarProducto(String nombre) {
        if (producto1.getNombre().equalsIgnoreCase(nombre)) {
            return producto1;
        } else if (producto2.getNombre().equalsIgnoreCase(nombre)) {
            return producto2;
        } else if (producto3.getNombre().equalsIgnoreCase(nombre)) {
            return producto3;
        } else if (producto4.getNombre().equalsIgnoreCase(nombre)) {
            return producto4;
        }
        return null;
    }
}


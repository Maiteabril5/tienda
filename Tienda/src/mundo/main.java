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

class Producto {
    private String nombre;
    private double precioBase;
    private String tipo;

    public Producto(String nombre, double precioBase, String tipo) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
    }

    public double calcularPrecioFinal() {
        double tasaIVA = 0;
        switch (tipo) {
            case "supermercado": tasaIVA = 0.04; break;
            case "droguería": tasaIVA = 0.12; break;
            case "papelería": tasaIVA = 0.16; break;
        }
        return precioBase * (1 + tasaIVA);
    }

    public String getDescripcion() {
        return nombre + " con precio final de $" + calcularPrecioFinal();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}

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
}

public class main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche", 3000, "supermercado");
        Producto p2 = new Producto("Loratadina", 2000, "droguería");
        Producto p3 = new Producto("Cuadernos", 5000, "papelería");
        Producto p4 = new Producto("Yogurt", 2500, "supermercado");

        Tienda tienda = new Tienda(p1, p2, p3, p4);

        System.out.println("Producto más costoso: " + tienda.productoMasCostoso());
        System.out.println("Producto más económico: " + tienda.productoMasEconomico());

        System.out.println(p1.getDescripcion());
        System.out.println(p2.getDescripcion());
        System.out.println(p3.getDescripcion());
        System.out.println(p4.getDescripcion());
    }
}

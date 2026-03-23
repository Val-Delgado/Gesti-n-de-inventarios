abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract double calcularPrecio();

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}

class Electronico extends Producto {
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularPrecio() {
        return precio * cantidad * 1.16;
    }
}

class Alimento extends Producto {
    public Alimento(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularPrecio() {
        return precio * cantidad * 0.9;
    }
}

class Ropa extends Producto {
    public Ropa(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularPrecio() {
        return precio * cantidad * 0.8;
    }
}

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Electronico("Laptop", 10000, 1);
        Producto p2 = new Alimento("Pan", 50, 10);
        Producto p3 = new Ropa("Camisa", 300, 2);

        Producto[] inventario = {p1, p2, p3};

        for (Producto p : inventario) {
            p.mostrarInfo();
            System.out.println("Total: " + p.calcularPrecio());
            System.out.println("-------------------");
        }
    }
}

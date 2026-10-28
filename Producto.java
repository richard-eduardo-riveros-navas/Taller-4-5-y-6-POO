package A;
class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + "stock: " + stock);
    }
}
class Prueba {
    public static void main(String[] args) {
        Producto p = new Producto("bluelabels", 22, 5);
        p.mostrarInfo();
    }
}

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
        Producto p = new Producto("bluelabel", 22, 5);
        System.out.println("El nombre es: "+p.nombre);
        System.out.println("El precio es: "+p.precio);
        System.out.println("El stock es: "+p.stock);
        p.mostrarInfo();
    }
}
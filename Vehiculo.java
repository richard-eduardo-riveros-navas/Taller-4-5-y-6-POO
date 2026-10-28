public class Vehiculo {
    String tipo;

    public void mostrarTipo() {
        System.out.println("Tipo de vehiculo es: " + tipo);
    }
}

class Moto extends Vehiculo {
    String marca;
}

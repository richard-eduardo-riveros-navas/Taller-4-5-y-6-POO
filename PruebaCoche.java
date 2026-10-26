class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        miCoche.acelerar(20);
        // miCoche.marca = "Honda";
        // String m = miCoche.modelo;
        // int v = miCoche.velocidadMaxima;
    }
}
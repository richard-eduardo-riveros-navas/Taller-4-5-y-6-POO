public class Estudiante {
    private String nombre;
    private int edad;
    private double notapromedio;

    public Estudiante(String nombre, int edad, double notapromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notapromedio = notapromedio;

    }

    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getnotapromedio() {
        return notapromedio;
    }

    void setnotapromedio(double notapromedio) {
        if (notapromedio >= 0) {
            this.notapromedio = notapromedio;
        }
    }

}
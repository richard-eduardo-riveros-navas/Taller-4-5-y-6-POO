class Estudiante{
    private String nombre;
    private int edad;
    private float notapromedio;

    public Estudiante(String nombre, int edad,float notapromedio) {
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

    public float getnotapromedio() {
        return notapromedio;
    }
    public void setnotapromedio(float notapromedio) {
       if (notapromedio >= 0) {
         this.notapromedio = notapromedio;
    }}}

public class Main {
    public static void main(String[] args) {
}
    Estudiante e = new Estudiante("Juan",23,4.5);
    System.out.println();
        }}
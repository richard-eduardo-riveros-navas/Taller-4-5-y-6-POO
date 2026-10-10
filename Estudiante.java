public class Estudiante{
    private String nombre;
    private int edad;
    private double notapromedio;

    public Estudiante(String nombre, int edad,double notapromedio) {
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
        }}


public static void main(String[] args) {
    Estudiante e = new Estudiante("Juan",23,4);
    System.out.println("El nombre del Estudiante es "+e.getnombre());
    System.out.println("El Estudiante tiene "+e.getedad()+" años");
    System.out.println("Su nota promedio es de "+e.getnotapromedio());

    Estudiante e2 = new Estudiante("Laura",29,3.5);
    System.out.println("El nombre del Estudiante es "+e2.getnombre());
    System.out.println("El Estudiante tiene "+e2.getedad()+" años");
    System.out.println("Su nota promedio es de "+e2.getnotapromedio());
    }}
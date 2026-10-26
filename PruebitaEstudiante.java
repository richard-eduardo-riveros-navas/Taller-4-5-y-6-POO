public class PruebitaEstudiante{
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
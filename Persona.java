public class Persona {
    private String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.edad = 30;
        System.out.println("Edad (acceso directo): " + p.edad);

        // p.nombre = "Carlos";

        p.setNombre("Carlos");
        System.out.println("Nombre (vía getter): " + p.getNombre());
    }
}

public class Empleado {
    protected String nombre;
    protected double salario;

}
class Gerente extends Empleado{
    String departamento;

    void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println(salario);
        System.out.println(departamento);
    }
}

void main() {
    Gerente g = new Gerente();
    g.nombre = "rich";
    g.salario = 200;
    g.departamento = "cucuta";
    g.mostrarInformacion();
}
package A;
public class vehiculo {
    protected String tipo;
    protected String marca;

    void mostrarinfo(){
        System.out.println("la marca es: "+marca+" y el tipo es: "+tipo);
    }

}

class moto extends vehiculo{
    double cilindrada;
}

package EJ02.vehiculos;
public class Bicicleta extends Vehiculo {
    //atributos
    private int pinones; //número de piñones;

    //constructor

    public Bicicleta(int p){
        super();
        this.pinones = p;
    }
    public void hazCaballito(){
        System.out.println("Estoy haciendo el caballito");
    }
}

package EJ02.vehiculos;
/*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra a
continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):*/
public abstract class Vehiculo {
    //atributos de clase
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    //atributos de instancia
    private int kilometrosRecorridos;

    //constructor
    public Vehiculo(){
        this.kilometrosRecorridos = 0;
    }
    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }
    public static int getKilometosTotales(){
        return Vehiculo.kilometrosTotales;
    }
    public void recorre(int k){
        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
    }
}

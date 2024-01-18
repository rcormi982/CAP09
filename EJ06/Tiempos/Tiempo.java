package EJ06.Tiempos;

public class Tiempo {
    private int segundos;
    //Constructor

    public Tiempo(int horas, int minutos, int segundos){
        this.segundos = (horas*3600) + (minutos*60) + segundos; 
    }
    @Override
    public String toString(){
        int segundos = this.segundos;
        int horas = segundos/3600;
        segundos -= horas * 3600;

        int minutos = segundos / 60;
        segundos -= minutos * 60;
        if (this.segundos < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        } else {
            return horas + "h " + minutos + "m " + segundos + "s";
        } 
    }
    public int getSegundos() {
        return segundos;
    }
    public Tiempo suma(Tiempo t){
        return new Tiempo(this.segundos + t.getSegundos(), segundos, segundos);
    }
    public Tiempo resta(Tiempo t){
        return new Tiempo(this.segundos - t.getSegundos(), segundos, segundos);
    }
}

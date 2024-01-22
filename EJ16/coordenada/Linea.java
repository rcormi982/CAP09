package EJ16.coordenada;

public class Linea {
    private Punto P1;
    private Punto P2;

    public Linea(Punto P1, Punto P2){
        this.P1 = P1;
        this.P2 = P2;
    }
    @Override
    public String toString() {
        return String.format("Linea formada por los puntos %s %s", this.P1, this.P2);
    }
    
}

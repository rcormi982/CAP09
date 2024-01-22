package EJ17.figuras;

public class Piramide {
    private int altura;
    private static int piramidesCreadas;

    public Piramide(int altura){
        this.altura = altura;
        piramidesCreadas++;
    }
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
    @Override
    public String toString() {
        String cadena ="";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                cadena += " ";
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                cadena += "*";
            }
            cadena +="\n";
        }
        return cadena;
    }
}

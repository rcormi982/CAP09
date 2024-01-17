package EJ03;
import EJ03.animales.Lagarto;
import EJ03.animales.Perro;
import EJ03.animales.Pinguino;
import EJ03.animales.Sexo;

public class PruebaAnimales {
    public static void main(String[] args) {
        Pinguino tux = new Pinguino(Sexo.MACHO);
        tux.come("palomitas");

        Perro laika = new Perro(Sexo.HEMBRA);
        laika.duerme();
        laika.dameLaPata();
        laika.amamanta();
        laika.cuidaCrias();

        Lagarto godzilla = new Lagarto(Sexo.MACHO);
        godzilla.tomaElSol();
        godzilla.duerme();
    }
}

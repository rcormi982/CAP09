package EJ03.animales;

public class Perro extends Mamifero {
    //Constructor
    public Perro(){
        super(Sexo.HEMBRA);
    }
    public Perro(Sexo s){
        super(s);
    }
    public void ladra() {
        System.out.println("Guau guau");
    }
    public void dameLaPata() {
        System.out.println("Toma mi patita");
    }
    public void caza() {
        System.out.println("Estoy cazando perdices");
    }
}

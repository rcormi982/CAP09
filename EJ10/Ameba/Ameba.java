package EJ10.Ameba;

public class Ameba {
    private int peso;

    //Constructor
    public Ameba(){
        this.peso = 3;
    }
    public void come(int pesoComida){
        this.peso += pesoComida - 1;
    }
    public void come(Ameba a){
        this.peso += a.peso - 1;
        a.peso = 0; //la ameba comida se queda sin sustancia
    }
    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos";
    }
}

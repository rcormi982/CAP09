package EJ03.animales;

public class Lagarto extends Animal {
    //Constructor

    public Lagarto(){
        super();
    }

    public Lagarto (Sexo s){
        super(s);
    }
    public void tomaElSol() {
        System.out.println("Estoy tomando el Sol");
    }
    public void baniate() {
        System.out.println("Me estoy dando un chapuzón");
    }
    public void escondete() {
        System.out.println("Me he escondido, ya no me puedes ver");
    }
}

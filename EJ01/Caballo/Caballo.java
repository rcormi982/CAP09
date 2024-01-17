package EJ01.Caballo;
public class Caballo {
    private String nombre;//privadas para tener un getter y un setter 
                          //que se hacen para que las clases hijas o instancias puedan acceder
    private String color;
    private int edad;
    private int carrerasGanadas;

    //constructor

    public Caballo (String n, String c, int e, int cg){
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.carrerasGanadas = cg;
    }
    
    //método getter

    public String getNombre(){
        return this.nombre;
    }
    public void cabalga(){
        System.out.println("Tocotoc tocotoc tocotoc");
    }
    public void relincha(){
        System.out.println("Hiiiiiiieeeeee");
    }
    public void rumia(){
        System.out.println("Ñam ñam ñam");
    }
}

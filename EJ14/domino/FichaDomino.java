package EJ14.domino;

public class FichaDomino {
    private int izqda;
    private int drcha;

    public FichaDomino(int izqda, int drcha){
        this.izqda = izqda;
        this.drcha = drcha;
    }

    public FichaDomino voltea(){
        int aux = izqda;
        izqda = drcha;
        drcha = aux;
        return this;
    }

    public boolean encaja(FichaDomino f){
        return f.izqda == this.drcha || f.drcha == this.izqda || f.izqda == this.izqda || f.drcha == this.drcha;
    }
    @Override
    public String toString() {
        return String.format("[%s|%s]", this.izqda!=0?this.izqda:" ", this.drcha!=0?this.drcha:" ");
    }
}

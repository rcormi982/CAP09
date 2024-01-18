package EJ04.fraccion;
public class Fraccion{
    private int signo;
    private int numerador;
    private int denominador;

    //Constructor
    public Fraccion(int n, int d){
        if(d == 0){
            System.out.println("Una fracción no puede tener como denominador el número 0");
        } else {
            if(n * d < 0){
                this.signo = -1;
            }else{
                this.signo = 1;
            }

            this.numerador = Math.abs(n);
            this.denominador = Math.abs(d);
        }
    }
    public int getNumerador(){
        return this.numerador;
    }
    public int getDenominador(){
        return this.denominador;
    }
    public String toString(){
        if(signo == -1){
            return "-" + this.numerador + "/" + this.denominador;
        }else{
            return this.numerador + "/" + this.denominador;
        }
    }
    public Fraccion invierte(){
        return new Fraccion(this.signo*this.denominador, this.numerador);
    }
    public Fraccion multiplica(int n){
        return new Fraccion(this.signo*this.numerador*n, this.denominador); 
    }
    public Fraccion multiplica(Fraccion f){
        return new Fraccion(this.signo*this.numerador*f.getNumerador(), this.denominador*f.getDenominador());
    }
    public Fraccion divide(int n){
        return new Fraccion(this.signo*this.numerador, this.denominador*n);
    }
    public Fraccion divide(Fraccion f){
        return new Fraccion(this.signo*this.numerador*f.getDenominador(), this.denominador*f.getNumerador());
    }
    public Fraccion simplifica(){
        int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;

        for (int i = 2; i < Math.min(n, d); i++) {
            while (((n % i) == 0) && ((d % i ) == 0)) {
                n /=1;
                d /=1;  
            }
        }
        return new Fraccion(s*n, d);
    }
}  


package EJ03.animales;
/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/

public abstract class Animal {
    //atributo
    private Sexo sexo;
    //constructor
    public Animal (){
        this.sexo = Sexo.MACHO;
    }
    public Animal (Sexo s){
        this.sexo = s;
    }
    public Sexo getSexo(){
        return this.sexo;
    }
    public void duerme(){
        System.out.println("Zzzzzz");
    }
    public void come(String comida){
        System.out.println("Estoy comiendo " + comida);
    }
}

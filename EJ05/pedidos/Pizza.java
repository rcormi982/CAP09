package EJ05.pedidos;

public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private String tamaño;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamaño){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "Pedida";
        totalPedidas++;
    }
    public static int getTotalPedidas() {
        return totalPedidas;
    }
    public static int getTotalServidas() {
        return totalServidas;
    }
    public void sirve(){
        if(this.estado.equals("pedida")){
            this.estado = "servida";
            totalServidas++;
        }else{
            System.out.println("esa pizza ya se ha servido");
        }
    }
    @Override
    public String toString() {
        return String.format("Pizza %s %s, %s", this.tipo, this.tamaño, this.estado);
    }
}

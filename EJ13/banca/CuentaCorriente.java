package EJ13.banca;

import EJ11.utilidades.NumeroAleatorio;

public class CuentaCorriente {
    private String numero;
    private double saldo;

    public CuentaCorriente(){
        this.saldo = 0;
        this.numero = NumeroAleatorio.obtenNumero(10);
    }
    public CuentaCorriente(double saldo){
        this.saldo = saldo;
        this.numero = NumeroAleatorio.obtenNumero(10);
    }
    public void ingreso(double cantidad){
        this.saldo +=cantidad;
    }
    public void cargo(double cargo){
        this.saldo -=cargo;
    }
    public void transferencia(CuentaCorriente otra, double importe){
        this.cargo(importe);
        otra.ingreso(importe);
    }
    @Override
    public String toString() {
        return String.format("Número de cuenta: %s Saldo: %.2f €", this.numero, this.saldo);
    }
}

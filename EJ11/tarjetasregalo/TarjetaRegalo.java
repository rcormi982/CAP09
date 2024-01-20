package EJ11.tarjetasregalo;

import EJ11.utilidades.NumeroAleatorio;

public class TarjetaRegalo {
    private String numero;
    private double fondo;
    //Constructor

    public TarjetaRegalo(double fondoInicial){
        this.fondo = fondoInicial;
        this.numero = "";
        this.numero = NumeroAleatorio.obtenNumero(5);
    }

    public void gasta(double importe) throws NotEnoughFundException{
        if(importe >this.fondo){
            throw new NotEnoughFundException(importe);
        }
        this.fondo -=importe;
    }
    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo ret = new TarjetaRegalo(this.fondo + t.fondo);
        this.fondo = 0;
        t.fondo = 0;
        return ret;
    }
    @Override
    public String toString() {
        return String.format("Tarjeta nº %s - Saldo %.2f",this.numero, this.fondo);
    }
}

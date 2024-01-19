package EJ09.Moviles;

import java.text.DecimalFormat;

import EJ08.Terminal.Terminal;

public class Movil extends Terminal {
    private String tarifa;
    private double totalTarificado;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.totalTarificado = 0;
    }
    @Override
    public void llama(Terminal t, int segundosDeLlamada){
        super.llama(t, segundosDeLlamada);
        double minutos = (double)segundosDeLlamada/60;
        switch (this.tarifa) {
            case "rata":
                this.totalTarificado += 0.06 * minutos;
                break;
            case "mono":
                this.totalTarificado += 0.12 * minutos;
                break;
            case "bisonte":
                this.totalTarificado += 0.30 * minutos;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.getNumero() + " - " + this.getTiempoDeConversacion() + "s de conversación - tarificados "
        + formatoEuros.format(this.totalTarificado) + " euros";
    }
    
}

import datos.CreditoData;
import negocio.Entropia;
import negocio.Tabla;

public class Main {
    public static void main(String[] args) {
        Entropia ent = new Entropia();
        Tabla tb = new Tabla();
        CreditoData cd = new CreditoData();
        tb.setCabecera(cd.getHead());
        tb.setValores(cd.getValues());
        tb.setM(cd.getMatriz());
        tb.mostrarMatriz();
        System.out.println(ent.obtenerCantidadCasosFavorables(tb.getM()));
    }
}
package negocio;

public class Entropia {
    private double entropiaGlobal;

    public double getEntropiaGlobal() {
        return entropiaGlobal;
    }

    public void setEntropiaGlobal(int sizeTable,int casosFavorables,int casosDesfavorables) {
        this.entropiaGlobal = entropiaGlobal;
    }
    public int obtenerCantidadCasosFavorables(int[][] matriz){
        int contidadCasosFavorables = 0;
//        for (int i = 0; i < matriz.length; i++) {
//
//        }
        int minMay[] = this.obtenerMinYMay(matriz);
        return minMay[0];
    }

    public int obtenerCantidadCasosDesfavorables(int[][] matriz){

        return 0;
    }
    private int[] obtenerMinYMay(int[][] matriz){
        int[] valoresMinMay = {1,0};
        return  valoresMinMay;
    }
}

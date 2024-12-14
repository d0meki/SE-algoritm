package negocio;

public class Tabla {
    private String cabecera [];
    private String valores [];
    private int M[][];

    public Tabla() {
        //tomar como el numero de columnas como base la cantidad de elementos de la cabecera
        //para el numero de filas tomar en cuenta la cantidad de objetos de los valores
    }

    public String[] getCabecera() {
        return cabecera;
    }

    public void setCabecera(String[] cabecera) {
        this.cabecera = cabecera;
    }

    public String[] getValores() {
        return valores;
    }

    public void setValores(String[] valores) {
        this.valores = valores;
    }

    public int[][] getM() {
        return M;
    }

    public void setM(int[][] m) {
        M = m;
    }
    public void mostrarMatriz(){
//        System.out.println(M.length);
        for (int i = 0; i <this.M.length ; i++) {
            for (int j = 0; j < this.cabecera.length ; j++) {
                System.out.print(this.valores[this.M[i][j]] + ", ");
            }
            System.out.println(" ");
        }
    }
}

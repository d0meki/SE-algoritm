package datos;

public class CreditoData {
    private  String head[] = {"moroso","antiguedad","ingresos","trabajo","credito"};
    private String values[] = {"si","no",">5","<1","1-5","600-1200",">1200","<600","tiene","no tiene","rechazado","aceptado"};
    private int Matriz[][] =
            {
                    {0,2,5,8,10},
                    {1,3,5,8,11},
                    {0,4,6,8,10},
                    {1,2,6,9,11},
                    {1,3,6,8,11},
                    {0,4,5,8,10},
                    {1,4,6,8,11},
                    {1,3,7,8,10},
                    {1,2,4,9,10},
                    {0,4,7,9,10}
            };

    public CreditoData() {
        System.out.println("Carga de datos cone xito");
    }

    public String[] getHead() {
        return head;
    }

    public String[] getValues() {
        return values;
    }

    public int[][] getMatriz() {
        return Matriz;
    }
}

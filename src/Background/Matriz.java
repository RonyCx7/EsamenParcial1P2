package Background;
import Background.Random;

public class Matriz {
    //definir matriz
    private static String[][] ma = new String[8][11];
    public static void ImprimirDecorado(){
        for (int x=0; x<ma.length; x++){
            System.out.print("|");
            for(int y=0; y<ma[x].length; y++) {
                System.out.print(ma[x][y]);
                if (y != ma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    //llenar matriz
    public void CargarMatriz(){
        if()

    }
    //Definicion de estructura
    public static void Estructura(){
        ma[0][0]= "    "; ma[0][1]= "    "; ma[0][2]= "    "; ma[0][3]= "    "; ma[0][4]= "    ";ma[0][5]= "    ";ma[0][6]= "Comis";ma[0][7]= "    ";ma[0][8]= "    ";ma[0][9]= "BONO ";ma[0][10]= "    ";
        ma[1][0]= "Nombr";
        ma[2][0]= "Rony ";
        ma[3][0]= "Juan ";
        ma[4][0]= "Pedro";
        ma[5][0]= "Diego";
        ma[6][0]= "Carlo";
        ma[7][0]= "Total";
        ImprimirDecorado();
    }
    //imprimir matriz

}

package Background;

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

    //Definicion de estructura
    public static void Estructura(){
        ma[0][0]= "    "; ma[0][1]= "    "; ma[0][2]= "    "; ma[0][3]= "    "; ma[0][4]= "    ";
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
    //imprimir matriz
    //llenar matriz
}

package Background;

public class Random {
    public int Rango(int x, int y){
        int Inicio = x;
        int Final = y;
        //Parece que siempre hay que inciar una variable cuando vamos a usar numeros aleatorios sino solo da el utlimodato.
        int aleatorio = (int) (Math.random() * Final + Inicio);
        return aleatorio;
    }
}

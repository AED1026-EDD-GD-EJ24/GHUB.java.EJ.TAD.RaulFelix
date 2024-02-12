package miPrincipal;

public class Matriz {
    private int n,m;
    private int matriz[][];
    public Matriz(){
        matriz=new int[10][10];
        n=10;
        m=10;
    }
    public Matriz (int n,int m){
        matriz =new int[n][m];
        this.n=n;
        this.m=m;
    }
    public void asignarMatriz(int r,int c, int valor){
        matriz[r][c]=valor;
        }
        public int infoMar(int r, int c){
            return matriz[r][c];
        }
        public int filasMat(){
            return n;
        }
        public int columnasMat(){
            return m;
        }
        
}

package miPrincipal;

public class APPMatriz {
    public static void menu(){

    
    System.out.println("*************************");
            System.out.println("Operaciones con Matrices");
            System.out.println("*************************");
            Matriz m=new Matriz(2,3);
            m.asignarMatriz(0,0,5);
            System.out.printIn("valor del elemento posicion 0,0="+m.infoMat(0,0));
            System.out.println("Filas - "+m.filasMat());
            System.out.println("Columnas - "+m.columnasMat());
            Matriz m1=new Matriz(3,3);
            m1.asignarMatriz(3, 1, 10);
 
}
}
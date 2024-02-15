package miPrincipal;
public class APPMatriz{
    public static void menu() throws PosicionIlegalException {
        System.out.println("========================");
        System.out.println("Operaciones con Matrices");
        System.out.println("========================");
        Matriz m = new Matriz(2,3);
        m.asignarMatriz(0, 0, 5);
        System.out.println("Valor del elemento posicion 0,0="
                         +m.infoMat(0, 0));
        System.out.println("Filas = "+m.filasMat());
        System.out.println("Columnas ="+m.columnasMat());

        Matriz m1 = new Matriz(3,3);
        m1.asignarMatriz(0,0,1);
        m1.asignarMatriz(0,1,2);
        m1.asignarMatriz(0,2,3);
        m1.asignarMatriz(1,0,10);
        m1.asignarMatriz(1,1, 20);
        m1.asignarMatriz(1,2, 30);
        m1.asignarMatriz(2,0, 100);
        m1.asignarMatriz(2,1, 200);
        m1.asignarMatriz(2,2, 300);

        System.out.println("Valor del elemento posicion 2,2="
                         +m1.infoMat(2, 2));
        System.out.println("Filas = "+m1.filasMat());
        System.out.println("Columnas ="+m1.columnasMat());
        //m1.infoMat(2, 3); //Esto debe marca un error porque la columan 3 es inválidacllea
        
        
    }
    
    

}
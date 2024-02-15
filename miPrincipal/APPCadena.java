package miPrincipal;
public class APPCadena{
    public static void menu() throws PosicionIlegalException {
        System.out.println("========================");
        System.out.println("Operaciones con Cadenas ");
        System.out.println("========================");
        Cadena c = new Cadena();
        c.agregarFinal('M');
        c.agregarFinal('a');
        c.agregarFinal('r');
        c.agregarFinal('i');
        c.agregarFinal('a');
        System.out.println("Valor de cadena c ="+c.toString());
        System.out.println("Valor de cadena c invertida ="+c.invertir());
        c.borrarInicio();
        System.out.println("Valor de cadena c ="+c);
        System.out.println("Valor de cadena c invertida ="+c);
       
    }
 
}
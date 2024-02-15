package miPrincipal;
public class Cadena {
    private final int TOPE=80;
    private char cadena[] = new char[TOPE];
    private int tamanio = 0;
    public Cadena(){
        tamanio=0;
    }
    public void agregarFinal (char c) throws PosicionIlegalException{
        if(tamanio>=TOPE)
        {
            throw new PosicionIlegalException();
        }
    }
    public Cadena(char[] cadena){
        this.cadena=cadena;
    }
    
    public void borrarInicio(){
        for(int i=0;i<=tamanio;i++){
            cadena[i]=cadena[i+1];
        }
        tamanio--;

    }
    public boolean vacia(){
        return (tamanio==0);
    }
    public boolean llena(){
        return (tamanio==TOPE);
    }
    public Cadena invertir() throws PosicionIlegalException{
        Cadena invertida = new Cadena();
        for(int i=tamanio-1;i>=0;i--){
            invertida.agregarFinal(cadena[i]);
        }
        return invertida;

    }
    @Override
    public String toString(){
        String cadenita="";
        for(int i=0;i<=tamanio;i++){
            cadenita=cadenita+cadena[i];
        }
        return cadenita;
    }

    
}
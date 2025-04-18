public class Manecilla{
    private int LIM;
    private int valor;
    //metodo constructor que inicializa el limite
    public Manecilla(int lim){
        LIM =lim;
        valor = 0;
    }
    
    //constructor que iniciliza el limite y el valor
    public Manecilla(int lim, int val){
        LIM = lim;
        valor = val % LIM;
    }

    //metodos de acceso
    public int getLimite(){
        return LIM;
    }
    public int getValor(){
        return valor;
    }
    //metodos de manipulacion
    public void setValor(int val){
        valor = val % LIM;
    }
    public int incrementa(){
        valor = (valor + 1) % LIM;
        return (valor ==0) ? 1 : 0;
    }
}
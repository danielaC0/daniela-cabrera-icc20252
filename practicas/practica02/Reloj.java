public class Reloj {
    private Manecilla horas;
    private Manecilla minutos;
    private Manecilla segundos;

    //constructor
    public Reloj(int limH, int limM, int limS){
        horas = new Manecilla(limH);
        minutos = new Manecilla(limM);
        segundos = new Manecilla(limS);
    }

    //limites y valor inicial de las manecillas
    public Reloj (int limH, int limM, int limS,int hrs, int mins,int segs){
        horas = new Manecilla(limH, hrs);
        minutos = new Manecilla (limM, mins);
        segundos = new Manecilla(limS, segs);
    }

    //metodos de manipukacion de la clase reloj
    public void setvalor (int hrs, int mins, int segs){
        horas.setValor(hrs);
        minutos.setValor(mins);
        segundos.setValor(segs);
    }
    //metodos de manipulacion
    public void incrementa(){
        if(segundos.incrementa() == 1){
            minutos.incrementa();
            if(minutos.incrementa() == 1){
                horas.incrementa();
            }
        }

    }
    @Override
    public String toString(){
        int h = (horas != null) ? horas.getValor() :0;
        int m = (minutos != null) ? minutos.getValor() : 0;
        int s = (segundos != null ? segundos.getValor() :0);
        String hh = String.format("%02d", h);
        String mm = String.format ("%02d", m);
        String ss = String.format("%02d", s);
        return(hh + ":" + mm + ":" + ss);
    }
    public void muestra(){
        System.out.println(this.toString());
    }
}

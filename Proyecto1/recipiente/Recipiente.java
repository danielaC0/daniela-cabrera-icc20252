package recipiente;

import interfaz.ServiciosRecipiente;

public class Recipiente implements ServiciosRecipiente {
    //atributos privados
    private double radio;
    private double altura;
    private double cantidadLiquido;

    //metodo constructor
    public Recipiente(double radio, double altura, double cantidadLiquido){
        this. radio = radio;
        this.altura = altura;
        this.cantidadLiquido = Math.min(cantidadLiquido, capacidad());
    }

    //metodos getter y setter
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getCantidadLiquido(){
        return cantidadLiquido;
    }

    public void setCantidadLiquido(double cantidadLiquido){
        this.cantidadLiquido = cantidadLiquido;
    }
    //metodo para calcular la capacidad maxima
    @Override
    public double capacidad(){
        return Math.PI * Math.pow(radio,2) *  altura;
    }

    //metodo para calcular la capcidad resatnte del recipiente
    @Override
    public double capacidadRestante(){
        return capacidad() - cantidadLiquido;
    }

    //metodod que verifica si el recipiente esta vacio
    @Override
    public boolean estaVacio(){
        return cantidadLiquido ==0;
    }

    //metodo que verifica si el recipiete esta lleno
    @Override
    public boolean estaLleno(){
        return cantidadLiquido == capacidad();
    }

    //metodo que rellena el recipiente
    @Override
    public double rellena(double cantidad){
        double espacioDisponible = capacidadRestante();
        if(cantidad <= espacioDisponible){
            cantidadLiquido += cantidad;
            return 0;
        }else{
            cantidadLiquido = capacidad();
            return cantidad - espacioDisponible;
        }
    }

    //metodo para vaciar el recipiente
    @Override
    public double vacia(){
        double cantidadVaciada = cantidadLiquido;
        cantidadLiquido = 0;
        return cantidadVaciada;
    }

    //metodo para verter el liquido en otro recipiente
    @Override
    public void vierte(Recipiente otro){
        double excedente = otro.rellena(cantidadLiquido);
        cantidadLiquido = excedente;
    }

    //metodo que compara si dos recipientes tiene las mismas dimensiones 
    @Override
    public boolean mismasDimensiones(Recipiente otro){
        return this.radio == otro.radio && this.altura == otro.altura;
    }

    //metodo que compara si dos dimensiones tienen la misma capacidad 
    @Override
    public boolean mismaCapacidad(Recipiente otro){
        return this.capacidad() == otro.capacidad();
    }

    //metodo que compara si un recipiente tiene mas liquidoque otro
    @Override 
    public boolean contieneMas(Recipiente otro){
        return this.cantidadLiquido > otro.cantidadLiquido;
    }
    
    //metodo cabeMas
    @Override
    public boolean cabeMas(Recipiente otro){
        return this.capacidadRestante() > otro.capacidadRestante();
    }
    //m etodo que craa un nuevo recipente
    //recipiente vacio con capacidad igual a la cantidad actual
    @Override 
    public Recipiente crearContenedor(){
        double nuevaAltura = cantidadLiquido /Math.PI * Math.pow(radio,2);
        return new Recipiente(radio,nuevaAltura, 0);
    }

    //metodo que muestra la indormacion del reipiente
    @Override
    public String muestra(){
        return "Recipiente [Radio: " + radio +
           ", Altura: " + altura +
           ", Capacidad Máxima: " + capacidad() +
           ", Cantidad de Líquido: " + cantidadLiquido + "]";
    }
}

package interfaz;

import recipiente.Recipiente;

public interface ServiciosRecipiente {
    //metodos de capacidad
    public double capacidad();
    public double capacidadRestante();
    //metodos de estado
    public boolean estaVacio();
    public boolean estaLleno();
    //metodos que manipilan el liquido
    public double rellena(double cantidad);
    public double vacia();
    public void vierte(Recipiente otro);
    //metodos que comparan
    public boolean mismasDimensiones(Recipiente otro);
    public boolean mismaCapacidad(Recipiente otro);
    public boolean contieneMas(Recipiente otro);
    public boolean cabeMas(Recipiente otro);
    //metodo que crea un nuevo recipiente
    public Recipiente crearContenedor();
    //metodo que muestra la informacion del recipiente
    public String muestra();
}    
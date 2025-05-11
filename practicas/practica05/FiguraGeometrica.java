public abstract class FiguraGeometrica{
    protected double base;
    protected double altura;

    public FiguraGeometrica(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calculoPerimetro();
    public double calculoArea();
    //metodo toString()
    @Override
    //metodo abstracto por ser figuras distintas 
    public abstract String toString();
}
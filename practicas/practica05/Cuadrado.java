public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(double lado){
        super(lado,lado);
    }
    @Override
    public double calculoArea(){
        return base * base;
    }
    @Override 
    public double calculoPerimetro(){
        return 4 * base;
    }
    @Override
    public String toString(){
        return "Medida de los lados del cuadrado: " + base;
    }
}

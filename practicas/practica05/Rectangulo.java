public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(double base, double altura){
        super(base,altura);
    }
    @Override
    public double calculoArea(){
        return base * altura;
    }
    @Override
    public double calculoPerimetro(){
        return 2 * (base + altura);
    }
    @Override
    public String toString(){
        return "Lados del rectangulo: base = " + base + " ,altura = " + altura;
    }
}

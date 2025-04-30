public class Triangulo extends FiguraGeometrica{
    private double ladoA;
    private double ladoB;

    public Triangulo(double base, double altura, double ladoA, double ladoB){
        super(base,altura);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    @Override
    public double calculoArea(){
        return (base * altura)/2;
    }
    public double calculoPerimetro(){
        return(ladoA + ladoB + base);
    }
    @Override
    public String toString(){
        return "Lados del triangulo: base = " + base + " ,lado A = " + ladoA + " ,lado B = " + ladoB + " ,altura = " + altura;
    }
}

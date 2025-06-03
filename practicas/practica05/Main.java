public class Main{
    public static void main(String []args){
        //crando un triangulo de dos maneras
        Triangulo triangulo1 = new Triangulo(4,5,6,7);
        FiguraGeometrica triangulo2 = new Triangulo(6,5,4,3);

        //creando cuadrado y rectangulo
        Rectangulo rectangulo = new Rectangulo(4,8);
        Cuadrado cuadrado = new Cuadrado(4);

        //mostrar datos de traingulos
	System.out.println("\n ***TRIANGULO***");
        System.out.println(triangulo1);
        System.out.println("Area: " + triangulo1.calculoArea());
        System.out.println("Perimetro: " + triangulo1.calculoPerimetro());
        System.out.println(triangulo2);
        System.out.println("Area; " + triangulo2.calculoArea());
        System.out.println("Perimetro: " + triangulo2.calculoPerimetro());

        //mostrar datos rectangulo 
	System.out.println("\n ***RECTANGULO***");
        System.out.println(rectangulo);
        System.out.println("Area: " + rectangulo.calculoArea());
        System.out.println("Perimetro: " + rectangulo.calculoPerimetro());

        //mostrar datos cuadrado
	System.out.println("\n ***CUADRADO***");
        System.out.println(cuadrado);
        System.out.println("Area: " + cuadrado.calculoArea());
        System.out.println("Perimetro: " + cuadrado.calculoPerimetro());

    }
}

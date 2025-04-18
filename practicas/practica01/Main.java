import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int operacion = 0;
        double num1 = 0, num2 = 0;
        String nombre = "";

        System.out.println("Introduce tu nombre:");
        nombre = entrada.nextLine();
        //menu
        System.out.println("CALULADORA");
        System.out.println("***Operaciones***");
        System.out.println("Seleccione el numero que correspnde a cada operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Multiplicacion");
        System.out.println("3.Division");
        System.out.println("Ingrese el numero de la opcion: ");
        operacion = entrada.nextInt();

        if(operacion == 0){
            System.out.println("Ingresa una opcion valida");
        }

        System.out.println("Ingrese el primer numero:");
        num1 =entrada.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2 =entrada.nextDouble();
        
        //operaciones
        switch(operacion){
            case 1:
            System.out.println("El resultado de la suma es: " + (num1+num2));
            break;
            case 2:
            System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
            break;
            case 3:
            if (num2 ==0){
                System.out.println("No se puede realizar la operacion");
            }else{
                System.out.println("El resultado de la division es: " + (num1 /num2));
            }
            break;

        }

        System.out.println("Gracias por usar el programa " + nombre);

        //cerramos el metodo Scanner
        entrada.close();
        
    }
} 

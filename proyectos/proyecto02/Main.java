import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Esteganografia est = new Esteganografia();
        int opcion = 0;
        String mensaje, nombre, m, e;
        int n;

        //menu
        while(opcion!=6){
            System.out.println("***MENU***");
            System.out.println("1.descifraNulo");
            System.out.println("2.descifraNulo(String original)");
            System.out.println("3.contieneNombre");
            System.out.println("4.descrifraPalabrasMarcadas");
            System.out.println("5.descifraLetrasMarcadas");
            System.out.println("6.Salir del menu");
            opcion = Integer.parseInt(entrada.nextLine());

            switch(opcion){
                case 1:
                System.out.println("Ingresa el mensaje:");
                mensaje = entrada.nextLine();
                System.out.println("Ingresa el indice (n):");
                n = Integer.parseInt(entrada.nextLine());
                System.out.println("\nMensaje oculto:" + est.descifraNulo(mensaje, n));
                System.out.println("\n------------------------------------------------");
                break;

                case 2:
                System.out.println("Ingresa el mensaje:");
                mensaje = entrada.nextLine();
                System.out.println("\nMensaje oculto:" + est.descifraNulo(mensaje));
                System.out.println("\n------------------------------------------------");
                break;

                case 3:
                System.out.println("Ingresa el mensaje:");
                mensaje = entrada.nextLine();
                System.out.println("Ingresa el nombre:");
                nombre = entrada.nextLine();
                System.out.println("\nEl mensaje esta contenido? " + est.contieneNombre(mensaje, nombre));
                System.out.println("\n------------------------------------------------");
                break;

                case 4:
                System.out.println("Ingresa el mensaje original:");
                m = entrada.nextLine();
                System.out.println("Ingresa el mensaje con palabras marcadas:");
                e = entrada.nextLine();
                System.out.println("\nMensaje oculto:" + est.descifraPalabrasMarcadas(m, e));
                System.out.println("\n------------------------------------------------");
                break;

                case 5:
                System.out.println("Ingresa el mensaje origianl: ");
                m= entrada.nextLine();
                System.out.println("Ingresa el mensaje con letras especiales: ");
                e = entrada.nextLine();
                System.out.println("\nMensaje oculto " + est.descifraLetrasMarcadas(m, e));
                System.out.println("\n------------------------------------------------");
                break;

                case 6:
                System.out.println("Saliendo del Menu...");
                break;

                default:
                System.out.println("Opcion invalida");
            }
        }
        entrada.close();
    }
}

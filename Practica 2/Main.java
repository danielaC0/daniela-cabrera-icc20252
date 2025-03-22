public class Main {
    public static void main(String args[]){
        //declaracion de variable tipo reloj
        Reloj reloj;
        //inicilizamos el reloj a las 10:19
        reloj = new Reloj(24,60,60,10,19,11);
        //mostrando el estado inicial del reloj
        System.out.println("Hora inicial: " + reloj);
        //prueba usando for
        System.out.println("\nPrueba con bucle for");
        for(int i =0; i <5; i++){
            reloj.incrementa();
            System.out.println("Tiempo " + reloj);
        }
        //prueba con while
        System.out.println("\nPrueba con bucle while");
        int contador = 0;
        while(contador <5){
            reloj.incrementa();
            System.out.println("Tiempo: " + reloj);
            contador++;
        }

        //reiniciamos el reloj a una nueva hora
        reloj.setvalor(11,23,44);
        System.out.println("\nReiniciando el reloj a las 11:23..." + reloj);

        //prueba usando do -while
        System.out.println("\nPrueba con bucle do - while");
        contador = 0;
        do{
            reloj.incrementa();
            System.out.println("Tiempo: " + reloj);
            contador++;
        }while(contador < 5);

    }
}
    


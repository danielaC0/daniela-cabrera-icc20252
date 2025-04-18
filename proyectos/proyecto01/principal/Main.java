package principal;

import recipiente.Recipiente;

public class Main {
    public static void main(String args[]){
        //prueba de la clase recipiente
        //recipientes de prueba
       Recipiente recipiente1 = new Recipiente(6,12,10);//radio, altura, cantidad
       Recipiente recipiente2 = new Recipiente (6, 13, 8);
     
       //mostar la inormacion de los recipientes
       System.out.println("\nRecipiente 1: " + recipiente1.muestra());
       System.out.println("Recipiente 2: " + recipiente2.muestra());

       //Comprobar si los recipientes estan llenos o vacios
       System.out.println("\nEl recipiente 1 esta vacio? " + recipiente1.estaVacio());
       System.out.println("El recipiente 2 esta vacio? " + recipiente2.estaVacio());

       //Verificar la capacidad de los recipientes
        System.out.println("\nLa capacidad del recipiente 1 es: " + recipiente1.capacidad());
        System.out.println("La capacidad del recipiente 2 es: " + recipiente2.capacidad());

        //verificar la capacidad restante
        System.out.println("\nCapacidad restante del recipiente 1: " + recipiente1.capacidadRestante());

        //Prueba de relleno
        double excedente = recipiente1.rellena(2.3);
        System.out.println("\nRellenando recipiente 1 con 2.3 cm^3..." );
        System.out.println("Excedente: " + excedente);
        System.out.println("Actualizacion del estado del recipiente 1: " + recipiente1.muestra());

        //prueba de vaciado
        double cantidadVaciada = recipiente1.vacia();
        System.out.println("\nVaciando recipiente 1 ...");
        System.out.println("Cantidad vaciada: " + cantidadVaciada);
        System.out.println("Actualizacion del estado del recipiente 1: " + recipiente1.muestra());

        //prueba para verter el liquido
        recipiente1.rellena(19);
        recipiente1.vierte(recipiente2);
        System.out.println("\nVertiendo liquido del Recipiente 1 en el recipiente 2..." );
        System.out.println("Recipiente1: " + recipiente1.muestra());
        System.out.println("Recipiente 2: " + recipiente2.muestra());

        //comparacion de los recipientes 
        System.out.println("\nEl recipiente 1 tiene las mismas dimensiones que el recipiente 2? " + recipiente1.mismasDimensiones(recipiente2));
        System.out.println("El recipiente 1 tiene la misma capacidad que el recipiente 2? " + recipiente1.mismaCapacidad(recipiente2));
        System.out.println("El recipiente 1 tiene mas liquido que el recipiente 2? " + recipiente1.contieneMas(recipiente2));
        System.out.println("El recipiente 1 puede contener mas liquido que el recipiente 2? " + recipiente1.cabeMas(recipiente2));

        //Creacion de nuevos recipiente con la cantidad actual
        Recipiente creaRecipiente = recipiente1.crearContenedor();
        System.out.println("\nCreando recipiente con la cantidad actual de Recipiente 1 " );
        System.out.println("Nuevo contenedor: " + creaRecipiente.muestra());
    }
}

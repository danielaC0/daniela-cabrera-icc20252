import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Jugador humano;
    private Jugador artificial;
    private ZonaJuego zona;
    private ListaCartas mazo;
    private Random random;
    private Scanner scanner;

    public Partida() {
        humano = new Jugador("Jugador Humano");
        artificial = new Jugador("Jugador Artificial");
        zona = new ZonaJuego();
        mazo = new ListaCartas();
        random = new Random(42); 
        scanner = new Scanner(System.in);
    }

    public static void mostrarPerrito() {
        System.out.println("       / \\__");
        System.out.println("     (    @\\___");
        System.out.println("     /         O");
        System.out.println("    /   (_____/ ");
        System.out.println("  /_____/_    U");
        System.out.println("      WUFF!");
        System.out.println(" ¡Juega a Pick-a-Perro!");
        System.out.println("----------------------------");
    }

    public void jugar() {
        System.out.println("=== INICIO DEL JUEGO ===");
        mostrarPerrito();
        generarMazo();
        mezclarMazo();
        System.out.println("Cartas en el mazo: " + mazo.tamano());
        while (mazo.tamano() >= 2) {
            System.out.println("\n=== NUEVA RONDA ===");
            iniciarRonda();
        }
        mostrarResultadosFinales();
   }   

   private void generarMazo() {
        mazo = new ListaCartas();
        for (int tam = 0; tam < 2; tam++) { // 0 o 1 -> pequeño o grande
            for (int col = 0; col < 2; col++) { // 0 o 1 -> rojo o azul
                for (int br = 0; br < 2; br++) { // 0 o 1 -> con o sin brazos
                    for (int len = 0; len < 2; len++) { // 0 o 1 -> con o sin lentes
                        for (int pal = 0; pal < 2; pal++) { // 0 o 1 -> con o sin palomitas
                            Carta c = new Carta(tam, col, br, len, pal);
                            mazo.agregaCarta(c);
                        }
                    }
                }
            }
        }
            System.out.println("Cartas en el mazo: " + mazo.tamano());
    }

    private void mezclarMazo() {
        for (int i = 0; i < mazo.tamano(); i++) {
            int j = random.nextInt(mazo.tamano());
            Carta temp = mazo.obtener(i);
            mazo.reemplazar(i, mazo.obtener(j));
            mazo.reemplazar(j, temp);
        }
        System.out.println("Cartas mezcladas: ");
        zona.mostrarZona();
   }
          
    private void iniciarRonda() {
        humano.iniciarNuevaRonda(mazo.remover(0));
        artificial.iniciarNuevaRonda(mazo.remover(0));
        zona.limpiar();
        for (int i = 0; i < 30 && !mazo.estaVacia(); i++) {
            zona.agregarCarta(mazo.remover(0));
        }

        boolean rondaTerminada = false;
        while (!rondaTerminada) {
            rondaTerminada = turnoHumano();
            if (!rondaTerminada) {
                rondaTerminada = turnoArtificial();
            }
        }

        verificarYContarPuntos();
    }

    private boolean turnoHumano() {
        System.out.println("\nTurno del humano");
        zona.mostrarZona();
        System.out.println("Tu carta guía: " + humano.getUltimaCarta());
        System.out.println("Puntos: " + humano.getPuntos());
        System.out.println("¿Qué deseas hacer? (elegir índice de carta o -1 para terminar): ");
        int opcion = scanner.nextInt();
        if (opcion == -1) {
            // Verifica si no hay cartas válidas para continuar
            if (!humano.puedeExtenderCon(zona.getCartas())) {
                System.out.println("¡Correcto! No había más cartas válidas.");
                return true;
            } else {
                System.out.println("¡Incorrecto! Aún podías tomar cartas. Pierdes tus cartas.");
                humano.descartarRonda();
                return true;
            }
        } else if (opcion >= 0 && opcion < zona.cantidadCartas()) {
            Carta elegida = zona.obtenerCarta(opcion);
            if (humano.puedeAgregar(elegida)) {
                humano.agregarCarta(elegida);
                zona.removerCarta(opcion);
                // Actualiza la carta guía después de agregar una carta
                System.out.println("Carta añadida correctamente.");
            } else {
                System.out.println("Esa carta no es válida para tu secuencia.");
            }
        } else {
            System.out.println("Entrada no válida.");
        }
        return false;
    }
    
    private boolean turnoArtificial() {
        System.out.println("\nTurno del jugador artificial");
        for (int i = 0; i < zona.cantidadCartas(); i++) {
            Carta c = zona.obtenerCarta(i);
            if (artificial.puedeAgregar(c)) {
                artificial.agregarCarta(c);
                zona.removerCarta(i);
                System.out.println("Jugador artificial tomó una carta.");
                return false;
            }
        }
        System.out.println("Jugador artificial no pudo continuar y finaliza la ronda.");
        return true;
    }

    private void verificarYContarPuntos() {
        System.out.println("\n=== Fin de la ronda ===");
        humano.evaluarSecuencia();
        artificial.evaluarSecuencia();
    }

    private void mostrarResultadosFinales() {
        try {
            System.out.println("\n=== FIN DEL JUEGO ===");
            System.out.println(humano.getNombre() + ": " + humano.getPuntos());
            System.out.println(artificial.getNombre() + ": " + artificial.getPuntos());
    
            if (humano.getPuntos() > artificial.getPuntos()) {
                System.out.println("¡Ganaste! Felicitaciones.");
            } else if (humano.getPuntos() < artificial.getPuntos()) {
                System.out.println("¡Ganó el jugador artificial! Mejor suerte la próxima vez.");
            } else {
                System.out.println("¡Empate! Ambos jugadores terminaron con el mismo puntaje.");
            }
        } catch (Exception e) {
            System.out.println("Hubo un error al mostrar los resultados: " + e.getMessage());
        }
    }
       
}


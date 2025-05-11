public class Jugador {
    private String nombre;
    private ListaCartas secuencia;
    private int puntos;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.secuencia = new ListaCartas();
        this.puntos = 0;
    }

    public void agregarCarta(Carta carta){
        secuencia.agregaCarta(carta);
    }

    public void evaluarSecuencia(){
        if(secuencia.esSecValida()){
            int victorias = secuencia.tamano();
            puntos+= victorias;
            System.out.println(Colores.VERDE + "✔" + nombre + " tiene una secuencia valida " + victorias + " puntos" + Colores.RESET);
        }else{
            secuencia.vaciar();
            System.out.println(Colores.ROJO + "❌" + nombre + " tiene una secuencia invalida.Pierde cartas " + Colores.RESET );
        }
    }

    public ListaCartas getSecuencia(){
        return secuencia;
    }

    public int getPuntos(){
        return puntos;
    }

    public String getNombre(){
        return nombre;
    }

    public void reiniciarSecuencia(){
        secuencia = new ListaCartas();
    }

    public void iniciarNuevaRonda(Carta cartaGuia) {
        this.secuencia = new ListaCartas();
        this.secuencia.agregaCarta(cartaGuia);
    }

    public Carta getUltimaCarta() {
        NodoCarta actual = secuencia.getCabeza();
        if (actual == null) return null;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public boolean puedeAgregar(Carta carta) {
        if (this.secuencia.estaVacia()) {
            return true; 
        }
        Carta ultimaCarta = this.secuencia.obtener(this.secuencia.tamano() - 1);
        return carta.esSecuenciaValidaCon(ultimaCarta);
    }

    public boolean puedeExtenderCon(ListaCartas disponibles) {
        for (int i = 0; i < disponibles.tamano(); i++) {
            Carta c = disponibles.obtener(i);
            if (puedeAgregar(c)) {
                return true;
            }
        }
        return false;
    }

    public void descartarRonda() {
        secuencia.vaciar();
    }

    public void finalizarRonda() {
        int puntosGanados = secuencia.tamano();
        puntos += puntosGanados;
        System.out.println(nombre + " gana " + puntosGanados + " puntos.");
    }
    
    public void mostrarSecuencia() {
        secuencia.mostrar();
    }
}


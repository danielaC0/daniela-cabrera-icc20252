ublic class ZonaJuego {
    private ListaCartas cartasMostradas;

    public ZonaJuego() {
        cartasMostradas = new ListaCartas();
    }

    public void agregarCarta(Carta carta) {
        cartasMostradas.agregaCarta(carta);  // Consistencia en el uso del nombre de métodos
    }

    public Carta obtenerCarta(int indice) {
        return cartasMostradas.obtener(indice);
    }

    public Carta removerCarta(int indice) {
        return cartasMostradas.remover(indice);
    }

    public int cantidadCartas() {
        return cartasMostradas.tamano();
    }

    public boolean estaVacia() {
        return cartasMostradas.estaVacia();
    }

    public void mostrarZona() {
        System.out.println("Zona de juego:");
        for (int i = 0; i < cartasMostradas.tamano(); i++) {
            System.out.println("[" + i + "] " + cartasMostradas.obtener(i));
        }
    }

    public ListaCartas getCartas() {
        return cartasMostradas;
    }

    public void limpiar() {
        cartasMostradas.vaciar();  // Usar el método vaciar para optimizar el uso de memoria
    }
}

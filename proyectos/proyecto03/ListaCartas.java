public class ListaCartas {
    private NodoCarta cabeza;
    private NodoCarta cola;

    public ListaCartas(){
        cabeza = null;
    }

    public void agregaCarta(Carta carta) {
        NodoCarta nuevo = new NodoCarta(carta);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoCarta actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    public boolean esSecValida(){
        if(cabeza == null || cabeza.siguiente == null) return true;
        NodoCarta actual = cabeza;
        NodoCarta siguiente = cabeza.siguiente;
        while(siguiente != null){
            int dif = actual.dato.contarDiferencias(siguiente.dato);
            if(dif != 0 && dif != 1){
                return false;
            }
            actual = siguiente;
            siguiente = siguiente.siguiente;
        }
        return true;
    }

    public boolean agregarSiEsValida(Carta nueva) {
        //lista vacía
        if (cabeza == null) {
            cabeza = new NodoCarta(nueva);
            cola = cabeza;
            return true;
        }
        if (cola.dato.esSecuenciaValidaCon(nueva)) {
            NodoCarta nuevoNodo = new NodoCarta(nueva);
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            return true;
        }
        return false;
    }
    

    public int tamano(){
        int contador = 0;
        NodoCarta actual = cabeza;
        while(actual != null){
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void vaciar(){
        cabeza = null;
    }

    public boolean estaVacia(){
        return cabeza ==null;
    }

    public NodoCarta getCabeza(){
        return cabeza;
    }

    public void mostrar(){
        NodoCarta actual = cabeza;
        while(actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
 
    public Carta obtener(int indice) {
        NodoCarta actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (contador == indice) return actual.dato;
            actual = actual.siguiente;
            contador++;
        }
        return null; 
    }

    public void reemplazar(int indice, Carta nuevaCarta) {
        NodoCarta actual = cabeza;
        int contador = 0;
        while (actual != null && contador < indice) {
            actual = actual.siguiente;
            contador++;
        }
        if (actual != null) {
            actual.dato = nuevaCarta;
        }
    }

    public Carta remover(int indice) {
        if (cabeza == null) return null;
    
        if (indice == 0) {
            Carta dato = cabeza.dato;
            cabeza = cabeza.siguiente;
            return dato;
        }
        NodoCarta actual = cabeza;
        int contador = 0;
        while (actual.siguiente != null) {
            if (contador == indice - 1) {
                NodoCarta aEliminar = actual.siguiente;
                if (aEliminar != null) {
                    actual.siguiente = aEliminar.siguiente;
                    return aEliminar.dato;
                }
            }
            actual = actual.siguiente;
            contador++;
        }   
        return null; 
    }
}

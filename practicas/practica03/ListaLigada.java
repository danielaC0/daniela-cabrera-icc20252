public class ListaLigada {
    private Nodo cabeza;
    int tamano;
    String lista = "";

    public ListaLigada(){
        this.cabeza = null;
        this.tamano =0;
    }

    //metodo para ver si la lista esta vacia
    public boolean estaVacia(){
        return cabeza ==null;
    }

    //metodo para insertar nodo
    public void insertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            Nodo aux = cabeza;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
        tamano ++;
    }

    //eliminar nodo
    public int eliminarNodo(int valor){
        if (cabeza == null) return 0; 

        if (cabeza.informacion == valor) { 
            int eliminado = cabeza.informacion;
            cabeza = cabeza.siguiente;
            tamano--;
            return eliminado;
        }

        Nodo aux = cabeza;
        while (aux.siguiente != null && aux.siguiente.informacion != valor) {
            aux = aux.siguiente;
        }

        if (aux.siguiente != null) {
            int eliminado = aux.siguiente.informacion;
            aux.siguiente = aux.siguiente.siguiente;
            tamano--;
            return eliminado;
        }
        System.out.println("El elemento " + valor + " no se encuentra en la lista");
        return 0;
        
    }

    //metodo para saber cual es el ultimo valor ingresado
    public int muestraUltimoValor(){
        if (cabeza == null) return 0; 

        Nodo aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        return aux.informacion;
    }

    //tamano de la lista
    public int tamanoLista(){
        return tamano;
    }

    //vaciar lista
    @Override
    public String toString() {
        if (cabeza == null) return "Lista vacía";
    
        String resultado = "";
        Nodo aux = cabeza;
    
        while (aux != null) {
            resultado += aux.informacion;
            if (aux.siguiente != null) { 
                resultado += "->";
            }
            aux = aux.siguiente;
        }
        return resultado;
    }
}

public class Main {
    public static void main(String args[]){
        ListaLigada lista = new ListaLigada();
        //declar una lsta
        System.out.println( lista);
        //insertar 5 elementos
        System.out.println("\nLista con 5 elementos: ");
        lista.insertarNodo(1);
        lista.insertarNodo(2);
        lista.insertarNodo(3);
        lista.insertarNodo(4);
        lista.insertarNodo(5);
        System.out.println(lista);
        //eliminar la cabeza
        System.out.println("\nLista con la cabeza eliminada:");
        lista.eliminarNodo(1);
        System.out.println(lista);
        //eliminar un elemento distinto a la cabeza y al final
        System.out.println("\nLista con un nodo eliminado:");
        lista.eliminarNodo(4);
        System.out.println(lista);
        //ultimo valor ingreado y tamaño de la lista
        System.out.println("Ultimo valor ingresado " + lista.muestraUltimoValor());
        System.out.println("Tamaño de la lista " + lista.tamanoLista());
    }
}

import java.util.Scanner;
public class Esteganografia{
    private String original;
    private int n;
    /**
* Toma la n- ́e sima letra de cada palabra para obtener el mensaje
* oculto .
*
* @param original El mensaje original .
* @param n El  ́ı ndice que se tiene que tomar de cada palabra .
* @return El mensaje oculto , sin espacios .
*/
public String descifraNulo ( String original , int n ){
    Scanner entrada = new Scanner (original);
    String resultado = "";
    while(entrada.hasNext()){
        String palabra = entrada.next();
        if(palabra.length() > n){
            resultado += palabra.charAt(n);
        }
    }
    return resultado;
}
/**
* Toma la n- ́e sima letra de cada palabra para obtener el mensaje
* oculto .
*
* @param original El mensaje original con n espacios al final .
* @return El mensaje oculto , sin espacios .
*/
public String descifraNulo ( String original ){
    int n = 0;
    int i = original.length() - 1;
    while(i >= 0 && original.charAt(i) == ' '){
        n++;
        i--;
    }
    return descifraNulo(original.trim(), n);
}
/**
* Busca un nombre oculto en un texto arbitrario ignorando
* espacios , signos de puntuaci  ́on y sin hacer distinciones
* entre may  ́u sculas y min  ́u sculas .
*
* @param mensaje Una cadena arbitraria donde se har ́a la
* b ́u squeda .
* @param nombre El nombre que se buscar  ́a en el texto .
* @return true si el mensaje est  ́a contenido , false en otro
* caso .
*/
public boolean contieneNombre ( String mensaje , String nombre ){
    String depurado = mensaje.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String nombreDepurado = nombre.toLowerCase();
    return depurado.contains(nombreDepurado);
}
/**
* Reconstruye el mensaje oculto a partir de las palabras
* especiales que se obtienen al comparar dos textos .
*
* @param m Un texto arbitrario .
* @param e Un texto similar al primero , pero con algunas
* palabras especiales .
* @return El mensaje oculto .
*/
public String descifraPalabrasMarcadas ( String m , String e ){
    Scanner entradaM = new Scanner(m);
    Scanner entradaE = new Scanner(e);
    String resultado = "";

    while (entradaM.hasNext() && entradaE.hasNext()) {
        String palabraM = entradaM.next();
        String palabraE = entradaE.next();
        if (!palabraM.equals(palabraE)) {
            resultado += palabraE + " ";
        }
    }

    while (entradaE.hasNext()) {
        resultado += entradaE.next() + " ";
    }

    return resultado.trim();
}
/**
* Reconstruye el mensaje oculto a partir de las letras
* especiales que se obtienen al comparar dos textos .
*
* @param m Un texto arbitrario .
* @param e Un texto similar al primero , pero con algunas
* letras especiales .
* @return El mensaje oculto .
*/
public String descifraLetrasMarcadas ( String m , String e ){
    
    String resultado = "";
    
    int longitud = (m.length() < e.length()) ? m.length() : e.length();

    for (int i = 0; i < longitud; i++) {
        if (m.charAt(i) != e.charAt(i)) {
            resultado += e.charAt(i);
        }
    }

    if (e.length() > m.length()) {
        resultado += e.substring(m.length());
    }

    return resultado;
    }
}
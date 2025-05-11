public class Carta{
    String tamano;
    String color;
    int brazos;
    boolean lentes;
    boolean palomitas;
    
    public Carta(String tamano, String color, int brazos, boolean lentes, boolean palomitas){
        this.tamano = tamano;
        this.color = color;
        this. brazos = brazos;
        this.lentes = lentes ;
        this.palomitas = palomitas;
    }

    // constructor adicional para generar cartas con enteros
    public Carta(int tamano, int color, int brazos, int lentes, int palomitas) {
        this.tamano = (tamano == 0) ? "Pequeño" : "Grande";
        this.color = (color == 0) ? "Rojo" : "Azul";
        this.brazos = brazos;
        this.lentes = (lentes == 1);
        this.palomitas = (palomitas == 1);
    }


    public int contarDiferencias(Carta otro){
        int diferencia = 0;
        if(!this.tamano.equals(otro.tamano)) diferencia++;
        if(!this.color.equals(otro.color)) diferencia++;
        if(this.brazos != otro.brazos) diferencia++;
        if(this.lentes != otro.lentes) diferencia++;
        if(this.palomitas != otro.palomitas) diferencia++;
        return diferencia;
    }
    
    public boolean esSecuenciaValidaCon(Carta otra) {
        int diferencias = 0;
        if (!this.tamano.equals(otra.tamano)) diferencias++;
        if (!this.color.equals(otra.color)) diferencias++;
        if (this.brazos != otra.brazos) diferencias++;
        if (this.lentes != otra.lentes) diferencias++;
        if (this.palomitas != otra.palomitas) diferencias++;
    
        return diferencias == 1; // solo se permite una diferencia
    }
    
    @Override
    public String toString() {
        String colorTexto;
        if (color.equalsIgnoreCase("Rojo")) {
            colorTexto = Colores.ROJO; 
        } else if (color.equalsIgnoreCase("Azul")) {
            colorTexto = Colores.AZUL; // Azul
        } else {
            colorTexto = Colores.VERDE; // Por si hay algún otro color no esperado, asignar verde.
        }
        return "Tamaño: " + tamano + ", Color: " + colorTexto + color + Colores.RESET + 
               ", Brazos: " + brazos  + 
               ", Lentes: " + (lentes ? "Sí" : "No") + 
               ", Palomitas: " + (palomitas ? "Sí" : "No");
    }
    
}

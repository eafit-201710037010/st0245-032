
package laboratorio5;

/**
 *Son los nodos del árbol de búsqueda binario.
 * @author Alejandro Arroyave Bedoya
 * @version 10-2017
 */
public class Nodo {
    
    /**
     * Nombre del familiar
     */
    public String dato;
    /**
     * Posición del familiar.
     */
    public int pos;
    /**
     * Nodo izquierdo del actual nodo.
     */
    public Nodo izq;
    /**
     * Nodo derecho del actual nodo.
     */
    public Nodo der;
    
    /**
     * Este constructor recibe los valores dato (Nombre del elemento, y pos 
     * (Posición del elemento el¿n el árbol) y luego los define).
     * @param dato Nombre del elemento.
     * @param pos Posición del elemento.
     */
    public Nodo (String dato, int pos){
        this.dato=dato;
        this.pos=pos;
    }
}

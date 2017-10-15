
package laboratorio5;

/**
 * En esta clase se define el objeto binaryTre, que es el árbol binario de 
 * búsqueda.
 * @author Alejandro Arroyave Bedoya.
 * @version 10-2017
 */
public class binaryTre {

    /**
     * Raiz del árbol.
     */
    public Nodo root;
    /**
     * Constructor de la clase, reinicia el árbol
     */
    public binaryTre() {
        root = null;
    }

    /**
     * Compara dos números y devuelve el mayor
     * @param i Número 1 a comparar
     * @param j Número 2 a comparar
     * @return el mayor de los números
     */
    private int max2(int i, int j) {
        if (i > j) {
            return i;
        }
        return j;
    }

    /**
     * Este es el método recursivo para definir la altura del árbol, se suma 1
     * a cada llamado de max2.
     * @param node raiz del árbol.
     * @return la altura del ábol.
     */
    private int maxheightAUX(Nodo node) {
        if (node == null) {
            return 0;
        } else {
            return max2(maxheightAUX(node.izq), maxheightAUX(node.der)) + 1;
        }
    }

    /**
     * Este método devuelve e imprime la altura del árbol
     * @return la altura del árbol.
     */
    public int maxheight() {
        System.out.println(maxheightAUX(root));
        return maxheightAUX(root);
    }

    /**
     * Imprime el árbol en posorden, primero el subárbol izquierdo, luego el
     * subárbol derecho, y por últio la raiz
     * @param node Raiz del árbol.
     */
    private void recursivePrintAUX(Nodo node) {
        if (node != null) {
            recursivePrintAUX(node.izq);
            recursivePrintAUX(node.der);
            System.out.println(node.dato);
        }
    }

    /**
     * imprime el árbol en posorden.
     */
    public void recursivePrint() {
        recursivePrintAUX(root);
    }

    /**
     * Devuelve y imprime el elemento buscado.
     * @param nombre El nombre del familiar a buscar.
     * @param posicion Posición donde deberá estar ubicado el familiar.
     * @return <ul>
     *         <li>true: El familiar se encuentra en el árbol.</li>
     *         <li>false: El familiar no se encuentra en el árbol.</li>
     *         </ul>
     */
    public boolean search(String nombre, int posicion) {
        System.out.println("Buscado: "+search(root, nombre, posicion));
        return search(root, nombre, posicion);
    }

    /**
     * Método recursivo para buscar un elemento, utiliza la pos para definir el
     * camino que va a tomar, y utiliza x para verificar si el familiar esta en
     * al árbol.
     * @param nodo Raiz del árbol.
     * @param x Nombre del familiar.
     * @param pos Posición del familiar.
     * @return <ul>
     *         <li>true: El String ingresado es idéntico al String de un 
     *         nodo</li>
     *         <li>false: El familiar no se encuentra en ningún nodo del 
     *         árbol.</li>
     *         </ul>
     */
    private boolean search(Nodo nodo, String x, int pos) {
        if (nodo == null) {
            return false;
        }
        if (nodo.dato.equals(x)) {
            return true;
        }
        if (nodo.pos < pos) {
            return search(nodo.der, x, pos);
        }
        return search(nodo.izq, x, pos);
    }

    /**
     * Inserta un elemento en el árbol.
     * @param nombre Nombre del familiar a ingresar
     * @param posicion Posición donde va a estar.
     */
    public void insert(String nombre, int posicion) {
        System.out.println("Insertado");
        insertAux(root, nombre, posicion);
    }

    /**
     * Método recursivo para insertar un elemento en el árbol, utiliza pos para
     * ubicar el elemento, si pos es menor a la pos de la raiz, lo ubica a la
     * izquierda, si es mayor a la derecha, así hasta encontrar un nodo vacío.
     * @param nodo Raiz del árbol.
     * @param x Nombre del elemento.
     * @param pos Posición del elemento.
     */
    private void insertAux(Nodo nodo, String x, int pos) {
        if (nodo == null) {
            root = new Nodo(x, pos);
        } else {
            if (pos >= nodo.pos) {
                if (nodo.der == null) {
                    nodo.der = new Nodo(x, pos);
                } else {
                    insertAux(nodo.der, x, pos);
                }
            } else {
                if (nodo.izq == null) {
                    nodo.izq = new Nodo(x, pos);
                } else {
                    insertAux(nodo.izq, x, pos);
                }
            }
        }
    }

    /**
     * Método para añadir un nodo al árbol.
     * @param nodo Nodo a añadir.
     * @param root Raiz del árbol.
     */
    private void addNodo(Nodo nodo, Nodo root) {
        if (root == null) {
            root = nodo;
        } else if (nodo.pos >= root.pos) {
            if (nodo.der == null) {
                root.der = nodo;
            } else {
                addNodo(nodo, root.der);
            }
        } else {
            if (root.izq == null) {
                root.izq = nodo;
            } else {
                addNodo(nodo, root.izq);
            }
        }
    }

    /**
     * Elimina el familiar ingresado.
     * @param nombre Nombre del familiar a eliminar.
     * @param posicion Posición del familiar a eliminar.-_
     */
    public void delete(String nombre, int posicion) {
        System.out.println("Eliminado");
        delete(root, nombre, posicion);
    }

    /**
     * Elimina un nodo del árbol.
     * @param nodo Raiz del árbol.
     * @param x Nombre del elemento.
     * @param pos Posición del elemento.
     */
    private void delete(Nodo nodo, String x, int pos) {
        if (nodo == null) {
            return;
        }
        if (nodo.dato.equals(x)) {
            Nodo nodoTemp = (nodo.izq);
            root = (nodo.der);
            if (nodoTemp != null) {
                addNodo(nodoTemp, root);
            }
            return;
        }
        if (nodo.der != null) {
            if ((nodo.der).dato.equals(x)) {
                Nodo nodoTemp = ((nodo.der).izq);
                (nodo.der) = (nodo.der).der;
                if (nodoTemp != null) {
                    addNodo(nodoTemp, root);
                }
                return;
            } else if (pos >= nodo.pos) {
                delete(nodo.der, x, pos);
            }
        }
        if (nodo.izq != null) {
            if ((nodo.izq).dato.equals(x)) {
                Nodo nodoTemp = (nodo.izq).der;
                (nodo.izq) = (nodo.izq).izq;
                if (nodoTemp != null) {
                    addNodo(nodoTemp, root);
                }
            } else if (pos < nodo.pos) {
                delete(nodo.izq, x, pos);
            }
        }
    }
    /**
     * Imprime la persona seleccionada con su respectiva abuela materna.
     * @param Nombre Nombre del familiar seleciconado.
     * @param posicion Posición del familiar seleccionado.
     */
    public void AbuelaMaterna (String Nombre, int posicion){
        System.out.println("La abuela materna de "+Nombre+" es:"+
                AbuelaMaternaAUX(Nombre, posicion));
    }
    
    /**
     * Devuelve el nombre de la abuela materna del familiar elegido, busca el
     * familiar seleccionado y busca en los dos subárboles izquierdos 
     * siguientes.
     * @param nombre Nombre del familiar seleccionado.
     * @param posicion Posición del familiar selccionado.
     * @return El nombre de la abuela materna de la persona elegida.
     */
    private String AbuelaMaternaAUX(String nombre, int posicion){
        Nodo aux=getNodo(root,nombre,posicion);
        return aux.izq.izq.dato;
    }
    /**
     * Busca y retorna un nodo.
     * @param nodo Raiz del árbol.
     * @param x Nombre del familiar.
     * @param pos Posición del familiar.
     * @return El nodo buscado.
     */
    private Nodo getNodo(Nodo nodo, String x, int pos) {
        if (nodo == null) {
            return null;
        }
        if (nodo.dato.equals(x)) {
            return nodo;
        }
        if (nodo.pos < pos) {
            return getNodo(nodo.der, x, pos);
        }
        return getNodo(nodo.izq, x, pos);
    }
    
}

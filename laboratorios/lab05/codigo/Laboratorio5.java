package laboratorio5;

/**
 * @description La clase principal
 * @author Alejandro Arroyave Bedoya - Mauricio Toro
 * @version 10-2017
 */
class Laboratorio5 {
    /**
     * Imprime el árbol, agregando detalles, para la estética del árbol.
     * @param a - Es el árbil binario que se va a recorrer.
     */
    public static void dibujarArbol(binaryTre a) {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */");
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }

    /**
     * Es el método auxiliar para dibujar el arbol, recorre todo el arbol y lo
     *imprime con la sintaxis de Digraph.
     * @param nodo - Es el nodo a imprimir.
     */
    public static void dibujarArbolAux(Nodo nodo) {
        if (nodo != null) //"x_\n__" -> "xo\n__";
        {
            for (Nodo n : new Nodo[]{nodo.izq, nodo.der}) {
                if (n != null) {
                    System.out.println("\"" + nodo.dato + "\" -> \"" + n.dato + "\";");
                }
                dibujarArbolAux(n);
            }
        }
    }

    /**
     * Es el método principal.
     * @param args - parametro predeterminado para el método principal
     */
    public static void main(String[] args) {

        //Crea el árbol familiar
        binaryTre tree = new binaryTre();
        tree.insert("Alejandro", 7);
        tree.insert("Sandra", 4);
        tree.insert("Jaime", 10);
        tree.insert("Nubia", 3);
        tree.insert("Octavio", 5);
        tree.insert("Olivia", 9);
        tree.insert("Marino", 11);
        //Busca en el árbol familiar
        tree.search("Marino", 11);
        tree.search("Luis", 9);
        //Altura del árbol familiar
        tree.maxheight();
        //Abuela materna
        tree.AbuelaMaterna("Alejandro", 7);
        //Imprime el árbol familiar
        tree.recursivePrint();
        //Dibuja el árbol familiar
        dibujarArbol(tree);
    }
}
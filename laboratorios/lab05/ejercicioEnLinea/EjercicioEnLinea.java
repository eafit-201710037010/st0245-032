import java.util.Scanner;
class Nodo{
    public int dato;
    public Nodo izq;
    public Nodo der;
    public Nodo(int dato){
        this.dato=dato;
    }
}

class Arbol{
    
    public Nodo root;

    public Arbol() {
        root = null;
    }
    
    public void insert(int x) {
        insertAux(root, x);
    }

    private void insertAux(Nodo nodo, int x) {
        if (nodo == null) {
            root = new Nodo(x);
        } else if (x >= nodo.dato) {
            if (nodo.der == null) {
                nodo.der = new Nodo(x);
            } else {
                insertAux(nodo.der, x);
            }
        } else {
            if (nodo.izq == null) {
                nodo.izq = new Nodo(x);
            } else {
                insertAux(nodo.izq, x);
            }
        }
    }
    
    private void recursivePrintAUX(Nodo node) {
        if (node != null) {
            recursivePrintAUX(node.izq);
            recursivePrintAUX(node.der);
            System.out.println(node.dato);
        }
    }
    
    public void recursivePrint() {
        recursivePrintAUX(root);
    }
}
public class EjercicioEnLinea {
    static Arbol tree= new Arbol();
    public static void main (String [] args){
        while (true){
            Scanner sc = new Scanner (System.in);
            int x = sc.nextInt();
            if (x<0)
                break;
            tree.insert(x);
        }
        tree.recursivePrint();
    }
}

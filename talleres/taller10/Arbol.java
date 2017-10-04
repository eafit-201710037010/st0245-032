/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Arbol {
    
    private Nodo raiz;
    
    public Arbol (Nodo nodo) {
        raiz=nodo;
    }
    
    public Nodo getNodo () {
        return raiz;
    }
    
    private int maximo (int a, int b){
        if (a > b)
            return a;
        return b;
    }
    
    public int altura () {
        return altura (raiz);
    }
    
    public int altura (Nodo nodo){
        if (nodo == null)
            return 0;
        else 
            return maximo (altura (nodo.der), altura (nodo.izq))+1;
    }
    
    public void imprimir () {
        imprimir (raiz);
    }
    
    private void imprimir (Nodo nodo) {
        if (nodo != null){
            imprimir (nodo.izq);
            System.out.println(nodo.dato);
            imprimir (nodo.der);
        }
    }
    
    public void printCode () {
        System.out.println("digraph G {");
        System.out.println();
        printCode(raiz);
        System.out.println();
        System.out.println("}");
    }
    private void printCode (Nodo nodo) {
        if (nodo != null){
            if (nodo.izq != null){
            System.out.println(nodo.dato + " -> " + nodo.izq.dato);
            printCode(nodo.izq);
            }
            if (nodo.der != null){
            System.out.println(nodo.dato + " -> " + nodo.der.dato);
            printCode (nodo.der);
            }
        }
    }
}

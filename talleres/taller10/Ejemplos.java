/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejemplos {
    public static void main (String [] args) {
        Arbol arbol = new Arbol (new Nodo ("Wilkenson"));
        Nodo raiz = arbol.getNodo();
        raiz.izq= new Nodo("Joaquina");
        raiz.der= new Nodo("Sufranio");
        raiz.izq.izq= new Nodo("Eustaquia");
        raiz.izq.der= new Nodo("Eustaquio");
        raiz.der.izq= new Nodo("Piolina");
        raiz.der.der= new Nodo("Piolín");
        raiz.izq.izq.izq= new Nodo("Florinda");
        raiz.izq.der.der= new Nodo("Jovín");
        raiz.der.izq.izq= new Nodo("Wilberta");
        raiz.der.der.der= new Nodo("Usnavy");
        arbol.imprimir();
        arbol.printCode();
    }
}

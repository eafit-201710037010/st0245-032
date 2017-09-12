/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aarroyaveb
 */
import java.util.Queue;
import java.util.LinkedList;
public class punto2 {
    public static void main(String []args){
        colas();
    }
    public static void colas(){
        Queue <String> cola = new LinkedList<>();
        cola.add("Juan");
        cola.add("Marìa");
        cola.add("Pedro");
        while(cola.peek()!=null){
            System.out.println("Atendiendo a: "+cola.remove());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.LinkedList;
public class EjercicioEnLinea {
    
    public static void main(String [] args){
        System.out.println(InicioYFin("Hola_[--]_Mundo"));
        System.out.println(InicioYFin("This_Is_a_[Beiju]_Text"));
    }
    
    public static String InicioYFin(String cadena){
        LinkedList <Character> lista = new LinkedList<>();
        for (int i=0; i<cadena.length(); i++){
            lista.add(cadena.charAt(i));
        }
        String res="";
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i)=='['){
                String res2="";
                i++;
                while (lista.get(i)!=']'){
                    res2=res2+lista.get(i);
                    i++;
                }
                res=res2+res;
            }else{
                res = res + lista.get(i);
            }
        }
        return res;
    }
}

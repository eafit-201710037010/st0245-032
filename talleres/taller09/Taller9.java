/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aarroyaveb
 */

import java.util.Hashtable;
public class Taller9{
    
    private static UnaTablaDeHash tabla=new UnaTablaDeHash();
    
    public void main (String [] args){
        Hashtable empresas = new Hashtable();
        agregar(empresas,"google", "7533");
        agregar(empresas, "La locura", "6350");
        agregar(empresas, "Lenovo", "1122");
        tabla.put("google", 7533);
        tabla.put("La locura", 6350);
        tabla.put("Lenovo", 1122);
        buscar(empresas, "Lenovo");
        buscar(empresas, "La locura");
        tabla.get("Lenovo");
        tabla.get("La locura");
        contienekey(empresas,"Lenovo");
        contienekey(empresas,"google");
        
    }
    
    public static void agregar(Hashtable empresas,String key, String value){
        empresas.put(key, value);
        int valu= Integer.parseInt(value);
        tabla.put(key, valu);
    }
    
    //pedrito 2
    public static void buscar(Hashtable empresas,String key){
        empresas.get(key);
        tabla.get(key);
    }
    //pedrito 3
    public static boolean contienekey(Hashtable empresas,String key){
        return empresas.containsKey(key);
    } 
}
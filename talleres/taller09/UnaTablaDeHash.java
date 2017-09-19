/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aarroyaveb
 */
public class UnaTablaDeHash {
    private int[] tabla;
    public UnaTablaDeHash(){
        tabla= new int[10];
    }
    
    private int funcionHash(String k){
        int sum=0;
        for(int i=0; i < k.length(); i++){
            sum= sum + ((int)k.charAt(i)*(i+1));
        }
        return sum % 10;
    }
    
    public int get (String k){
        return tabla[funcionHash(k)];
    }
    
    public void put (String k, int v){
        tabla[funcionHash(k)]=v;
    }
}

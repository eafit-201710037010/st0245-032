/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aarroyaveb
 */
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class punto1 {
    public static void main (String []args){
        if(pilas())
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
    }
    public static boolean pilas (){
        Stack<Integer> stack = new Stack <>();
        Queue<Integer> cola = new LinkedList<>();
        int [] a = {3,2,1};
        stack.push(1);
        stack.push(2);
        stack.push(3);
        cola.add(stack.pop());
        cola.add(stack.pop());
        cola.add(stack.pop());
        stack.push(cola.remove());
        stack.push(cola.remove());
        stack.push(cola.remove());
        int [] temp =stack.stream().mapToInt(Integer::intValue).toArray();
        if (Arrays.equals(temp, a))
            return true;
        else
            return false;
    }
}

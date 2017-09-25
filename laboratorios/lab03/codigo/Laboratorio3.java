/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Arroyave Bedoya
 */
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;

class nevera {
    int cod;
    String desc;
    public nevera(int cod, String desc){
        this.cod=cod;
        this.desc= desc;
    }
    public String getDesc(){
        return desc;
    }
    public int getCod(){
        return cod;
    }
}

class solicitud {
    String emp;
    int cant;
    public solicitud (String emp, int cant){
        this.emp=emp;
        this.cant=cant;
    }
    public String getEmp(){
        return emp;
    }
    public int getCant(){
        return cant;
    }
}

public class Laboratorio3 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        LinkedList<Integer> listalink = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        multiplicacion(lista);
        SmartInsert(lista, 5);
        SmartInsert(lista, 3);
        listalink.add(1);
        listalink.add(2);
        listalink.add(3);
        listalink.add(4);
        multiplicacion(listalink);
        SmartInsert(listalink, 5);
        SmartInsert(listalink, 3);
        int[] arreglo1 = {10, 20, 5, 3, 20, 10};
        ArrayList<Integer> lista1 = new ArrayList<>();
        LinkedList<Integer> listalink1 = new LinkedList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(5);
        lista1.add(3);
        lista1.add(20);
        lista1.add(10);
        ejercicio3(lista1);
        listalink.add(10);
        listalink.add(20);
        listalink.add(5);
        listalink.add(3);
        listalink.add(20);
        listalink.add(10);
        ejercicio3(listalink1);
    }

    public static int multiplicacion(ArrayList<Integer> lista) {
        int res = 1;
        for (Integer lista1 : lista) {
            res *= lista1;
        }
        return res;
    }

    public static int multiplicacion(LinkedList<Integer> lista) {
        int res = 1;
        for (Integer lista1 : lista) {
            res *= lista1;
        }
        return res;
    }

    public static ArrayList<Integer> SmartInsert(ArrayList<Integer> l, int data) {
        for (Integer i : l) {
            if (i == data) {
                return l;
            }
        }
        l.add(data);
        return l;
    }

    public static LinkedList<Integer> SmartInsert(LinkedList<Integer> l, int data) {
        for (Integer i : l) {
            if (i == data) {
                return l;
            }
        }
        l.add(data);
        return l;
    }

    public static int ejercicio3(LinkedList<Integer>lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 = sum1 + lista.get(j);
            }
            for (int k = i + 1; k < lista.size(); k++) {
                sum2 = sum2 + lista.get(k);
            }
            if (sum1 >= sum2) {
                break;
            }
        }
        return i - 1;
    }
    
    public static int ejercicio3(ArrayList<Integer>lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 = sum1 + lista.get(j);
            }
            for (int k = i + 1; k < lista.size(); k++) {
                sum2 = sum2 + lista.get(k);
            }
            if (sum1 >= sum2) {
                break;
            }
        }
        return i - 1;
    }

    public static void ejercicio4(Stack neveras, Queue solicitudes) {
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Arroyave Bedoya
 */
import java.util.Random;
import java.util.Scanner;
public class ArraySum {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el tamaño del arreglo");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        arraySum(array(n));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(n + " " + estimatedTime);
    }
    
    public static int arraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
    
    public static int[] array (int n){
        int size=n;
        int max=5000;
        int [] array= new int[size];
        Random generator = new Random();
        for (int i=0; i<size; i++){
            array[i]=generator.nextInt(max);
        }
        return array;
    }
}

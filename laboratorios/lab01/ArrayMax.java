import java.util.Random;
import java.util.Scanner;
public class ArrayMax
{
    public static int arrayMax (int [] A, int leng){
        int i, max, temp;
        max=A[leng];
        if (leng!=0){
            temp=arrayMax(A, leng-1);
            if(temp>max)
                max=temp;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba el tamaño del arreglo");
        int n= 100;
        for (int i = 10; i <= n; i+=10){
            long startTime = System.nanoTime();
            arrayMax(array(i), i-1);
            long estimatedTime = System.nanoTime() - startTime;       
            System.out.println(i+" "+estimatedTime);
        }
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
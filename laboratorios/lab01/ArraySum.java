
/**
 * Toma un arreglo y suma todos sus elementos.
 * 
 * @author Alejandro Arroyave Bedoya 
 * @version Septiembre 2017
 */
import java.util.Random;
public class ArraySum
{
    public static int arraySum(int[] nums, int len) {
        if (len==0)
            return nums[0];
        return nums[len]+arraySum(nums, len-1);
    }
    
    public static void main(String[] args){
        int n=100;
        for (int i = 10; i < n; i+=10){
            long startTime = System.nanoTime();
            arraySum (array(i), i-1);
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

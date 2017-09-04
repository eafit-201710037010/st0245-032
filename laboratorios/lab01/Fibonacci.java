import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba la posición de fibonacci:");
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++){
            long startTime = System.nanoTime();
            fibbo(i);
            long estimatedTime = System.nanoTime() - startTime;       
            System.out.println(i+" "+estimatedTime);
        }
    }

    public static int fibbo(int n){
        if (n==0)
            return 0;
        else{
            if (n==1)
                return 1;
            else
                return fibbo(n-1)+fibbo(n-2);
        }
    }
}
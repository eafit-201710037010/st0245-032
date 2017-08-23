import java.util.ArrayList;
import java.util.Scanner;
public class LeerArreglo
{

    public void leer(){
        ArrayList arrayAux = new ArrayList();
        Scanner s= new Scanner(System.in);
        while (true){
            System.out.println("Que numero desea agrear al arreglo?");
            int elem=s.nextInt();
            if (elem==-1) break;
            arrayAux.add(elem);
        }
        organizar(arrayAux);
    }
    
    public void organizar(ArrayList<Integer> arrayAux){
        System.out.println("Lista ingresada:");
        for (int i=0; i<arrayAux.size(); i++){
            System.out.print(arrayAux.get(i)+" ");
        }
        System.out.println();
        ArrayList array = new ArrayList();
        int ultPos=arrayAux.size()-1;
        while (ultPos>=0){
            array.add(arrayAux.get(ultPos));
            ultPos--;
        }
        System.out.println("Lista inversa:");
        for (int i=0; i<array.size(); i++){
            System.out.print(array.get(i)+" ");
        }
    }
}

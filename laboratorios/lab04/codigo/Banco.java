import java.util.Queue;
import java.util.LinkedList;
/**
 * This class take a array of rows of people and determine the order of attetion
 * 
 * @author Alejandro Arroyave Bedoya 
 * @version 2017/octubre
 */
public class Banco
{

    static private Queue [] conjunto= new Queue [4];
    /**
     * This is the main method of the class.
     * @param args - parameter default for the main method.
     */
    public static void main(String [] args) {
        Queue <String> cola1 = new LinkedList();
        Queue <String> cola2 = new LinkedList();
        Queue <String> cola3 = new LinkedList();
        Queue <String> cola4 = new LinkedList();
        cola1.add("Luis");
        cola1.add("Armando");
        cola1.add("Felipe");
        cola2.add("Alex");
        cola2.add("Bill");
        cola2.add("Mauricio");
        cola2.add("Sebastian");
        cola3.add("Juan");
        cola3.add("Brian");
        cola4.add("Santi");
        cola4.add("Pedro");
        conjunto[0]=cola1;
        conjunto[1]=cola2;
        conjunto[2]=cola3;
        conjunto[3]=cola4;
        atender(conjunto);
    }

    /**
     * Returns the node at the specified position in this list.
     * @param filas - array of rows of people to attend.
     */
    public static void atender(Queue [] filas) {
        boolean ocupado1=false;
        while(conjunto[0].peek()!=null || conjunto[1].peek()!=null ||
        conjunto[2].peek()!=null || conjunto[3].peek()!=null){
            for (int i=0; i<conjunto.length; i++){
                if(conjunto[i].peek()!=null){
                    if (!ocupado1){
                        System.out.println(conjunto[i].poll()+" Es atendido por el cajero 1");
                        ocupado1=true;
                    }else{
                        System.out.println(conjunto[i].poll()+" Es atendido por el cajero 2");
                        ocupado1=false;
                    }
                }
            }
        }
    }
}

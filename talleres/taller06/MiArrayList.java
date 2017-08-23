import java.util.Arrays;
public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];

    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros.
    public MiArrayList() {
        size=0;
        elements=new int [DEFAULT_CAPACITY];
    }

    // Retorna el tamaño de la lista
    public int size() {
        return size;
    }

    // Agrega un elemento e a la última posición de la lista
    public void add(int e) {
        if (size == elements.length){
            int elem[]= new int[elements.length*2];
            for(int i=0;i<=size;i++){
                elem[i]=elements[i];
            }
            elements = elem;
        }
        elements[size]=e;
        size++;
    }

    // Retorna el elemento que se encuentra en la posición i de la lista
    public int get(int i) {
        return elements[i];
    }

    // Agrega un elemento e en la posición index de la lista
    public void add(int index, int e) {
        if (size == elements.length){
            int elem[]= new int[elements.length*2];
            for(int i=0;i<=size;i++){
                elem[i]=elements[i];
            }
            elements = elem;
        }
        int i=size;
        while (i>=index){
            elements[i+1]=elements[i];
            i--;
        }
        elements[index]=e;
        size++;
    }
}


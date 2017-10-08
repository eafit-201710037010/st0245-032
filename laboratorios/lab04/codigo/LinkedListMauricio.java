import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    private Node first;
    private int size;

    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    /**
     * Returns the curret size of this list.
     * @return the size of the list
     */
    public int size()
    {
        return size;
    }

    /**
     * Insert the element at the specified position in this list.
     * @param data - data to insert in the list
     * @param index - position to be insert
     */
    public void insert(int data, int index)
    {
        try{
            Node aux = new Node (data);
            if (size==0){
                first=new Node (data);
            }else{
                if (index == 0){
                    aux.next=first;
                    first=aux;
                }else{
                    aux.next=getNode(index-1).next;
                    getNode(index-1).next=aux;
                }
            }
            size++;
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    /**
     * Remove the element at the specified position in this list.
     * @param index - position to be delete
     */
    public void remove(int index)
    {
        try{
            if (index==0)
                first=first.next;
            else{
                if (index == size-1){
                    getNode(index-1).next=null;
                }else{
                    getNode(index-1).next=getNode(index+1);
                }
            }
            size--;
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.exit(0);
        }

    }

    /**
     * Chack if a data is in the list.
     * @param data - data to search in the list
     * @return if a ingresed fact is in the list
     */
    public boolean contains(int data)
    {
        Node aux= new Node(data);
        Node temp= first;
        while (temp != null){
            if (temp.data == aux.data)
                return true;
            temp=temp.next;
        }
        return false;
    }

}
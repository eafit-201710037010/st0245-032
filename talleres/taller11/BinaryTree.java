
public class BinaryTree {
    public Node root;
 
        public BinaryTree(){
  root = null;
 }
  
    private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }
    
    private int maxheightAUX(Node node)
    {
        if (node == null)
                return 0;
        else 
                return max2(maxheightAUX(node.izq), maxheightAUX(node.der))+1;
    }
    
    public int maxheight()
    {
       return maxheightAUX(root);
    }
    //Postorden
    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.izq);
            recursivePrintAUX(node.der);
            System.out.println(node.dato);
        }
        
        
    }
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }
    
    private boolean search(Node nodo, int x)
    {
         System.out.println ("Buscado");
        if(nodo == null)
            return false;
        if(nodo.dato == x)
            return true;
        if(nodo.dato < x)
       
        return search(nodo.der,x);        
        return search(nodo.izq,x); 
    }
    
     public void insert(int x){
          System.out.println ("Insertado");
        insertAux(root, x);
    }
    
    private void insertAux(Node nodo, int x)
    {
        if(nodo == null)
            root = new Node(x);
        else if(x >= nodo.dato)
        {
            if(nodo.der == null)
                nodo.der = new Node(x);
            else
                insertAux(nodo.der,x);
        }
        else {
            if(nodo.izq == null)
                nodo.izq = new Node(x);
            else
                insertAux(nodo.izq,x);
        }
    }
    
    private void addNodo(Node nodo, Node root)
    {
       if(root == null)
            root = nodo;
        else if(nodo.dato >= root.dato)
        {
            if(nodo.der == null)
                root.der = nodo;
            else
                addNodo(nodo,root.der);
        }
        else {
            if(root.izq == null)
                root.izq = nodo;
            else
                addNodo(nodo,root.izq);
        }  
    }

    public void delete(int n)
    {
         System.out.println ("Eliminado");
        delete(root,n);
    }
    
    private void delete(Node nodo,int x)
    {
        if(nodo == null)
            return;
        if(nodo.dato == x)
        {
           Node nodoTemp = (nodo.izq);
            root = (nodo.der);
            if(nodoTemp!=null)
                addNodo(nodoTemp,root);
            return;
        }
        if(nodo.der != null)
        {
            if((nodo.der).dato == x)
            {
                Node nodoTemp = ((nodo.der).izq);
                (nodo.der) = (nodo.der).der;
                if(nodoTemp!=null)
                    addNodo(nodoTemp,root);
                return;
           }
           else if(x >= nodo.dato)
            delete(nodo.der,x);  
        }
        if(nodo.izq != null)
        {
            if((nodo.izq).dato == x)
            {
                Node nodoTemp = (nodo.izq).der;
                (nodo.izq) = (nodo.izq).izq;
                if(nodoTemp!=null)
                    addNodo(nodoTemp,root);
            }
            else if(x < nodo.dato)
                delete(nodo.izq,x); 
        }    
    }
}
    
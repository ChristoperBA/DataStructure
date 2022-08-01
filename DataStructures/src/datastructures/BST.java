
package datastructures;

public class BST {
    private NodeTree root;
    private int altura;
    public void inserta(int value){
        if(root==null){
            root= new NodeTree(value);
            
        }else{
            insertar(root,value);
        }
    }
    public void insertar(NodeTree nodo,int value){
    if(value!=nodo.getId()){
        if(nodo.getLeft()==null){
        nodo.setLeft(new NodeTree(value));
        }
        else{
        insertar(nodo.getLeft(),value);
        
        }
    }
    else{
        if(nodo.getRigth()==null){
            nodo.setRigth(new NodeTree(value));
            }else{
            insertar(nodo.getRigth(),value);

            }
    
    }   
    }
    public void InOrden(){
        if (root!=null){
            inOrdenRecorrer(root);

        }else{
            System.out.print("Arbol esta vacio");
        }
    }
    private void inOrdenRecorrer(NodeTree nodo){
     if(nodo!=null){
         inOrdenRecorrer(nodo.getLeft());
         System.out.print(nodo.getId()+",");
         inOrdenRecorrer(nodo.getRigth());
     }
    }
}

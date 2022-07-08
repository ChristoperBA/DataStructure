
package datastructures;

public class ListaCircularSimple {
    private node<Persona> head;
    private node<Persona> tail;
    
    public void insertar(Persona value){
    if(head==null){    
        head=new node<Persona>(value);//cabeza al nuevo nodo
        tail=head;//tail apunta a cabeza
        tail.setNext(head);//se enlaza a la cabeza
        }
    else if (head.getValue().getId() > value.getId())
        {
            node<Persona> aux = new node<Persona>(value);
            aux.setNext(head);
            head = aux;
            tail.setNext(head);//apunta a la cabeza
            

        }
    else{
    
    }
    
    
    }
    
    
}

package datastructures;

public class Lista2Circular {

    private node<Persona> head;
    private node<Persona> tail;

    public void insertar(Persona value) {

        if (head == null)
        {
            //No hay elementos y se hacen todos los punteros hacia el mismo nodo
            node<Persona> aux = new node<Persona>(value);
            head = aux;
            tail = head;
            //Punteros
            head.setNext(tail);
            tail.setNext(head);
            head.setBack(tail);
            tail.setBack(head);
        } else if (value.getId() < head.getValue().getId())
        {
            //Izquierda 
            node<Persona> aux = new node<Persona>(value);
            aux.setNext(head);
            //Punteros
            head.setBack(aux);
            head = aux;
            
            tail.setNext(head);
            head.setBack(tail);

        } else if (tail.getValue().getId() <= value.getId())
        {
            //Derecha del tail 
            node<Persona> aux = new node<Persona>(value);
            tail.setNext(aux);
            aux.setBack(tail);
            tail = tail.getNext();
            tail.setNext(head);
            head.setBack(tail);
            

        } else
        {
            //En medio 
            node<Persona> aux = head;
            //Recorre la lista para validar
            while (aux.getNext().getValue().getId() < value.getId())
            {
                aux = aux.getNext();
            }
            node<Persona> Temp = new node<Persona>(value);
            //Setea el siguiente
            Temp.setNext(aux.getNext());
            //Setea el de atras
            Temp.setBack(aux);
            //crea el enlace al nuevo nodo
            aux.setNext(Temp);
            //Back al nuevo nodo
            aux.getNext().setBack(Temp);

        }
    }
    public void imprimirLista() {
        node<Persona> aux = head;
        while (aux != tail)
        {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());
    }
    
    public boolean existe(int id){
        node<Persona> aux = head;
        if (head.getValue().getId() == id)
        {
            return true;
        }
        if (id == tail.getValue().getId())
        {
            return true;
        }
        aux = aux.getNext();
        while (aux != head)
        {
            if (aux.getValue().getId() == id)
            {
                return true;
            }
            aux = aux.getNext();

        }
        return false;
    }
    public void modifica(Persona value){
    }
    public void elimina(Persona value){
    }
    public void extrae(Persona value){
    }
    
}

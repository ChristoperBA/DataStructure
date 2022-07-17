package datastructures;

import java.util.Scanner;

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
    public void modificar(int id) {
        node<Persona> aux = head;
        String namemodif;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se le cambiara el nombre: ");
        namemodif = teclado.nextLine();

        if (id == head.getValue().getId())
        {

            head.getValue().setNombre(namemodif);

        } else if (id == tail.getValue().getId())
        {
            tail.getValue().setNombre(namemodif);
        } else
        {
            aux = aux.getNext();
            while (aux != head)
            {
                if (aux.getValue().getId() == id)
                {
                    aux.getValue().setNombre(namemodif);
                    break;
                }
                aux = aux.getNext();
            }
        }

    }
    public void eliminar(int id) {
        if (head == null)
        {
            System.out.println("La lista esta vacia");
        } else if (id == head.getValue().getId())
        {
            //Mueve head al siguiente nodo 
            head = head.getNext();
            head.setBack(tail);
            //Mantiene la circularidad
            tail.setNext(head);

        } else
        {
            node<Persona> aux = head;
            node<Persona> temp = aux.getNext();
            while (aux.getNext() != tail)
            {
                if (temp.getValue().getId() == id)
                {
                    aux.setNext(aux.getNext().getNext());
                    break;
                }
                aux = aux.getNext();
                temp = aux.getNext();

            }
            if (id == tail.getValue().getId())
            {
                tail = aux;
                tail.setNext(head);
                head.setNext(tail);
            }

        }

    }
    public Persona extraer(int id) {
        Persona p = null;
        node<Persona> aux;
        if (id == head.getValue().getId())
        {
            //Vacia el head
            aux = head;
            //Establece el segundo nodo como el head
            head = head.getNext();
            //cola apunta a la cabeza
            tail.setNext(head);
            //Cabeza atras apunta al tail
            head.setBack(tail);
           
            return aux.getValue();
        } else
        {
            //Empezamos en la cabeza
            aux = head;
            node<Persona> temp = aux.getNext();
            while (aux.getNext() != tail)
            {
                
                if (temp.getValue().getId() == id)
                {
                    aux.setNext(aux.getNext().getNext());
                    aux.getNext().getNext().setBack(aux);
                    
                    return temp.getValue();
                }

                aux = aux.getNext();
                temp = aux.getNext();

            }
            if (id == tail.getValue().getId())
            {
                tail = aux;
                tail.setNext(head);
                head.setNext(tail);
                return temp.getValue();
            }
        }
        if (p == null)
        {
            System.out.println("El ID: " + id + " no se ha encontrado en la lista");
            p = new Persona(id, "No existe");

        }
        return p;

    }
    
}

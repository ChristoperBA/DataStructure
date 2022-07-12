package datastructures;

import java.util.Scanner;

public class ListaCircularSimple {

    private node<Persona> head;
    private node<Persona> tail;

    public void insertar(Persona value) {
        if (head == null)
        {
            head = new node<Persona>(value);//cabeza al nuevo nodo
            tail = head;//tail apunta a cabeza
            tail.setNext(head);//se enlaza a la cabeza
        } else if (head.getValue().getId() > value.getId())
        {
            //Crea el nodo
            node<Persona> aux = new node<Persona>(value);
            //Creamos la referencia para el siguiente nodo
            aux.setNext(head);
            //asignamos a head al nuevo nodo 
            head = aux;
            //tail apunta a la cabeza
            tail.setNext(head);
        } //Insertar el valor en la cola, por que la cola actual es menor
        else if (tail.getValue().getId() <= value.getId())
        {
            //Crea el nodo
            node<Persona> aux = new node<Persona>(value);
            //tail agrega a siguiente al nuevo nodo 
            tail.setNext(aux);
            //igualamos la cola al nuevo nodo
            tail = aux;
            //mantenemos circularidad
            tail.setNext(head);

        } else
        {

            node<Persona> aux = tail;
            //Recorre la lista para validar
            while (aux.getNext().getValue().getId() < value.getId())
            {
                aux = aux.getNext();
            }
            node<Persona> Temp = new node<Persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);

        }

    }//Fin Insertar

    public void imprimirLista() {
        node<Persona> aux = head;
        while (aux != tail)
        {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());

    }

    public boolean existe(int id) {
        node<Persona> aux = head;
        if (head.getValue().getId() == id)
        {
            return true;
        }
        if (id == tail.getValue().getId())
        {
            return true;
        }
        aux=aux.getNext();
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
        System.out.println("Se le cambiara el nombre ");
        namemodif = teclado.nextLine();
        if (id == head.getValue().getId())
        {

            aux.getValue().setNombre(namemodif);
        }
        if (id == tail.getValue().getId())
        {

            aux.getValue().setNombre(namemodif);
        }

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

package datastructures;

public class Lista {

    private node<Persona> cabeza;

    public Lista() {
    }

    public void insertar(Persona value) {
        if (cabeza == null)
        {
            cabeza = new node<Persona>(value);
        } else if (cabeza.getValue().getId() > value.getId())
        {
            node<Persona> aux = new node<Persona>(value);
            aux.setNext(cabeza);
            cabeza = aux;

        } else if (cabeza.getValue().getId() < value.getId()&&cabeza.getNext()==null)
        {
            node<Persona> aux = new node<Persona>(value);
            cabeza.setNext(aux);
//        cabeza = aux;
        } else
        {
            node<Persona> aux = cabeza;
            //Recorre la lista para validar
            while (aux.getNext() != null && aux.getNext().getValue().getId() < value.getId())
            {
                aux = aux.getNext();
            }
            node<Persona> Temp = new node<Persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);

        }

    }

    public void imprimirLista() {
        node<Persona> aux = cabeza;
        while (aux.getNext() != null)
        {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
    }

    public boolean existe(int id) {
        node<Persona> aux = cabeza;
        while (aux.getNext() != null)
        {
            if (cabeza.getValue().getId() == id)
            {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

}

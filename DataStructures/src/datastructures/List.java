package datastructures;

public class List {

    private node<Persona> cabeza;

    public void insertar(Persona value) {
        if (cabeza == null)
        {
            //Cabeza vacia asigna el nuevo nodo
            cabeza = new node<Persona>(value);
        } else if (cabeza.getValue().getId() > value.getId())
        {
            //ID de cabeza es mayor que el ingresado, crea un nodo aux y lo setea como la cabeza, id de menor a mayor 
            node<Persona> aux = new node<Persona>(value);
            aux.setNext(cabeza);
            cabeza = aux;

        } else if (cabeza.getValue().getId() < value.getId() && cabeza.getNext() == null)
        {
            //si el ID de la cabeza es menor al ingresado y la cabeza es nula
            node<Persona> aux = new node<Persona>(value);
            cabeza.setNext(aux);
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

    //Imprime la lista
    public void imprimirLista() {
        node<Persona> aux = cabeza;
        while (aux != null)
        {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        
    }

    //Busca si el valor esta en la lista, devuelve un boolean 
    public boolean existe(int id) {
        
        node<Persona> aux = cabeza;
        while (aux!= null)
        {
            if (aux.getValue().getId() == id)
            {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    
    //malo
    public void modifica(Persona p) {
        node<Persona> aux = cabeza;
        while (aux != null && aux.getValue().getId() == p.getId())
        {
            aux = aux.getNext();

        }
        if (aux != null && aux.getValue().getId() == p.getId())
        {
            aux.getValue().setNombre(p.getNombre());
        }
    }

    public Persona extrae(int id) {
        Persona p = null;
        if (cabeza != null)
        {
            if (cabeza.getValue().getId() == id)
            {
                cabeza = cabeza.getNext();
            } 
            else
            {
                node<Persona> aux = cabeza;
                while (aux.getNext() != null && aux.getNext().getValue().getId()<id)
                {
                    aux = aux.getNext();

                }
                if (aux.getNext() != null && aux.getNext().getValue().getId() == id)
                {
                    p = (Persona) aux.getNext().getValue();
                    aux.setNext(aux.getNext().getNext());

                }

            }
        }
        return p;
    }
    //malo
    public void elimina(int id){
    if(cabeza!=null){
        cabeza=cabeza.getNext();
    
    }else{
        node<Persona> aux=cabeza;
        while(aux.getNext() != null && aux.getNext().getValue().getId()<id){
        aux=aux.getNext();
        }
        if(aux.getNext()!=null&&aux.getNext().getValue().getId()==id){
            aux.setNext(aux.getNext().getNext());
        }
    
    }
    
    }

}

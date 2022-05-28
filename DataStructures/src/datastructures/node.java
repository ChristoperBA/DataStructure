/*
 
 */
package datastructures;

/*
 Christopher Briceño 
Clase 2
Nodos
*/
public class node {
    private int value;
    private node next;

    //Constructor
    public node() {
        this.value = 0;
        this.next = null;
    }

    //Acceder a los atributos por medio de metodos
    public int getValue() {
        return value;
    }

    public node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(node next) {
        this.next = next;
    }
    
}

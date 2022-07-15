/*
 
 */
package datastructures;

/*
 Christopher Briceño 
Clase 2
Nodos
 */
public class node<T> {

    private T value;
    private node<T> next; // Apunta al siguiente nodo
    private node<T> back;

    //Constructor
    public node(T value) {
        this.value = value;
        
    }

    public node<T> getBack() {
        return back;
    }
    public void setBack(node<T> back) {
        this.back = back;
    }

    //Get accede a value desde otra clase
    public Persona getValue() {
        return (Persona) value;
    }

    // Set modifica el valor desde otra clase
    public void setValue(T value) {
        this.value = value;
    }

    //Get accede a value desde otra clase nodo next
    public node getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

}

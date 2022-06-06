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

    //Constructor

    public node(T value) {
        this.value = value;
        this.next = next;
    }
    
   //Get accede a value desde otra clase
    public T getValue() {
        return value;
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

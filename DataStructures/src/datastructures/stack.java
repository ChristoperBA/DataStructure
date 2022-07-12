/*
 
 */
package datastructures;

/**
 
 */
public class stack<T> {
    private node<T> top;
    
    //Push usa void porque no devuelve nada
    public void push(T value){
        node<T> newNode = new node<T>(value);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.setNext(top);
            top=newNode;
        }
    
    }
    //void quitar el ultimo elemento y si es node devuelve node
//    public T pop(){
//    node<T> aux=top;
//    if(top!=null){
//        top=top.getNext();
//        return aux.getValue();
//    }else{
//        return null;
//    }
//    
//    
//    }
}

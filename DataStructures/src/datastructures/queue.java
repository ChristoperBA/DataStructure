/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;


public class queue<T> {
    private node<T> Head;
    private node<T> Tail;
    
    public void enqueue(T value){
        node<T> newNode= new node<T>(value);
        if(Head==null){
            //head new node y tail es new node
            Head=newNode;
            Tail=newNode;

        }
        else{
           //Tail apunta al cambia del nodo actual al nuevo nodo, head no se mueve
           Tail.setNext(newNode); 
           Tail=newNode;
        }
    }
    public node<T> dequeue(){
    if(Head==null){
        System.out.println("La cola esta vacia");
        return null;
    }else{
        
        node<T> firstInQueue= Head;
        Head=Head.getNext();// apunta al siguiente head y saca al primero de la cola
        return firstInQueue;
    }
    
    }
    
}

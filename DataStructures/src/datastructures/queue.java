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
            Head=newNode;
            Tail=newNode;

        }
        else{
           Tail.setNext(newNode); 
           Tail=newNode;
        }
    }
    //public void dequeue(){}
    
}

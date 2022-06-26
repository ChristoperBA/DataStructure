/*
Christopher Briceño 
Main para Estructura de datos
Profesor Kenneth Alvarado
*/
package datastructures;
public class DataStructures {

    /*
     
    */
    public static void main(String[] args) {
    //---------------------------Recursividad-------------------------//
    //Semana 2
    //Para numeros factoriales #cambiar n por un numero 
    //System.out.println(Recursividad.factorial(1));
    
    /*
    Recursividad en arreglos 
    int[] arr={12,24,4,2,3};
    Encontrar numero max en arreglo 
    System.out.println("El numero mayor dentro del arreglos es: "+Recursividad.encontrarMax(arr,1,arr[0]));
   Encontrar indice del numero mas grande
    System.out.println("La posicion del mayor dentro del arreglos es: "+Recursividad.encontrarIndice(arr,0,arr[0],0));
    */
    
    //---------------------------Pilas-------------------------//
    //Semana 3
    
//    stack <String> Pila= new stack<String>();
//    Pila.push("Jose");
//    Pila.push("Maria");
//    Pila.push("Pablo");
//    Pila.push("Chris");
//    Pila.push("Kenneth");
//    System.out.println();//Pila.pop borra el ultimo elemento agregado en la pila
   
    //stack <String> Pilanumero= new stack<String>();
    //---------------------------Colas-------------------------//
//    queue<Integer> Cola = new queue<Integer>();
//    Cola.enqueue(10);
//    Cola.enqueue(15);
//    Cola.enqueue(13);
//    Cola.enqueue(135);
//    Cola.enqueue(153);
    //Cola.dequeue();
    
    //System.out.println(Cola.dequeue().getValue());
    
    //---------------------------Listas Simples-------------------------//
    Lista<Persona> Lista= new Lista();
    Lista.insertar(new Persona(10, "Juan"));
    Lista.insertar(new Persona(5, "Sofia"));
    Lista.insertar(new Persona(10, "Julian"));
    Lista.imprimirLista();
    }
}


package B_Tree;

/**
 *
 * @author Carlos San Juan <carlossanjuanc@gmail.com>
 * Grupo #6
 * Arbol B
 * Integrantes:
 * 
 * Anthony Fajardo
 * Christopher Briceño
 * Leonardo Enrique Reyes Vargas
 */
public class NodoArbolB {

    int n; //numero de claves almacenadas en el nodo
    boolean leaf; //Si el nodo es hoja (nodo hoja=true; nodo interno=false)
    int key[];  //almacena las claves en el nodo
    NodoArbolB child[]; //arreglo con referencias a los hijos

    //Constructores
    public NodoArbolB(int t) {
        n = 0;
        leaf = true;
        key = new int[((2 * t) - 1)];
        child = new NodoArbolB[(2 * t)];
    }

    //metodo que imprime el arbol B
    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(key[i] + " | ");
            } else {
                System.out.print(key[i]);
            }
        }
        System.out.print("]");
    }
    //Metodo que busca un nodo k
    public int find(int k) {
        for (int i = 0; i < n; i++) {
            if (key[i] == k) {
                return i;
            }
        }
        return -1;
    }
}

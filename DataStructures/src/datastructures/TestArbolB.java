package B_Tree;

/**
 * Autor del codigo 
 * @author Carlos San Juan <carlossanjuanc@gmail.com>
 * 
 * Grupo #6
 * Arbol B
 * Integrantes:
 * 
 * Anthony Fajardo
 * Christopher Briceño
 * Leonardo Enrique Reyes Vargas
 */
public class TestArbolB {

    public static void main(String[] args) {
        //La palabra t es el grado minimo del arbol
        //Cada nodo soporta 2t hijos(6) y 2t-1 claves(5)
        int t = 3;
        //Se crea el arbol B segun t
        ArbolB arbolB = new ArbolB(t);
        
        //Se ingresan los nodos, por medio de un array 
        int[] valoresUno = {20, 10, 50, 30, 40};
        System.out.println("-- INICIO --");
        System.out.println("INSERTANDO VALORES AL ARBOL B");
        for(int i=0; i<valoresUno.length; i++) {
            System.out.println("Insertando... valor " + valoresUno[i]);
            arbolB.insertar(valoresUno[i]);
        }
        
        //Mostrando arbol B por pantalla en preorder
        System.out.println("ESTADO ARBOL B");
        arbolB.showBTree();
        System.out.println("");
        
        //Valores a ingresar segunda ronda
        System.out.println("Insertando... valor 60");
        arbolB.insertar(60);
        //Mostrando arbol B por pantalla en preorder
        System.out.println("ESTADO ARBOL B");
        arbolB.showBTree();
        System.out.println("");
        
        //Valores a ingresar tercera ronda
        System.out.println("Insertando... valor 80");
        arbolB.insertar(80);
        System.out.println("Insertando... valor 70");
        arbolB.insertar(70);
        System.out.println("Insertando... valor 90");
        arbolB.insertar(90);
        //Mostrando arbol B por pantalla en preorder
        System.out.println("ESTADO ARBOL B");
        arbolB.showBTree();
        System.out.println("");

        //Buscar
        System.out.println("\nBuscando el nodo con el valor 80 en el arbol B:");
        arbolB.buscarNodoPorClave(80);
        
        //IMPLEMENTAR
        System.out.println("\nEl valor maximo del arbol B es : " + arbolB.buscarClaveMayor());
        
        System.out.print("El nodo minimo de la raiz del arbol B es :");
        arbolB.mostrarClavesNodoMinimo();
        
        System.out.println("");
        System.out.println("-- FIN --");
    }
}

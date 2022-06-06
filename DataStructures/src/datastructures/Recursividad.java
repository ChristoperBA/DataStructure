/*

 */
package datastructures;

/*
Clase 2
 El metodo recursivo debe tener
 Minimo una Condicion de Parada/Base,que nos permita devolver un valor
 Una llamada así misma
*/
public class Recursividad {
    
    /*
    FACTORIAL 
    
    //Hacer estructura para factoriales
    public static int factorial(int n)
    {
      if (n==0)
      {
          return 1;
      }
      else
      {
          return n*factorial(n-1);
      }
    }
    */
    
     
    
    
    /* 
    ###Recursividad en arreglos 
   
    Encontrar el numero max en un arreglo con recursividad
    public static int encontrarMax(int[] numeros, int indice,int max ){
      if(indice!=numeros.length)
      {
          if (numeros[indice]>max)
          {
              max= encontrarMax(numeros,indice +1,numeros[indice]);
          }
          else
          {
            max= encontrarMax(numeros,indice +1,max);
          }
      }
      return max;
    }
    Encontrar Indice en un arreglo con recursividad
    public static int encontrarIndice(int[] numeros, int indice,int max,int pos){
      
      if(indice!=numeros.length)
      {
          if (numeros[indice]>max)
          {
             pos= encontrarIndice(numeros,indice +1,numeros[indice],indice);
          }
          else
          {
            pos= encontrarIndice(numeros,indice +1,max,pos);
          }  
      }
      return pos;
    }
    */
   
}

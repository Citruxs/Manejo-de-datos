/**
  * Interfaz que define las operaciones para implementar una Lista
  * @author Gerardo Aviles Rosas
  * @version Marzo de 2015
  */
interface Listable<T>{
 /**
   * Elimina la primera ocurrencia de un elemento.
   * @param e El elemento a eliminar.
   */
 void eliminar(T e);
 /**
   * Metodo que se encarga de buscar el Nodo que contenga el elemento 
   * <br>pasado como parametro. 
   * @param e El elemento a buscar.
   * @return Nodo El nodo que lo contiene, null en caso contrario
   */
 public Nodo<T> buscar(T e);
 /**
   * Metodo que se encarga de determinar si el elemento pasado como parámetro se
   * <br>encuentra o no en la Lista.
   * @param e El elemento a buscar.
   * @return boolean true si encuentra el elemento, false en otro caso
   */
 public boolean contiene(T e);
 /**
   * Metodo que devuelve un Iterador con todos los elementos de la Lista.
   * @return Iterador con todos los elementos de la Lista.
   */
 public java.util.Iterator<T> elementos();
 /** Metodo que determina si la Lista está o no vacía.
   * @return boolean true si esta vacía, false en otro caso.
   */
 public boolean estaVacia();
 /**
   * Inserta un elemento al inicio de la lista.
   * @param e El elemento que se almacenará en el nuevo Nodo.
   */
 public void agregar(T e);
 /**
   * Metodo que vacía la Lista en tiempo constante
   */
 public void limpiar();
 /**
   * Metodo que devuelve el primer Nodo de la Lista
   * @return Nodo El primer Nodo de la Lista
   */
 public Nodo<T> primero();
 /**
   * Sustituye el valor actual de un Nodo por otro nuevo. 
   * <br>Se usa el metodo buscar para
   * <br>determinar cual es el Nodo que contiene el valor buscado.
   * @param original El valor original del Nodo.
   * @param nuevo El nuevo valor del Nodo.
   */
 public void sustituir(T original,T nuevo);
}
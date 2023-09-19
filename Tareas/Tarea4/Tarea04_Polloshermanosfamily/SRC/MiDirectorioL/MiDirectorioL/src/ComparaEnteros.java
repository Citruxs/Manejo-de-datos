/**
 * ComparaEdad.java
 * Clase que permite implementar la interfaz Comparator
 * <br>En este caso la comparación se hace para enteros
 * @author Gerardo Avilés Rosas
 * @version Octubre de 2020
 */
public class ComparaEnteros implements java.util.Comparator<Integer> {
  /**
   * Método que especifica la forma en cómo se van a comparar los objetos
   * @param p1 Una de las personas para comparar
   * @param p2 Una de las personas para comparar
   * @return int 0 si son iguales, mayor a 0 si p1 es mayor que p2, menor a 0 si p2 es mayor que p1
   */
  public int compare(Integer o1, Integer o2) {
    return o1 - o2;
  }
}
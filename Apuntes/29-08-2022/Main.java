public class Main{
    public static int factorial (int numero) {
        if (numero==0)
        return 1;
        else
        return numero * factorial(numero - 1);
        }
    
/**
* Método para ordenar un arreglo de datos usando Quicksort
* @param datos[] arreglo de enteros a ordenar
*/
public static void quick(int datos[]) {
    quick(datos, 0, datos.length);
    }
    /*
    * Método para ordenar el sub-arreglo de datos que va de inf a sup
    */
    private static void quick(int [] datos, int inf, int sup){
    if (inf >= sup) return; // El arreglo ya está ordenado.
    int indicePivote = (inf+sup)/2; // Toma el elemento de la mitad como pivote
    indicePivote = pivote(datos, inf, sup, indicePivote);
    // Ordena los dos subarreglos
    quick(datos, inf, indicePivote);
    quick(datos, indicePivote + 1, sup);
    }

/*
* Método privado para colocar el pivote para ordenar datos
* @param inicio índice a partir de donde se recorre el arreglo
* @param fin índice hasta donde se recorre el arreglo
* @param pos posición del pivote
*/
private static int pivote(int datos[], int inicio, int fin, int pos){
    int izq = inicio + 1; int der = fin; int tmp;
    intercambiar(datos, inicio, pos); //Coloca el pivote en la pos inicial
    while (izq < der)
    if (datos[izq] < datos[inicio]) izq++;
    else if ( datos[--der] < datos[inicio]) intercambiar(datos, izq, der);
    intercambiar(datos, inicio, --izq); // Pone el pivote en su lugar
    return izq;
    }
    /* Método privado utilizado para intercambiar dos datos del arreglo. */
    private static void intercambiar(int a[], int i, int j){
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
    }


    public static void main(String[] args) {
        int[] a ={2,3,4,5,6,7,8};
        Vector v1 = new Vector(a);
        System.out.println(factorial(a[6]));
    }
}
package PruebaAlgoritmos;

import graficacion.Datos;
import graficacion.Grafica;
import ordenamiento.Algoritmo;
import ordenamiento.BubbleSort;
import ordenamiento.InsertionSort;
import ordenamiento.MergeSort;
import ordenamiento.QuickSort;
import ordenamiento.ShellSort;
import pruebas.*;
import pruebas.ordenamiento.PruebaOrdenamientos1;
import pruebas.ordenamiento.PruebaOrdenamientos2;
import pruebas.ordenamiento.PruebaOrdenamientos3;

/**
 *
 */
/**
 * Clase que se encarga de probar la eficiencia de 5 metodos de ordenamiento:
 * Insertion Sort, Bubble Sort, Shell Sort, Merge Sort y Quick Sort, mediante la
 * ejecucion de 3 diferentes pruebas almacenadas en las clases:
 * PruebaOrdenamientos1, PruebaOrdenamientos2 y PruebaOrdenamientos3.
 *
 * @author alumno correo
 */
public class PruebaAlgoritmos {

    /**
     * Metodo principal de la clase que se encarga de ejecutar las 3 pruebas.
     *
     * @param args
     */
    public static void main(String args[]) {
        int[] parametros = {600, 1200, 1800, 2400, 3000, 3600, 4200, 4800, 5400};
        Algoritmo bubbleSort = new BubbleSort();
        Algoritmo quickSort = new QuickSort();
        Algoritmo mergeSort = new MergeSort();
        Algoritmo insertionSort = new InsertionSort();
        Algoritmo shellSort = new ShellSort();
        
        Probador pruebabubble1 = new PruebaOrdenamientos1(bubbleSort);
        Probador pruebaquick1 = new PruebaOrdenamientos1(quickSort);
        Probador pruebamerge1 = new PruebaOrdenamientos1(mergeSort);
        Probador pruebainsertion1 = new PruebaOrdenamientos1(insertionSort);
        Probador pruebashell1 = new PruebaOrdenamientos1(shellSort);
        
        Probador pruebabubble2 = new PruebaOrdenamientos2(bubbleSort);
        Probador pruebaquick2 = new PruebaOrdenamientos2(quickSort);
        Probador pruebamerge2 = new PruebaOrdenamientos2(mergeSort);
        Probador pruebainsertion2 = new PruebaOrdenamientos2(insertionSort);
        Probador pruebashell2 = new PruebaOrdenamientos2(shellSort);
        
        Probador pruebabubble3 = new PruebaOrdenamientos3(bubbleSort);
        Probador pruebaquick3 = new PruebaOrdenamientos3(quickSort);
        Probador pruebamerge3 = new PruebaOrdenamientos3(mergeSort);
        Probador pruebainsertion3 = new PruebaOrdenamientos3(insertionSort);
        Probador pruebashell3 = new PruebaOrdenamientos3(shellSort);
        
        Datos datosbubble1 = new Datos("Bubble Sort", Probador.prueba(parametros,pruebabubble1));
        Datos datosquick1 = new Datos("Quick Sort", Probador.prueba(parametros,pruebaquick1));
        Datos datosmerge1 = new Datos("Merge Sort", Probador.prueba(parametros,pruebamerge1));
        Datos datosinsertion1 = new Datos("Insertion Sort", Probador.prueba(parametros,pruebainsertion1));
        Datos datosshell1 = new Datos("Shell Sort", Probador.prueba(parametros,pruebashell1));
        
        Datos datosbubble2 = new Datos("Bubble Sort", Probador.prueba(parametros,pruebabubble2));
        Datos datosquick2 = new Datos("Quick Sort", Probador.prueba(parametros,pruebaquick2));
        Datos datosmerge2 = new Datos("Merge Sort", Probador.prueba(parametros,pruebamerge2));
        Datos datosinsertion2 = new Datos("Insertion Sort", Probador.prueba(parametros,pruebainsertion2));
        Datos datosshell2 = new Datos("Shell Sort", Probador.prueba(parametros,pruebashell2));
        
        Datos datosbubble3 = new Datos("Bubble Sort", Probador.prueba(parametros,pruebabubble3));
        Datos datosquick3 = new Datos("Quick Sort", Probador.prueba(parametros,pruebaquick3));
        Datos datosmerge3 = new Datos("Merge Sort", Probador.prueba(parametros,pruebamerge3));
        Datos datosinsertion3 = new Datos("Insertion Sort", Probador.prueba(parametros,pruebainsertion3));
        Datos datosshell3 = new Datos("Shell Sort", Probador.prueba(parametros,pruebashell3));
        
        Datos[] conjuntoDatos1 = {datosbubble1,datosquick1,datosmerge1,datosinsertion1,datosshell1};
        Datos[] conjuntoDatos2 = {datosbubble2,datosquick2,datosmerge2,datosinsertion2,datosshell2};
        Datos[] conjuntoDatos3 = {datosbubble3,datosquick3,datosmerge3,datosinsertion3,datosshell3};
        
        Grafica.grafica("Prueba 1 – Datos Ordenados Ascendente", "Datos de entrada (n)","Tiempo (ms)", conjuntoDatos1);
        Grafica.grafica("Prueba 2 – Datos Ordenados Descendente", "Datos de entrada (n)","Tiempo (ms)", conjuntoDatos2);
        Grafica.grafica("Prueba 3 – Datos Desordenados", "Datos de entrada (n)","Tiempo (ms)", conjuntoDatos3);

    }

}

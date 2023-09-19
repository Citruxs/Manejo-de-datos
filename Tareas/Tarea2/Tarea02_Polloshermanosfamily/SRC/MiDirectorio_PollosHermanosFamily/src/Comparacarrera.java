import java.util.Arrays;

//Con esta clase es como contruimos el argumento con el que comparara bubble sort
public class Comparacarrera implements java.util.Comparator<Alumno> {

    @Override
    public int compare(Alumno a1, Alumno a2) {
        int i = Arrays.toString(a1.getCarrera()).compareTo(Arrays.toString(a2.getCarrera()));
        return i; //Arrays.toString convierte un arreglo en un String
        //El metodo .comparteTo lo que hace es asignar un valor numerico al comparar 2 cadenas, por eso necesitamos convertir los arreglos en cadenas
    }
}

import java.util.Arrays;

//Con esta clase es como contruimos el argumento con el que comparara bubble sort
public class Comparanombre implements java.util.Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        int i = Arrays.toString(p1.getNombre()).compareTo(Arrays.toString(p2.getNombre()));
        return i; //Arrays.toString convierte un arreglo en un String
        //El metodo .comparteTo lo que hace es asignar un valor numerico al comparar 2 cadenas, por eso necesitamos convertir los arreglos en cadenas
    }
}

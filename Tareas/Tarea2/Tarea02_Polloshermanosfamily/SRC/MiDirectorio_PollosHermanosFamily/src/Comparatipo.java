import java.util.Arrays;

public class Comparatipo implements java.util.Comparator<Persona> {//Metodo que especifica la forma en la que se compararan los objetos

    @Override
    public int compare(Persona p1, Persona p2) {
        if(Arrays.toString(p1.getTipo()).compareTo(Arrays.toString(p2.getTipo())) == 0){
            int i = Arrays.toString(p1.getNombre()).compareTo(Arrays.toString(p2.getNombre()));
            return i;
        }
        else{
        int i = Arrays.toString(p1.getTipo()).compareTo(Arrays.toString(p2.getTipo()));
        return i;
        } //Arrays.toString convierte un arreglo en un String
        //El metodo .comparteTo lo que hace es asignar un valor numerico al comparar 2 cadenas, por eso necesitamos convertir los arreglos en cadenas
    }
}

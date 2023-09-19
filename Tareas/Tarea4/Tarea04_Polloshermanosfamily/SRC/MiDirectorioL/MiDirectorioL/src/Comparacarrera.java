public class Comparacarrera implements java.util.Comparator<Alumno>{
    @Override
    public int compare(Alumno a1, Alumno a2){
        int i = a1.getCarrera().compareTo(a2.getCarrera());
        return i;
    }
}

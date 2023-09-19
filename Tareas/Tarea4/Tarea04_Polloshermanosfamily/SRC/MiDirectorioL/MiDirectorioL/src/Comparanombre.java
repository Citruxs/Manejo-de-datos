public class Comparanombre implements java.util.Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        int i = p1.getNombre().compareTo(p2.getNombre());
        return i;
    }
}

public class Comparacorreo implements java.util.Comparator<Persona> {
    
    @Override
    public int compare(Persona p1, Persona p2){
        if(p1.getCorreo().compareTo(p2.getCorreo()) == 0){
            int i = p1.getNombre().compareTo(p2.getNombre());
            return i;
        }
        else{
            int i = p1.getCorreo().compareTo(p2.getCorreo());
            return i;
        }
    }
}

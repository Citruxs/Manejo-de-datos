public class Alumno extends Persona{
    //Propias de la clase alumno
    private long[] numeroc;
    private long[] semestre;
    private String[] carrera;
    private String[] materias;

    public String[] getCarrera() {
        return carrera;
    }
    //Estructura para un contacto del tipo alumno
    public Alumno(String[] tipo, String[] nombre, String[] correo, String[] fechadc, long[] celular, long[] numeroc, long[] semestre, String[] carrera, String[] materias){
        super(tipo, nombre, correo, fechadc, celular);
        this.numeroc = numeroc;
        this.semestre = semestre;
        this.carrera = carrera;
        this.materias = materias;
    }
    
    public String toString(){
        String r = super.toString() + "\n" +"Numero de cuenta: " + super.imprimeArreglolong(this.numeroc) + "\n" + "Semestre: " + super.imprimeArreglolong(this.semestre) + "\n" + "Carrera: " + super.imprimeArregloString(this.carrera) + "\n" + "Materias: " + super.imprimeArregloString(this.materias);
        return r;
    }
}

public class Alumno extends Persona {
    private long numeroc;
    private int semestre;
    private String carrera;
    private String materias;

    public Alumno(String tipo, String nombre, String correo, String fecha, long celular, long numeroc, int semestre,
            String carrera, String materias) {
        super(tipo, nombre, correo, fecha, celular);
        this.numeroc = numeroc;
        this.semestre = semestre;
        this.carrera = carrera;
        this.materias = materias;
    }

    public long getNumeroc() {
        return numeroc;
    }
    public void setNumeroc(long numeroc) {
        this.numeroc = numeroc;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getMaterias() {
        return materias;
    }
    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String toString(){
        String s = super.toString() +" | Cuenta alumno: " + getNumeroc() +
        " | Semestre: " + getSemestre() + " | Carrera: " + getCarrera() +
        " | Materias: " + getMaterias() + "\n";
        return s;
    }

}

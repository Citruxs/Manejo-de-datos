public class Profesor extends Persona {
    private long numeroprof;
    private String carrera;
    private String depescolar;
    private String grupos;
    private double sueldo;
    private long toficiona;

    public Profesor(String tipo, String nombre, String correo, String fecha, long celular, long numeroprof,
            String carrera, String depescolar, String grupos, double sueldo, long toficiona) {
        super(tipo, nombre, correo, fecha, celular);
        this.numeroprof = numeroprof;
        this.carrera = carrera;
        this.depescolar = depescolar;
        this.grupos = grupos;
        this.sueldo = sueldo;
        this.toficiona = toficiona;
    }
    
    public long getNumeroprof() {
        return numeroprof;
    }
    public void setNumeroprof(long numeroprof) {
        this.numeroprof = numeroprof;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getDepescolar() {
        return depescolar;
    }
    public void setDepescolar(String depescolar) {
        this.depescolar = depescolar;
    }
    public String getGrupos() {
        return grupos;
    }
    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public long getToficiona() {
        return toficiona;
    }
    public void setToficiona(long toficiona) {
        this.toficiona = toficiona;
    }

    public String toString(){
        String s = super.toString() +" | Cuenta profesor: " + getNumeroprof() +
        " | Carrera: " + getCarrera() + " | Departamento escolar: " + getDepescolar() +
        " | Grupos: " + getGrupos() + " | Sueldo: " + getSueldo() + " | Telefono de oficina: " + getToficiona() + "\n"; 
        return s;
    }
}

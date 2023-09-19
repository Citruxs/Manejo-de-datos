public class Coordinador extends Persona {
    private long numeroemp;
    private String depescolar;
    private String grupos;
    private double sueldo;
    private long toficiona;

    public Coordinador(String tipo, String nombre, String correo, String fecha, long celular, long numeroemp,
            String depescolar, String grupos, double sueldo, long toficiona) {
        super(tipo, nombre, correo, fecha, celular);
        this.numeroemp = numeroemp;
        this.depescolar = depescolar;
        this.grupos = grupos;
        this.sueldo = sueldo;
        this.toficiona = toficiona;
    }

    public long getNumeroemp() {
        return numeroemp;
    }
    public void setNumeroemp(long numeroemp) {
        this.numeroemp = numeroemp;
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
        String s = super.toString() +" | Cuenta coordinador: " + getNumeroemp() +
        " | Departamento escolar: " + getDepescolar() + " | Grupos: " + getGrupos() +
        " | Sueldo: " + getSueldo() + " | Telefono de oficina: " + getToficiona() + "\n";
        return s;
    }

}

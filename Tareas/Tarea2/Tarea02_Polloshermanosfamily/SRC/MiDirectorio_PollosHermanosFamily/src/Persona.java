public class Persona{
    private String[] tipo;
    private String[] nombre;
    private String[] correo;
    private String[] fechadc;
    private long[] celular;

    public Persona(String[] tipo, String[] nombre, String[] correo, String[] fechadc, long[] celular){
        this.tipo = tipo;
        this.nombre = nombre;
        this.correo = correo;
        this.fechadc = fechadc;
        this.celular = celular;
    }

    public String[] getTipo() {
        return tipo;
    }

    public String[] getNombre() {
        return nombre;
    }

    public String[] getCorreo() {
        return correo;
    }

    public String[] getFechadc() {
        return fechadc;
    }

    public long[] getCelular() {
        return celular;
    }

    //Metodo para imprimir arreglos tipo String
    public static String imprimeArregloString(String[] arr) {
        String s = "";
        for (int i = 0; i < arr.length-1; i++ ) {
            s += arr[i] + ", ";
        }
        s += arr[arr.length-1];
        s += "";
        return s;
    }

    //Método para imprimir arreglos tipo int
    public static String imprimeArregloInt(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length-1; i++ ) {
            s += arr[i] + ", ";
        }
        s += arr[arr.length-1];
        s += "";
        return s;
    }

    public static String imprimeArreglolong(long[] arr){
        String s = "";
        for (int i = 0; i < arr.length-1; i++ ) {
            s += arr[i] + ", ";
        }
        s += arr[arr.length-1];
        s += "";
        return s;
    }

    public static String imprimeArregloDou(double[] arr){
        String s = "";
        for (int i = 0; i < arr.length-1; i++ ) {
            s += arr[i] + ", ";
        }
        s += arr[arr.length-1];
        s += "";
        return s;
    }

    //Metodo to String para imprimir contacto
    public String toString(){
        String s = imprimeArregloString(this.tipo) + ": " + imprimeArregloString(this.nombre) + "\n" + "Correo: " + imprimeArregloString(this.correo) + "\n" + "Fecha de nacimiento: " + imprimeArregloString(this.fechadc) + "\n" + "Celular: " + imprimeArreglolong(this.celular);
        return s;
    }
}
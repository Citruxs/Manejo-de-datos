public class Profesor extends Persona {
        //Propias de la clase profesor
        private long[] numeroprof;
        private String[] carrera;
        private String[] depescolar;
        private String[] grupos;
        private double[] sueldo;
        private long[] toficiona;
        
        public String[] getCarrera() {
            return carrera;
        }

        public double[] getSueldo() {
            return sueldo;
        }
        //Estructura de un contacto del tipo profesor
        public Profesor(String[] tipo, String[] nombre, String[] correo, String[] fechadc, long[] celular, long[] numeroprof, String[] carrera, String[] depescolar, String[] grupos, double[] sueldo, long[] toficiona){
            super(tipo, nombre, correo, fechadc, celular);
            this.numeroprof = numeroprof;
            this.carrera = carrera;
            this.depescolar = depescolar;
            this.grupos = grupos;
            this.sueldo = sueldo;
            this.toficiona = toficiona;
        }

        public String toString(){
            String r = super.toString() + "\n" +"Numero de cuenta: " + super.imprimeArreglolong(this.numeroprof) + "\n" + "Carrera: " + super.imprimeArregloString(this.carrera) + "\n" + "Departamento escolar: " + super.imprimeArregloString(this.depescolar) + "\n" + "Grupos: " + super.imprimeArregloString(this.grupos) + "\n" + "Sueldo: " + super.imprimeArregloDou(this.sueldo) + "\n" + "Telefono de oficina: " + super.imprimeArreglolong(this.toficiona);
            return r;
        }
}

public class Coordinador extends Persona {
        //Propias de la clase coordinador
        private long[] numeroemp;
        private String[] depescolar;
        private String[] grupos;
        private double[] sueldo;
        private long[] toficiona;

        public String[] getCarrera() {
            return depescolar;
        }

        public double[] getSueldo() {
            return sueldo;
        }
        //Estructura de un contacto de tipo coordinador
        public Coordinador(String[] tipo, String[] nombre, String[] correo, String[] fechadc, long[] celular, long[] numeroemp, String[] depescolar, String[] grupos, double[] sueldo, long[] toficiona){
            super(tipo, nombre, correo, fechadc, celular);
            this.numeroemp = numeroemp;
            this.depescolar = depescolar;
            this.grupos = grupos;
            this.sueldo = sueldo;
            this.toficiona = toficiona;
        }

        public String toString(){
            String r = super.toString() + "\n" +"Numero de cuenta: " + super.imprimeArreglolong(this.numeroemp) + "\n" + "Departamento escolar: " + super.imprimeArregloString(this.depescolar) + "\n" + "Grupos: " + super.imprimeArregloString(this.grupos) + "\n" + "Sueldo: " + super.imprimeArregloDou(this.sueldo) + "\n" + "Telefono de oficina: " + super.imprimeArreglolong(this.toficiona);
            return r;
        }
}

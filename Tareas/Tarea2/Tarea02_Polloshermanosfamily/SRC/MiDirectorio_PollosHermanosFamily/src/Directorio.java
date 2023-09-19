import java.util.Arrays;
public class Directorio{

    private Persona[] dir;

    public Directorio(Persona[] dir){
        this.dir = dir;
    }

    //Mostrar la información completa de un contacto, con solo proporcionar su nombre (independientemente que sea un
    //alumno, profesor o coordinador).
    public static boolean busquedaN(Persona[] dir, String[] nombreB){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null ){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(),nombreB)){
                return true;
            }
        }
        return false;
    }

    //Mostrar la información completa de un contacto, con solo proporcionar su nombre (independientemente que sea un
    //alumno, profesor o coordinador). ###AUXILIAR###
    public static Persona busquedaN1(Persona[] dir, String[] nombreB){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(),nombreB)){
                return dir[i];
            }
        }
        return null;
    }

    //Mostrar la información completa de un contacto, dado su nombre y rol (alumno, profesor o director).
    public static boolean busquedaNR(Persona[] dir, String[] nombreB, String[] rol){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(), nombreB) && Arrays.equals(dir[i].getTipo(), rol)){
                return true;
            }
        }
        return false;
    }

    //Mostrar la información completa de un contacto, dado su nombre y rol (alumno, profesor o director). ###AUXILIAR###
    public static Persona busquedaNR1(Persona[] dir, String[] nombreB, String[] rol){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(), nombreB) && Arrays.equals(dir[i].getTipo(), rol)){
                return dir[i];
            }
        }
        return null;
    }

    //Deberás agregar un método de BÚSQUEDA, diferente a los que se piden en esta especificación.
    //Metodo para buscar a una persona con su correo
    public static boolean busquedaC(Persona[] dir, String[] correoB){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getCorreo(), correoB)){
                return true;
            }
        }
        return false;
    }

    //Deberás agregar un método de BÚSQUEDA, diferente a los que se piden en esta especificación. ###AUXILIAR###
    //Metodo para buscar a una persona con su correo
    public static Persona busquedaC1(Persona[] dir, String[] correoB){
        for(int i = 0; i < dir.length-1;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getCorreo(), correoB)){
                return dir[i];
            }
        }
        return null;
    }

    //Insertar datos de un nuevo contacto (alumno, profesor o coordinador).
    int cont = 0;
    public void insertper(Persona p){
        dir[cont] = p;
        cont++;
    }


    //Eliminar los datos de un contacto, a partir del nombre.
    public static boolean borra_persona(Persona[] dir, String[] nombre){
        String[] string0 = {""};
        long[] long0 ={0};
        Persona p0 = new Persona(string0, string0, string0, string0, long0);
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(), nombre)){
                dir[i] = p0;
                return true;
            }  
        }
        return false;
    }

    //Deberás agregar un método de ELIMINAR, diferente al que se pide en esta especificación.
    //Metodo para borrar personas ingresando su correo
    public static boolean borra_persona_c(Persona[] dir, String[] correo){
        String[] string0 = {""};
        long[] long0 ={0};
        Persona p0 = new Persona(string0, string0, string0, string0, long0);
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getCorreo(), correo)){
                dir[i] = p0;
                return true;
            }  
        }
        return false;
    }

    //Actualizar la información de alguno de los contactos, a partir del nombre.
    public void actualizar_persona(Persona[] dir, String[] nombre, String[] tipo, Persona p){
        for(int i = 0; i < dir.length;i++){
            if(dir[i] == null){
                dir[i] = dir[i+1];
            }
            if(Arrays.equals(dir[i].getNombre(), nombre) && Arrays.equals(dir[i].getTipo(), tipo)){
                dir[i] = p;
            }
        }
    }

    //Metodo para imprimir arreglo
    public static String imprimeArregloDir(Persona[] arr) {
        String s = "";
        for (int i = 0; i < arr.length-1; i++ ) {
            s += arr[i] + "\n" + "\n";
        }
        s += arr[arr.length-1];
        s += "";
        return s;
    }


    //Buble sort
    public static <T> T[] bubblesort(T datos[], java.util.Comparator<T> cmp){
        T orden[] = datos;
        for(int i = 0;i < orden.length;i++)
          for(int j = i + 1; j < orden.length; j++)
            if (cmp.compare(datos[i],datos[j]) > 0 ){   //Los datos estan desordenados
              T temp = orden[i];                  //por tanto los intercambia
              orden[i] = orden[j];
              orden[j] = temp;
            }
        return orden;
      }

    //Mostrar solo alumnos o solo profesores, según la elección del usuario. Los contactos se deben mostrar ordenados de
    //forma ascendente.
    public static void cuentatipo(Persona[] dir, String[] tipo){//Estructura de las cuentas de las personas que son profesores o alumnos
        int cont = 0;
        for(int i = 0; i<dir.length-1;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                cont++;
            }
        }   //Al no haber una persona con el rol solicitado
        if(cont == 0){
            System.out.println("No hay ninguna persona del rol seleccionado");
        }
        //Checa las personas que solo son alumnos o profesores y las mete en un arreglo
        else{
            Persona dir0[] = new Persona[cont];
            int con = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con] = dir[j];
                    con++;
                }
            }
            for(Persona p:bubblesort(dir0,new Comparanombre()))//Utilizamos la clase Comparenombre para poder ordenar por nombres
            System.out.print(p + "\n" + "\n");
            System.out.println();
        }
    }

    //Mostrar a todos los contactos con correo electrónico. La información se mostrará agrupada por categoría.
    public static void cuentacorr(Persona[] dir, String[] correo){//Estructura de las cuentas de personas con correo
        int cont = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getCorreo(), correo) == false){
                cont++;
            }
        }  //Al no haber una persona con el rol solicitado
        if(cont == 0){
            System.out.println("No hay ninguna persona con correo registrada");
        }
        //Checa las personas con correo y las mete a un arreglo
        else{
            Persona dir0[] = new Persona[cont];
            int con = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getCorreo(), correo) == false){
                    dir0[con] = dir[j];
                    con++;
                }
            }
            for(Persona p:bubblesort(dir0,new Comparanombre()))//Utilizamos la clase Comparenombre para poder ordenar por nombres
            System.out.print(p + "\n" + "\n");
            System.out.println();
        }
    }

    //Mostrar a todos los contactos de una carrera en particular. La información se mostrará agrupada por categoría
    //(alumno, profesor o coordinador).
    public static void cuentatipocarrAlum(Persona[] dir, String[] tipo, String[] carrera){//Estructura de las cuentas con carreras de los alumnos
        int con = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                con++;
            }
        }  //Al no haber una persona con el rol solicitado
        if(con == 0){
            System.out.println("No hay ningun alumno");
        }
        //Checa los alumnos que hay y los mete a un arreglo
        else if(con != 0){
            Alumno dir0[] = new Alumno[con];
            int con1 = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con1] = (Alumno) dir[j];
                    con1++;
                }
            }
            int con2 = 0;
            for(int k = 0; k <dir0.length;k++){
                if(Arrays.equals(dir0[k].getCarrera(), carrera)){
                    con2++;
                }
            }   // Al no haber un alumno con la carrera solicitada
                if(con2 == 0){
                    System.out.println("No hay alumnos con esa carrera");
                }
                //Checa los alumnos con la carrera solicitada y los mete a un arreglo
                else if(con2 != 0){
                    Alumno dir1[] = new Alumno[con2];
                    int con3 = 0;
                    for(int n = 0; n <dir0.length;n++){
                        if(Arrays.equals(dir0[n].getCarrera(), carrera)){
                            dir1[con3] = (Alumno) dir0[n];
                            con3++;
                        }
                    }
                    for(Persona p:bubblesort(dir1,new Comparanombre()))//Utilizamos la clase Comparenombre para poder ordenar por nombres
                    System.out.print(p + "\n" + "\n");
                    System.out.println();
                }
        }
    }

    public static void cuentatipocarrProf(Persona[] dir, String[] tipo, String[] carrera){//Estructura de las cuentas con carreras de los profesores
        int con = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                con++;
            }
        }  //Al no haber una persona con el rol solicitado
        if(con == 0){
            System.out.println("No hay ningun profesor");
        }
        //Checa los profesores que hay y los mete en un arreglo
        else if(con != 0){
            Profesor dir0[] = new Profesor[con];
            int con1 = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con1] = (Profesor) dir[j];
                    con1++;
                }
            }
            int con2 = 0;
            for(int k = 0; k <dir0.length;k++){
                if(Arrays.equals(dir0[k].getCarrera(), carrera)){
                    con2++;
                }
            }   //Al no haber profesores con la carrera solicitada
                if(con2 == 0){
                    System.out.println("No hay profesores con esa carrera");
                }
                //Checa los profesores con la carrera solicitada y los mete a un arreglo
                else if(con2 != 0){
                    Profesor dir1[] = new Profesor[con2];
                    int con3 = 0;
                    for(int n = 0; n <dir0.length;n++){
                        if(Arrays.equals(dir0[n].getCarrera(), carrera)){
                            dir1[con3] = (Profesor) dir0[n];
                            con3++;
                        }
                    }
                    for(Persona p:bubblesort(dir1,new Comparanombre()))//Utilizamos la clase Comparanombre para poder ordenar por nombres
                    System.out.print(p + "\n" + "\n");
                    System.out.println();
                }
        }
    }

    public static void cuentatipocarrCor(Persona[] dir, String[] tipo, String[] carrera){//Estructura de las cuentas con carrera de los coordinadores
        int con = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                con++;
            }
        } //Al no haber una persona con el rol solicitado
        if(con == 0){
            System.out.println("No hay ningun coordinador");
        }
        //Checa los coordinadores que hay y los mete en un arreglo
        else if(con != 0){
            Coordinador dir0[] = new Coordinador[con];
            int con1 = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con1] = (Coordinador) dir[j];
                    con1++;
                }
            }
            int con2 = 0;
            for(int k = 0; k <dir0.length;k++){
                if(Arrays.equals(dir0[k].getCarrera(), carrera)){
                    con2++;
                }
            }   //Al no dar una carrera que corresponda con algun coordinador
                if(con2 == 0){
                    System.out.println("No hay coordinadores con esa carrera");
                }
                //Checa los coordinadores con la carrera solicitada y los mete en un arreglo
                else if(con2 != 0){
                    Coordinador dir1[] = new Coordinador[con2];
                    int con3 = 0;
                    for(int n = 0; n <dir0.length;n++){
                        if(Arrays.equals(dir0[n].getCarrera(), carrera)){
                            dir1[con3] = (Coordinador) dir0[n];
                            con3++;
                        }
                    }
                    for(Persona p:bubblesort(dir1,new Comparanombre()))//Utilizamos la clase Comparenombre para poder ordenar por nombre
                    System.out.print(p + "\n" + "\n");
                    System.out.println();
                }
        }
    }
    
    //Mostrar a todos los contactos con un sueldo determinado. La información se mostrará agrupada por categoría
    //(profesor o coordinador).
    public static void cuentatiposueldoCor(Persona[] dir, String[] tipo, double[] sueldo){//Estructura de las cuentas de sueldo de coordinadores
        int con = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                con++;
            }
        }  //Al no haber una persona con el rol solicitado
        if(con == 0){
            System.out.println("No hay ningun coordinador");
        }
        //Checa los coordinadores que hay y los mete en un arreglo
        else if(con != 0){
            Coordinador dir0[] = new Coordinador[con];
            int con1 = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con1] = (Coordinador) dir[j];
                    con1++;
                }
            }
            int con2 = 0;
            for(int k = 0; k <dir0.length;k++){
                if(Arrays.equals(dir0[k].getSueldo(), sueldo)){
                    con2++;
                }
            }   //Al no dar un sueldo correspondiente con algun coordinador
                if(con2 == 0){
                    System.out.println("No hay coordinadores con ese sueldo");
                }
                //Checa los sueldos de coordinadores que cumplen la condicion y los mete en un arreglo
                else if(con2 != 0){
                    Coordinador dir1[] = new Coordinador[con2];
                    int con3 = 0;
                    for(int n = 0; n <dir0.length;n++){
                        if(Arrays.equals(dir0[n].getSueldo(), sueldo)){
                            dir1[con3] = (Coordinador) dir0[n];
                            con3++;
                        }
                    }
                    for(Persona p:bubblesort(dir1,new Comparanombre()))//Utilizamos la clase Comparanombre para ordenar por nombre
                    System.out.print(p + "\n" + "\n");
                    System.out.println();
                }
        }
    }
    
    public static void cuentatiposueldoProf(Persona[] dir, String[] tipo, double[] sueldo){//Estructura de las cuentas de sueldos de profesores
        int con = 0;
        for(int i = 0; i<dir.length;i++){
            if(Arrays.equals(dir[i].getTipo(), tipo)){
                con++;
            }
        }  //Al no haber una persona con el rol solicitado
        if(con == 0){
            System.out.println("No hay ningun profesor");
        }
        //Checa los profesores que hay y los mete a un arreglo
        else if(con != 0){
            Profesor dir0[] = new Profesor[con];
            int con1 = 0;
            for(int j = 0; j <dir.length;j++){
                if(Arrays.equals(dir[j].getTipo(), tipo)){
                    dir0[con1] = (Profesor) dir[j];
                    con1++;
                }
            }
            int con2 = 0;
            for(int k = 0; k <dir0.length;k++){
                if(Arrays.equals(dir0[k].getSueldo(), sueldo)){
                    con2++;
                }
            }   //Al no dar un sueldo correspondiente con algun profesor
                if(con2 == 0){
                    System.out.println("No hay profesores con ese sueldo");
                }
                //Checa los sueldos de los profesores que cumplen la condicion y los mete en un arreglo
                else if(con2 != 0){
                    Profesor dir1[] = new Profesor[con2];
                    int con3 = 0;
                    for(int n = 0; n <dir0.length;n++){
                        if(Arrays.equals(dir0[n].getSueldo(), sueldo)){
                            dir1[con3] = (Profesor) dir0[n];
                            con3++;
                        }
                    }
                    for(Persona p:bubblesort(dir1,new Comparanombre()))//Utilizamos  la clase Comparenombre para poder ordenar por nombre
                    System.out.print(p + "\n" + "\n");
                    System.out.println();
                }
        }
    }

    //Metodo toString
    public String toString(){
        String s = imprimeArregloDir(dir);
        return s;
    }
}


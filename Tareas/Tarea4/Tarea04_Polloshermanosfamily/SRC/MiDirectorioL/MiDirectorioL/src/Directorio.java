import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

//Clase que contendra todos los metodos con los que trabajra el directorio
public class Directorio {
    private Lista l;

    public Directorio(Lista l){
        this.l = l;
    }

    //Mostrar la información completa de un contacto, con solo proporcionar su nombre 
    //(independientemente que sea un alumno, profesor o coordinador).
    public static Persona BusquedaN(Lista l, String nombre){
        Persona p = null;
        Iterator<Persona> it = l.elementos();
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getNombre().equals(nombre) && p == null ){
                p = pb;
                return p; 
            }
        }
        return null;
    }

     //Mostrar la información completa de un contacto, dado su nombre y rol (alumno, profesor o director).
    public static Persona BusquedaNR(Lista l, String nombre, String tipo){
        Persona p = null;
        Iterator<Persona> it = l.elementos();
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getNombre().equals(nombre) && pb.getTipo().equals(tipo) && p == null){
                p = pb;
                return p;
            }
        }
        return null;
    }

    //Deberás agregar un método de BÚSQUEDA, diferente a los que se piden en esta especificación. ###AUXILIAR###
    //Metodo para buscar a una persona con su correo
    public static Persona BusquedaC(Lista l, String correo){
        Persona p = null;
        Iterator<Persona> it = l.elementos();
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getCorreo().equals(correo) && p == null ){
                p = pb;
                return p; 
            }
        }
        return null;
    }

    
    //
    //Eliminar los datos de un contacto, a partir del nombre.
    //Usaremos el metodo para eliminar el objeto de la lista combinado con el de busqueda por nombre

    //Deberás agregar un método de ELIMINAR, diferente al que se pide en esta especificación.
    //Metodo para borrar personas ingresando su correo
    //Usaremos el metodo para eliminar el objeto de la lista combinado con el de busqueda por correo

    //Actualizar la información de alguno de los contactos, a partir del nombre.
    //Usaremos el metodo de busqueda por nombre y el de sustitución de la lista
    //

    
    //FALTAAAAAN
    //Mostrar solo alumnos o solo profesores, según la elección del usuario. Los contactos se deben mostrar ordenados de
    //forma ascendente.
    public static Lista BusquedaT(Lista l, String tipo){
        Lista l2 = new Lista<>();
        Iterator<Persona> it = l.elementos();
        
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getTipo().equals(tipo)){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    //Mostrar a todos los contactos con correo electrónico. La información se mostrará agrupada por categoría.
    //Con el metodo eliminar y de busqueda por correo
    public static Lista BusquedaCC(Lista l){
        Lista l2 = new Lista<>();
        Iterator<Persona> it = l.elementos();
        
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getCorreo() != null){
                l2.agregar(pb);
            }
        }
        return l2;
    }


    //Mostrar a todos los contactos de una carrera en particular. La información se mostrará agrupada por categoría
    //(alumno, profesor o coordinador).
    public static Lista BusquedaCarrAl(Lista l, String carrera){
        Lista l2 = new Lista<>();
        Iterator<Alumno> it = l.elementos();
        
        while(it.hasNext()){
            Alumno pb = it.next();
            if(pb.getCarrera().equals(carrera)){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    public static Lista BusquedaCarrPr(Lista l, String carrera){
        Lista l2 = new Lista<>();
        Iterator<Profesor> it = l.elementos();
        
        while(it.hasNext()){
            Profesor pb = it.next();
            if(pb.getCarrera().equals(carrera)){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    public static Lista BusquedaCarrCor(Lista l, String carrera){
        Lista l2 = new Lista<>();
        Iterator<Coordinador> it = l.elementos();
        
        while(it.hasNext()){
            Coordinador pb = it.next();
            if(pb.getDepescolar().equals(carrera)){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    //Mostrar a todos los contactos con un sueldo determinado. La información se mostrará agrupada por categoría
    //(profesor o coordinador).
    public static Lista Filtrotipo(Lista l, String tipo){
        Lista l2 = l;
        Iterator<Persona> it = l2.elementos();
        
        while(it.hasNext()){
            Persona pb = it.next();
            if(pb.getTipo() != tipo){
                l2.eliminar(pb);
                
            }
        }
        return l2;
    }

    public static Lista CopiarLista(Lista l ){
        Lista l2 = new Lista<>();
        Iterator<Persona> it = l.elementos();
        while(it.hasNext()){
            l2.agregar(it.next());
        }
        return l2;
    }

    public static Lista BusquedaSueCor(Lista l, float sueldo){
        Lista l2 = new Lista<>();
        Iterator<Coordinador> it = Filtrotipo(l, "Coordinador").elementos();
        
        while(it.hasNext()){
            Coordinador pb = it.next();
            if(pb.getSueldo() == sueldo){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    public static Lista BusquedaSueProf(Lista l, float sueldo){
        Lista l2 = new Lista<>();
        Iterator<Profesor> it = Filtrotipo(l, "Profesor").elementos();
        
        while(it.hasNext()){
            Profesor pb = it.next();
            if(pb.getSueldo() == sueldo){
                l2.agregar(pb);
            }
        }
        return l2;
    }

    public static Lista archivoALista(String archivo) throws FileNotFoundException,IOException{
    //Creamos el arreglo en funci�n de las l�neas que se hayan le�do
    Lista l = new Lista<>();
    FileReader fr = new FileReader(archivo); //Creamos el archivo de lectura
    BufferedReader bfr = new BufferedReader(fr); //Creamos el buffer de lectura
    String linea, cad[];
    linea = bfr.readLine(); //Leemos la primera linea
    while(linea != null){ //Mientras no lleguemos al EOF
      cad = linea.split(","); //Separamos la cadena
      
      if(cad[0].equals("Alumno"))//Se trata de un alumno
        l.agregar(new Alumno(cad[0], //Tipo
                          cad[1], //Nombre
                          cad[2], //Correo
                          cad[3], //Fecha de nacimiento
                          Long.parseLong(cad[4]), //Celular
                          Long.parseLong(cad[5]), //Numero de cuenta
                          Integer.parseInt(cad[6]), //Semestre
                          cad[7], //Carrera
                          cad[8])); //Materias
      
      if(cad[0].equals("Coordinador"))//Se trata de un coordinador
        l.agregar(new Coordinador(cad[0], //Tipo
                          cad[1], //Nombre
                          cad[2], //Correo
                          cad[3], //Fecha de nacimiento
                          Long.parseLong(cad[4]),//Celular
                          Long.parseLong(cad[5]), //Numero de empleado
                          cad[6], //Departamento escolar
                          cad[7], //Grupos
                          Double.parseDouble(cad[8]), //Sueldo
                          Long.parseLong(cad[9]))); //Telefono de oficina

      if(cad[0].equals("Profesor"))//Se trata de un profesor
        l.agregar(new Profesor(cad[0], //Tipo
                          cad[1], //Nombre
                          cad[2], //Correo
                          cad[3], //Fecha de nacimiento
                          Long.parseLong(cad[4]), //Celular
                          Long.parseLong(cad[5]), //Numero de profesor
                          cad[6], //Carrera
                          cad[7], //Departamento escolar
                          cad[8], //Grupos
                          Double.parseDouble(cad[9]), //Sueldo
                          Long.parseLong(cad[10]))); //Telefono de oficina
    
      
      linea = bfr.readLine(); //Leemos la siguiente linea
    }
    return l;
  }

  public static void guardarArchivo(String archivo,Lista l) throws IOException{
    FileWriter fw = new FileWriter(archivo); //Creamos el archivo de escritura
    BufferedWriter bfw = new BufferedWriter(fw); //Creamos el buffer de escritura
    //BufferedWriter bfw = new BufferedWriter(fw,true); <--Indica un archivo para append
    PrintWriter pw = new PrintWriter(bfw); //Creamos la "impresora"
    String linea = "";
    Iterator<Persona> it = l.elementos();
    while(it.hasNext()){
      Persona p = it.next();
      if(p instanceof Alumno){ //Si es un Libro
        Alumno al = (Alumno)p; //Se considera como Libro
        linea += al.getTipo() + "," + al.getNombre() + "," + al.getCorreo() + "," + al.getFecha() + "," + al.getCelular() + "," + al.getNumeroc() + "," + al.getSemestre() + "," + al.getCarrera() + "," + al.getMaterias();
      }
      else if(p instanceof Coordinador){ //Si es un Disco
        Coordinador Cor = (Coordinador)p; //Se considera como Disco
        linea += Cor.getTipo() + "," + Cor.getNombre() + "," + Cor.getCorreo() + "," + Cor.getFecha() + "," + Cor.getCelular() + "," + Cor.getNumeroemp() + "," + Cor.getDepescolar() + "," + Cor.getGrupos() + "," + Cor.getSueldo() + "," + Cor.getToficiona();
      }
      else if(p instanceof Profesor){ //Si es una Pel�cula
        Profesor prof = (Profesor)p; //Se considera como Pel�cula
        linea += prof.getTipo() + "," + prof.getNombre() + "," + prof.getCorreo() + "," + prof.getFecha() + "," + prof.getCelular() + "," + prof.getNumeroprof() + "," + prof.getCarrera() + "," + prof.getDepescolar() + "," + prof.getGrupos() + "," + prof.getSueldo() + "," + prof.getToficiona();
      }
      linea += "\n";
      //pw.println(linea); //Imprimimos la l�nea actual
      //linea = ""; //Limpiamos la l�nea
    }
    pw.println(linea); //Imprimimos la l�nea actual
    linea = ""; //Limpiamos la l�nea
    pw.close(); //Cerramos el flujo de escritura, �Muy importante!
  }

}

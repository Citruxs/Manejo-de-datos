import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
public class MiDirectorio {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        menu(args);    //Aqui iniciamos el menu 
     } 
   


        public static void menu(String[] args) throws FileNotFoundException, IOException {

            Scanner sn = new Scanner(System.in);
            Scanner op1 = new Scanner(System.in);
            Scanner op2 = new Scanner(System.in);
            Scanner op3 = new Scanner(System.in);
            Scanner op4 = new Scanner(System.in);
            Scanner op5 = new Scanner(System.in);

            Lista Direc = new Lista<>();
            String nombreg = null;
            Scanner arch = new Scanner(System.in);
            System.out.println("Bienvenido, escoja una opción \n1.Abrir archivo\n2.Nuevo archivo");
            int archesc = arch.nextInt();

            if(archesc == 1){
                System.out.print("Escriba el nombre del archivo\n");
                Scanner nombre = new Scanner(System.in);
                String nombreb = nombre.nextLine();
                Direc = Directorio.archivoALista(nombreb);
                nombreg = nombreb;
            }
            
            else{
                Direc = Direc;
            }
            
           


            boolean salir = false;

            int opcion; //Guardaremos la opcion del usuario
             
            while(!salir){
                 
                System.out.println("1. Agregar una Persona");
                System.out.println("2. Editar una persona");
                System.out.println("3. Borrar una persona");
                System.out.println("4. Buscar una persona");
                System.out.println("5. ver la agenda");
                System.out.println("6. Salir");
                 
                System.out.println("Que desea Hacer: ");
                opcion = sn.nextInt();
                 
                switch(opcion){
                    case 1://Agregar un alumno, coordinador o profesor
                        System.out.println("Que desea agregar?"+"\n"+"1 para Alumno"+"\n"+"2 para Coordinador"+"\n"+"3 para Profesor");//"Has seleccionado la opcion 1"            
                        int subOp1 = op1.nextInt();
                        if(subOp1 ==1){//agrega alumno
                            String tipo = "Alumno";
                            System.out.println("Escribe el nombre completo del alumno" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String nombre = subOp1Nombre;
                            System.out.println("Escribe el correo del alumno" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            String correo = subOp1Correo;
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String fechadc = subOp1Fn;
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();
                            long celular = subOp1Celular;
                            System.out.println("Escribe su numero de cuenta");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de cuenta
                            long numeroc = subOp1Cuenta;
                            System.out.println("Escribe su numero de semestre");
                            int subOp1Sem = op5.nextInt();//Se pide el semestre
                            int semestre = subOp1Sem;
                            System.out.println("Escribe la carrera" );
                            String subOp1Ca = op3.nextLine();//Se pide la carrera
                            String carrera = subOp1Ca;
                            System.out.println("Escribe las materias separando por _" );
                            String subOp1Mat = op3.nextLine();//Se piden las materias
                            String materias = subOp1Mat;

                            Alumno a = new Alumno(tipo, nombre, correo, fechadc, celular, numeroc, semestre, carrera, materias); //Hacemos uso de la clase alumno para poder guardarlo como tal
                            Direc.agregar(a);
                            System.out.println("Se añadió con exito al Alumno: " + subOp1Nombre);//Mensaje que confirma el registro del alumno
                        }
                        else if(subOp1==2){//agrega coordinador
                            String tipo = "Coordinador";
                            System.out.println("Escribe el nombre completo del coordinador" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String nombre = subOp1Nombre;
                            System.out.println("Escribe el correo del coordinador" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            String correo = subOp1Correo;
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String fechadc = subOp1Fn;
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                            long celular = subOp1Celular;
                            System.out.println("Escribe su numero de empleado");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                            long numeroemp = subOp1Cuenta;
                            System.out.println("Escribe su de departamento escolar");
                            String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                            String depescolar = subOp1DE;
                            System.out.println("Escribe los grupos" );
                            String subOp1G = op3.nextLine();//Se piden los grupos
                            String grupos = subOp1G;
                            System.out.println("Escribe su sueldo" );
                            double subOp1S = op1.nextInt();//Se pide el sueldo
                            double sueldo = subOp1S;
                            System.out.println("Escribe su telefono de oficina" );
                            long subOp1TO = op5.nextInt();//Se pide el telefono de oficina
                            long toficiona = subOp1TO;

                            Coordinador c = new Coordinador(tipo, nombre, correo, fechadc, celular, numeroemp, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase coordinador para poder guardarlo como tal
                            Direc.agregar(c);
                            System.out.println("Se añadió con exito al Coordinador: " + subOp1Nombre);//Mensaje que confirma el registro del coordinador
                        }
                        else if(subOp1==3){//agrega profesor
                            String tipo = "Profesor";
                            System.out.println("Escribe el nombre completo del profesor" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String nombre = subOp1Nombre;
                            System.out.println("Escribe el correo del profesor" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            String correo = subOp1Correo;
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String fechadc = subOp1Fn;
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                            long celular = subOp1Celular;
                            System.out.println("Escribe su numero de empleado");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                            long numeroprof = subOp1Cuenta;
                            System.out.println("Escriba su carrera");
                            String subOp1Rera = op3.nextLine();//Se pide la carrera
                            String carrera = subOp1Rera;
                            System.out.println("Escribe su de departamento escolar");
                            String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                            String depescolar = subOp1DE;
                            System.out.println("Escribe los grupos separado por _" );
                            String subOp1G = op3.nextLine();//Se piden los grupos
                            String grupos = subOp1G;
                            System.out.println("Escribe su sueldo" );
                            double subOp1S = op1.nextInt();//Se pide el sueldo
                            double sueldo = subOp1S;
                            System.out.println("Escribe su telefono de oficina" );
                            long subOp1TO = op5.nextLong();//Se pide el telefono de oficina
                            long toficiona = subOp1TO;

                            Profesor c = new Profesor(tipo, nombre, correo, fechadc, celular, numeroprof, carrera, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase profesor para poder guardarlo como tal
                            Direc.agregar(c);
                            System.out.println("Se añadió con exito al Profesor: " + subOp1Nombre);//Mensaje que confirma el registro del profesor
                        }
                        else {
                            System.out.println("Escoge una opcion valida");//En caso de no dar un opción correcta
                        }
                        break;//Termino del caso 1
                    case 2://Editar algun contacto

                        System.out.println("Que desea editar?"+"\n"+"1 para alumno"+"\n"+"2 para coordinador"+"\n"+"3 para Profesor");//"Has seleccionado la opcion 2            
                        int subOp2 = op2.nextInt();
                        if(subOp2 ==1){//editar alumno
                            System.out.println("¿Cual es el nombre del alumno a editar?");
                            String subOp2a = op3.nextLine();
                            String tipo = "Alumno";
                            if(Directorio.BusquedaNR(Direc, subOp2a,tipo) != null){
                                System.out.println("Escribe el nombre completo del alumno" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String nombre = subOp1Nombre;
                                System.out.println("Escribe el correo del alumno" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                String correo = subOp1Correo;
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String fechadc = subOp1Fn;
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();
                                long celular = subOp1Celular;
                                System.out.println("Escribe su numero de cuenta");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de cuenta
                                long numeroc = subOp1Cuenta;
                                System.out.println("Escribe su numero de semestre");
                                int subOp1Sem = op5.nextInt();//Se pide el semestre
                                int semestre = subOp1Sem;
                                System.out.println("Escribe la carrera" );
                                String subOp1Ca = op3.nextLine();//Se pide la carrera
                                String carrera = subOp1Ca;
                                System.out.println("Escribe las materias separando por comas" );
                                String subOp1Mat = op3.nextLine();//Se piden las materias
                                String materias = subOp1Mat;
    
                                Alumno a = new Alumno(tipo, nombre, correo, fechadc, celular, numeroc, semestre, carrera, materias); //Hacemos uso de la clase alumno para poder guardarlo como tal
                                Persona p = Directorio.BusquedaNR(Direc, subOp2a,tipo);
                                Direc.eliminar(Directorio.BusquedaNR(Direc, subOp2a,tipo));
                                Direc.agregar(a);
                                System.out.println("Se actualizo con exito al Alumno: " + subOp2a);//Mensaje que confirma el registro del alumno
                            }
                            else{
                                System.out.println("No se ha encontrado al alumno");
                            }
                        }
                        else if(subOp2==2){//editar coordinador
                            System.out.println("¿Cual es el nombre del coordinador?");
                            String subOp2a = op3.nextLine();
                            String nombreB = subOp2a;
                            String tipo = "Coordinador";
                            if(Directorio.BusquedaNR(Direc, nombreB,tipo) != null){
                                System.out.println("Escribe el nombre completo del coordinador" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String nombre = subOp1Nombre;
                                System.out.println("Escribe el correo del coordinador" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                String correo = subOp1Correo;
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String fechadc = subOp1Fn;
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                                long celular = subOp1Celular;
                                System.out.println("Escribe su numero de empleado");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                                long numeroemp = subOp1Cuenta;
                                System.out.println("Escribe su de departamento escolar");
                                String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                                String depescolar = subOp1DE;
                                System.out.println("Escribe los grupos" );
                                String subOp1G = op3.nextLine();//Se piden los grupos
                                String grupos = subOp1G;
                                System.out.println("Escribe su sueldo" );
                                double subOp1S = op1.nextInt();//Se pide el sueldo
                                double sueldo = subOp1S;
                                System.out.println("Escribe su telefono de oficina" );
                                long subOp1TO = op5.nextLong();//Se pide el telefono de oficina
                                long toficiona = subOp1TO;
    
                                Coordinador c = new Coordinador(tipo, nombre, correo, fechadc, celular, numeroemp, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase coordinador para poder guardarlo como tal
                                Direc.eliminar(Directorio.BusquedaNR(Direc, nombreB,tipo));
                                Direc.agregar(c);
                                System.out.println("Se actualizo con exito al Coordinador: " + subOp2a);//Mensaje que confirma el registro del coordinador
                            }
                            else{
                                System.out.println("No se ha encontrado al coordinador");
                            }
                        }
                        else if(subOp2==3){//editar profesor
                            System.out.println("¿Cual es el nombre del coordinador?");
                            String subOp2a = op3.nextLine();
                            String nombreB = subOp2a;
                            String tipo = "Profesor";
                            if(Directorio.BusquedaNR(Direc, nombreB,tipo) != null){
                                System.out.println("Escribe el nombre completo del profesor" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String nombre = subOp1Nombre;
                                System.out.println("Escribe el correo del profesor" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                String correo = subOp1Correo;
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String fechadc = subOp1Fn;
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                                long celular = subOp1Celular;
                                System.out.println("Escribe su numero de empleado");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                                long numeroprof = subOp1Cuenta;
                                System.out.println("Escriba su carrera");
                                String subOp1Rera = op3.nextLine();//Se pide la carrera
                                String carrera = subOp1Rera;
                                System.out.println("Escribe su de departamento escolar");
                                String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                                String depescolar = subOp1DE;
                                System.out.println("Escribe los grupos" );
                                String subOp1G = op3.nextLine();//Se piden los grupos
                                String grupos = subOp1G;
                                System.out.println("Escribe su sueldo" );
                                double subOp1S = op1.nextInt();//Se pide el sueldo
                                double sueldo = subOp1S;
                                System.out.println("Escribe su telefono de oficina" );
                                long subOp1TO = op1.nextLong();//Se pide el telefono de oficina
                                long toficiona = subOp1TO;
                                Profesor p = new Profesor(tipo, nombre, correo, fechadc, celular, numeroprof, carrera, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase profesor para poder guardarlo como tal
                                Direc.eliminar(Directorio.BusquedaNR(Direc, nombreB,tipo));
                                Direc.agregar(p);
                                System.out.println("Se actualizó con exito al Profesor: " + subOp2a);//Mensaje que confirma el registro del profesor
                            }
                            else{
                                System.out.println("No se ha encontrado al profesor");
                            }
                        }
                        else {
                            System.out.println("Escoja una opcion valida");//Al no seleccionar una opcion marcara error
                        }
                        break;//Termino del caso 2
                    case 3://Borrar un contacto
                    System.out.println("¿Como desea borrar el contacto?" + "\n" + "1.Por nombre" + "\n" + "2.Por correo");
                    int subOp3 = op1.nextInt();  
                    if(subOp3 == 1){  
                        System.out.println("Ingrese el nombre de la persona que desea borrar");
                            String subOp3Nombre = op3.nextLine();//Se pide el nombre del contacto
                            String subOp3ArrN = subOp3Nombre;
                            if(Directorio.BusquedaN(Direc, subOp3Nombre) == null){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona");
                            }
                            else{
                                Direc.eliminar(Directorio.BusquedaN(Direc, subOp3Nombre));
                                System.out.println("Se borro con exito a: " + subOp3Nombre);//Utilizando la clase directorio borramos el contacto de la agenda
                            }
                    }
                    else if(subOp3 == 2){
                        System.out.println("Ingrese el correo de la persona que desea borrar");
                            String subOp3Correo = op3.nextLine();//Se pide el nombre del contacto
                            String[] subOp3ArrC = {subOp3Correo};
                            if(Directorio.BusquedaC(Direc, subOp3Correo) == null){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona");
                            }
                            else{
                                Direc.eliminar(Directorio.BusquedaC(Direc, subOp3Correo));
                                System.out.println("Se borro con exito a: " + subOp3Correo);//Utilizando la clase directorio borramos el contacto de la agenda
                            }
                    }

                        break;//Termino del caso 3
                    case 4 ://Busqueda de contacto
                        System.out.println("¿Que tipo de busqueda desea realizar?" + "\n" + "1. Busqueda por nombre" + "\n" + "2. Busqueda por nombre y rol" + "\n" + "3. Busqueda por correo");
                        int subOp4 = op1.nextInt();
                        if(subOp4 == 1){//Busqueda por nombre unicamente
                            System.out.println("Ingrese el nombre de la persona que desea buscar");
                            String subOp3Bus = op3.nextLine();//Se pide el nombre de la persona
                            String subOp3ArrB = subOp3Bus;
                            if(Directorio.BusquedaN(Direc, subOp3Bus) == null){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.BusquedaN(Direc, subOp3ArrB));//Se pide ayuda al directorio para mostrar al contacto requerido
                            }
                        }
                        else if(subOp4 == 2){//Busqueda por nomnre y rol
                            System.out.println("Ingrese el nombre de la persona que desea buscar");
                            String subOp3BusN = op3.nextLine();//Se pide el nombre de la persona
                            String subOp3ArrBusN = subOp3BusN;
                            System.out.println("Ingrese el rol de la persona que desea buscar");
                            String subOp3BusR = op3.nextLine();//Se pide el rol de la persona
                            String subOp3ArrBusR = subOp3BusR;
                            if(Directorio.BusquedaNR(Direc, subOp3ArrBusN,subOp3ArrBusR) == null){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con los datos dados
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.BusquedaNR(Direc, subOp3ArrBusN,subOp3ArrBusR));//Se pide ayuda al directorio para mostrar al contacto requerido
                            }
                        }
                        else if(subOp4 == 3){
                            System.out.println("Ingrese el correo de la persona que desea buscar");
                            String subOp3BusC = op3.nextLine();//Se pide el nombre de la persona
                            String subOp3ArrBusC = subOp3BusC;
                            if(Directorio.BusquedaC(Direc, subOp3ArrBusC) == null){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con los datos dados
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.BusquedaC(Direc, subOp3ArrBusC));//Se pide ayuda al directorio para mostrar al contacto requerido
                            }
                        }
                        else{
                            System.out.println("Esocoja una opcion valida");//En el caso donde no se elija una de las opciones dadas
                        }
                        break;//termino del caso 4
                     case 5://Mostrar la agenda ordenada por nombres
                    System.out.println("¿Como quieres ver la agenda?" + "\n" + "1.Todos los contactos" + "\n" + "2.Por carrera" + "\n" + "3.Solo alumnos" + "\n" + "4.Solo profesores" + "\n" + "5.Contactos con correo" + "\n" + "6.Con un sueldo determinado");
                        int subOp5 = op1.nextInt();
                        if(subOp5 == 1){
                        System.out.println("La agenda:");
                            ListaOrdenada DirecOrd = new ListaOrdenada<>(new Comparanombre());
                            Iterator<Persona> it1 = Direc.elementos();
                            while(it1.hasNext()){
                                DirecOrd.agregar(it1.next());
                            }

                            Iterator<Persona> it2 =  DirecOrd.elementos();
                            while(it2.hasNext()){
                                System.out.println(it2.next());
                            }
                        }
                        else if(subOp5 == 2){
                            System.out.println("¿De que carrera quieres ver los contactos?" + "\n" + "1.Matematicas" + "\n" + "2.Actuaria" + "\n" + "3.Fisica");
                            int subOp5a = op1.nextInt();
                            if(subOp5a == 1){
                                String carrera = "Matematicas";
                                Lista alum = Directorio.CopiarLista(Direc);
                                Iterator<Alumno> italum = Directorio.BusquedaCarrAl(Directorio.Filtrotipo(alum, "Alumno"), carrera).elementos();
                                while(italum.hasNext()){
                                    System.out.println(italum.next());
                                }

                                System.out.println("\n");
                                Lista cord = Directorio.CopiarLista(Direc);
                                Iterator<Coordinador> itcord = Directorio.BusquedaCarrCor(Directorio.Filtrotipo(cord, "Coordinador"), carrera).elementos();
                                while(itcord.hasNext()){
                                    System.out.println(itcord.next());
                                }
                                System.out.println("\n");
                                Lista prof = Directorio.CopiarLista(Direc);
                                Iterator<Profesor> itprof = Directorio.BusquedaCarrPr(Directorio.Filtrotipo(prof, "Profesor") , carrera).elementos();
                                while(itprof.hasNext()){
                                    System.out.println(itprof.next());
                                }
                            }
                            else if(subOp5a == 2){
                                String carrera = "Actuaria";
                                Lista alum = Directorio.CopiarLista(Direc);
                                Lista cord = Directorio.CopiarLista(Direc);
                                Lista prof = Directorio.CopiarLista(Direc);
                                Iterator<Persona> italum = Directorio.BusquedaCarrAl(alum, carrera).elementos();
                                while(italum.hasNext()){
                                    System.out.println(italum.next());
                                }

                                System.out.println("\n");
                                Iterator<Persona> itcord = Directorio.BusquedaCarrCor(cord, carrera).elementos();
                                while(itcord.hasNext()){
                                    System.out.println(itcord.next());
                                }
                                System.out.println("\n");
                                Iterator<Persona> itprof = Directorio.BusquedaCarrPr(prof, carrera).elementos();
                                while(itprof.hasNext()){
                                    System.out.println(itprof.next());
                                }
                            }
                            else if(subOp5a == 3){
                                String carrera = "Fisica";
                                Lista alum = Directorio.CopiarLista(Direc);
                                Lista cord = Directorio.CopiarLista(Direc);
                                Lista prof = Directorio.CopiarLista(Direc);
                                Iterator<Persona> italum = Directorio.BusquedaCarrAl(alum, carrera).elementos();
                                while(italum.hasNext()){
                                    System.out.println(italum.next());
                                }

                                System.out.println("\n");
                                Iterator<Persona> itcord = Directorio.BusquedaCarrCor(cord, carrera).elementos();
                                while(itcord.hasNext()){
                                    System.out.println(itcord.next());
                                }
                                System.out.println("\n");
                                Iterator<Persona> itprof = Directorio.BusquedaCarrPr(prof, carrera).elementos();
                                while(itprof.hasNext()){
                                    System.out.println(itprof.next());
                                }
                            }
                            else{
                                System.out.println("Selecciona una opcion valida");
                            }
                        }
                        else if(subOp5 == 3){
                            String tipo = "Alumno";
                            Iterator<Persona> it1 = Directorio.BusquedaT(Direc, tipo).elementos();
                            while(it1.hasNext()){
                                System.out.println(it1.next());
                            }
                        }
                        else if(subOp5 == 4){
                            String tipo = "Profesor";
                            Iterator<Persona> it2 = Directorio.BusquedaT(Direc, tipo).elementos();
                            while(it2.hasNext()){
                                System.out.println(it2.next());
                            }
                        }
                        else if(subOp5 == 5){
                            Iterator<Persona> it3 = Directorio.BusquedaCC(Direc).elementos();
                            while(it3.hasNext()){
                                System.out.println(it3.next());
                            }
                        }
                        else if(subOp5 == 6){
                            System.out.println("¿Cual suedo buscas?");
                            double subOp5a = op4.nextDouble();
                            double sueldo = subOp5a;
                            String tipoa = "Coordinador";
                            String tipob = "Profesor";
                            System.out.println("Coordinadores con el sueldo: " + subOp5a);
                            Lista DirecCor =  Directorio.CopiarLista(Direc);
                            Lista DirecProf =  Directorio.CopiarLista(Direc);
                            Iterator<Persona> itscord = Directorio.BusquedaSueCor(Directorio.Filtrotipo(DirecProf, tipoa), subOp5).elementos();
                            while(itscord.hasNext()){
                                System.out.println(itscord.next());
                            }
                            System.out.println("\n");
                            System.out.println("Profesores con el sueldo: " + subOp5a);
                            Iterator<Persona> itsprof = Directorio.BusquedaSueCor(Directorio.Filtrotipo(DirecProf, tipob), subOp5).elementos();
                            while(itsprof.hasNext()){
                                System.out.println(itsprof.next());
                            }
                        }
                        else{
                            System.out.println("Escoja una opcion valida");
                        }
                        break;//Termino del caso 5

                     case 6:
                        if(archesc == 2){
                            System.out.println("Escribe el nombre del archivo");
                            Scanner nombre = new Scanner(System.in);
                            String nombreg1 = nombre.nextLine();
                            Directorio.guardarArchivo(nombreg1, Direc);
                            System.out.println("Se ha guardado la lista como: " + nombreg1);
                        }
                        else{
                            Directorio.guardarArchivo(nombreg, Direc);
                            System.out.println("Se ha guardado la lista como: " + nombreg);
                        }
                        salir=true;//Pedir que el programa termine de correr
                        break;//Termino del caso 6
                     default:
                        System.out.println("Escoja una opcion valida");//En caso de no seleccionar una de la opciones dadas
                }
                 
            }
        }
}
import java.util.Scanner;
public class MiDirectorio {
    public static void main(String[] args) {
        menu(args);    //Aqui iniciamos el menu 
     } 
   

//menu erizo
        public static void menu(String[] args) {
            String[] string0 = {""};
            long[] int0 ={0};
            Persona p0 = new Persona(string0, string0, string0, string0, int0); //Con esta persona llenaremos todo el directorio por defecto

            Scanner sn = new Scanner(System.in);
            Scanner op1 = new Scanner(System.in);
            Scanner op2 = new Scanner(System.in);
            Scanner op3 = new Scanner(System.in);
            Scanner op4 = new Scanner(System.in);
            Scanner op5 = new Scanner(System.in);
            System.out.println("¿De cuanto es el tamaño de la agenda que quieres manejar?");
            int tam = op1.nextInt();
            Persona dir[] = new Persona[tam]; //Llenamos el directorio con p0
            for(int i = 0;i<tam;i++){
                dir[i] = p0;
            }
            
            Directorio dir1 = new Directorio(dir);

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
                            String[] tipo = {"Alumno"};
                            System.out.println("Escribe el nombre completo del alumno" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String[] nombre = {subOp1Nombre};
                            System.out.println("Escribe el correo del alumno" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            if(subOp1Correo == "\n"){
                                subOp1Correo = "";
                            }
                            String[] correo = {subOp1Correo};
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String[] fechadc = {subOp1Fn};
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();
                            long[] celular = {subOp1Celular};
                            System.out.println("Escribe su numero de cuenta");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de cuenta
                            long[] numeroc = {subOp1Cuenta};
                            System.out.println("Escribe su numero de semestre");
                            long subOp1Sem = op5.nextInt();//Se pide el semestre
                            long[] semestre = {subOp1Sem};
                            System.out.println("Escribe la carrera" );
                            String subOp1Ca = op3.nextLine();//Se pide la carrera
                            String[] carrera = {subOp1Ca};
                            System.out.println("Escribe las materias separando por comas" );
                            String subOp1Mat = op3.nextLine();//Se piden las materias
                            String[] materias = {subOp1Mat};

                            Alumno a = new Alumno(tipo, nombre, correo, fechadc, celular, numeroc, semestre, carrera, materias); //Hacemos uso de la clase alumno para poder guardarlo como tal
                            dir1.insertper(a);
                            System.out.println("Se añadió con exito al Alumno: " + subOp1Nombre);//Mensaje que confirma el registro del alumno
                        }
                        else if(subOp1==2){//agrega coordinador
                            String[] tipo = {"Coordinador"};
                            System.out.println("Escribe el nombre completo del coordinador" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String[] nombre = {subOp1Nombre};
                            System.out.println("Escribe el correo del coordinador" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            if(subOp1Correo == "\n"){
                                subOp1Correo = "";
                            }
                            String[] correo = {subOp1Correo};
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String[] fechadc = {subOp1Fn};
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                            long[] celular = {subOp1Celular};
                            System.out.println("Escribe su numero de empleado");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                            long[] numeroemp = {subOp1Cuenta};
                            System.out.println("Escribe su de departamento escolar");
                            String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                            String[] depescolar = {subOp1DE};
                            System.out.println("Escribe los grupos" );
                            String subOp1G = op3.nextLine();//Se piden los grupos
                            String[] grupos = {subOp1G};
                            System.out.println("Escribe su sueldo" );
                            double subOp1S = op1.nextInt();//Se pide el sueldo
                            double[] sueldo = {subOp1S};
                            System.out.println("Escribe su telefono de oficina" );
                            long subOp1TO = op5.nextInt();//Se pide el telefono de oficina
                            long[] toficiona = {subOp1TO};

                            Coordinador c = new Coordinador(tipo, nombre, correo, fechadc, celular, numeroemp, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase coordinador para poder guardarlo como tal
                            dir1.insertper(c);
                            System.out.println("Se añadió con exito al Coordinador: " + subOp1Nombre);//Mensaje que confirma el registro del coordinador
                        }
                        else if(subOp1==3){//agrega profesor
                            String[] tipo = {"Profesor"};
                            System.out.println("Escribe el nombre completo del profesor" );
                            String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                            String[] nombre = {subOp1Nombre};
                            System.out.println("Escribe el correo del profesor" );
                            String subOp1Correo = op3.nextLine();//Se pide el correo
                            if(subOp1Correo == "\n"){
                                subOp1Correo = "";
                            }
                            String[] correo = {subOp1Correo};
                            System.out.println("Escribe la fecha de nacimiento" );
                            String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                            String[] fechadc = {subOp1Fn};
                            System.out.println("Escribe su numero de celular");
                            long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                            long[] celular = {subOp1Celular};
                            System.out.println("Escribe su numero de empleado");
                            long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                            long[] numeroprof = {subOp1Cuenta};
                            System.out.println("Escriba su carrera");
                            String subOp1Rera = op3.nextLine();//Se pide la carrera
                            String[] carrera = {subOp1Rera};
                            System.out.println("Escribe su de departamento escolar");
                            String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                            String[] depescolar = {subOp1DE};
                            System.out.println("Escribe los grupos" );
                            String subOp1G = op3.nextLine();//Se piden los grupos
                            String[] grupos = {subOp1G};
                            System.out.println("Escribe su sueldo" );
                            double subOp1S = op1.nextInt();//Se pide el sueldo
                            double[] sueldo = {subOp1S};
                            System.out.println("Escribe su telefono de oficina" );
                            long subOp1TO = op5.nextLong();//Se pide el telefono de oficina
                            long[] toficiona = {subOp1TO};

                            Profesor c = new Profesor(tipo, nombre, correo, fechadc, celular, numeroprof, carrera, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase profesor para poder guardarlo como tal
                            dir1.insertper(c);
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
                            System.out.println("¿Cual es el nombre del alumno?");
                            String subOp2a = op3.nextLine();
                            String[] nombreB = {subOp2a};
                            String[] tipo = {"Alumno"};
                            if(Directorio.busquedaNR(dir, nombreB,tipo)){
                                System.out.println("Escribe el nombre completo del alumno" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String[] nombre = {subOp1Nombre};
                                System.out.println("Escribe el correo del alumno" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                if(subOp1Correo == "\n"){
                                    subOp1Correo = "";
                                }
                                String[] correo = {subOp1Correo};
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String[] fechadc = {subOp1Fn};
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();
                                long[] celular = {subOp1Celular};
                                System.out.println("Escribe su numero de cuenta");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de cuenta
                                long[] numeroc = {subOp1Cuenta};
                                System.out.println("Escribe su numero de semestre");
                                long subOp1Sem = op5.nextLong();//Se pide el semestre
                                long[] semestre = {subOp1Sem};
                                System.out.println("Escribe la carrera" );
                                String subOp1Ca = op3.nextLine();//Se pide la carrera
                                String[] carrera = {subOp1Ca};
                                System.out.println("Escribe las materias separando por comas" );
                                String subOp1Mat = op3.nextLine();//Se piden las materias
                                String[] materias = {subOp1Mat};
    
                                Alumno a = new Alumno(tipo, nombre, correo, fechadc, celular, numeroc, semestre, carrera, materias); //Hacemos uso de la clase alumno para poder guardarlo como tal
                                dir1.actualizar_persona(dir, nombreB, tipo, a);
                                System.out.println("Se actualizo con exito al Alumno: " + subOp2a);//Mensaje que confirma el registro del alumno
                            }
                            else{
                                System.out.println("No se ha encontrado al alumno");
                            }
                        }
                        else if(subOp2==2){//editar coordinador
                            System.out.println("¿Cual es el nombre del coordinador?");
                            String subOp2a = op3.nextLine();
                            String[] nombreB = {subOp2a};
                            String[] tipo = {"Coordinador"};
                            if(Directorio.busquedaNR(dir, nombreB,tipo)){
                                System.out.println("Escribe el nombre completo del coordinador" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String[] nombre = {subOp1Nombre};
                                System.out.println("Escribe el correo del coordinador" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                if(subOp1Correo == "\n"){
                                    subOp1Correo = "";
                                }
                                String[] correo = {subOp1Correo};
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String[] fechadc = {subOp1Fn};
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                                long[] celular = {subOp1Celular};
                                System.out.println("Escribe su numero de empleado");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                                long[] numeroemp = {subOp1Cuenta};
                                System.out.println("Escribe su de departamento escolar");
                                String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                                String[] depescolar = {subOp1DE};
                                System.out.println("Escribe los grupos" );
                                String subOp1G = op3.nextLine();//Se piden los grupos
                                String[] grupos = {subOp1G};
                                System.out.println("Escribe su sueldo" );
                                double subOp1S = op1.nextInt();//Se pide el sueldo
                                double[] sueldo = {subOp1S};
                                System.out.println("Escribe su telefono de oficina" );
                                long subOp1TO = op5.nextLong();//Se pide el telefono de oficina
                                long[] toficiona = {subOp1TO};
    
                                Coordinador c = new Coordinador(tipo, nombre, correo, fechadc, celular, numeroemp, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase coordinador para poder guardarlo como tal
                                dir1.actualizar_persona(dir, nombreB, tipo, c);
                                System.out.println("Se actualizo con exito al Coordinador: " + subOp2a);//Mensaje que confirma el registro del coordinador
                            }
                            else{
                                System.out.println("No se ha encontrado al coordinador");
                            }
                        }
                        else if(subOp2==3){//editar profesor
                            System.out.println("¿Cual es el nombre del coordinador?");
                            String subOp2a = op3.nextLine();
                            String[] nombreB = {subOp2a};
                            String[] tipo = {"Profesor"};
                            if(Directorio.busquedaNR(dir, nombreB,tipo)){
                                System.out.println("Escribe el nombre completo del profesor" );
                                String subOp1Nombre = op3.nextLine();//Se pide el nombre completo
                                String[] nombre = {subOp1Nombre};
                                System.out.println("Escribe el correo del profesor" );
                                String subOp1Correo = op3.nextLine();//Se pide el correo
                                if(subOp1Correo == "\n"){
                                    subOp1Correo = "";
                                }
                                String[] correo = {subOp1Correo};
                                System.out.println("Escribe la fecha de nacimiento" );
                                String subOp1Fn = op3.nextLine();//Se pide la fecha de nacimiento
                                String[] fechadc = {subOp1Fn};
                                System.out.println("Escribe su numero de celular");
                                long subOp1Celular = op5.nextLong();//Se pide el numero de celular
                                long[] celular = {subOp1Celular};
                                System.out.println("Escribe su numero de empleado");
                                long subOp1Cuenta = op5.nextLong();//Se pide el numero de empleado
                                long[] numeroprof = {subOp1Cuenta};
                                System.out.println("Escriba su carrera");
                                String subOp1Rera = op3.nextLine();//Se pide la carrera
                                String[] carrera = {subOp1Rera};
                                System.out.println("Escribe su de departamento escolar");
                                String subOp1DE = op3.nextLine();//Se pide el departamento escolar
                                String[] depescolar = {subOp1DE};
                                System.out.println("Escribe los grupos" );
                                String subOp1G = op3.nextLine();//Se piden los grupos
                                String[] grupos = {subOp1G};
                                System.out.println("Escribe su sueldo" );
                                double subOp1S = op1.nextInt();//Se pide el sueldo
                                double[] sueldo = {subOp1S};
                                System.out.println("Escribe su telefono de oficina" );
                                long subOp1TO = op1.nextLong();//Se pide el telefono de oficina
                                long[] toficiona = {subOp1TO};
                                Profesor p = new Profesor(tipo, nombre, correo, fechadc, celular, numeroprof, carrera, depescolar, grupos, sueldo, toficiona);//Hacemos uso de la clase profesor para poder guardarlo como tal
                                dir1.actualizar_persona(dir, nombreB, tipo, p);
                                System.out.println("Se actualizó con exito al Profesor: " + subOp2a);//Mensaje que confirma el registro del profesor
                            }
                            else{
                                System.out.println("No se ha encontrado al profesor");
                            }
                        }
                        else {
                            System.out.println("Esocoja una opcion valida");//Al no seleccionar una opcion marcara error
                        }
                        break;//Termino del caso 2
                    case 3://Borrar un contacto
                    System.out.println("¿Como desea borrar el contacto?" + "\n" + "1.Por nombre" + "\n" + "2.Por correo");
                    int subOp3 = op1.nextInt();  
                    if(subOp3 == 1){  
                        System.out.println("Ingrese el nombre de la persona que desea borrar");
                            String subOp3Nombre = op3.nextLine();//Se pide el nombre del contacto
                            String[] subOp3ArrN = {subOp3Nombre};
                            if(Directorio.borra_persona(dir, subOp3ArrN) == false){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona");
                            }
                            else{
                                System.out.println("Se borro con exito a: " + subOp3Nombre);//Utilizando la clase directorio borramos el contacto de la agenda
                            }
                    }
                    else if(subOp3 == 2){
                        System.out.println("Ingrese el correo de la persona que desea borrar");
                            String subOp3Correo = op3.nextLine();//Se pide el nombre del contacto
                            String[] subOp3ArrC = {subOp3Correo};
                            if(Directorio.borra_persona_c(dir, subOp3ArrC) == false){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona");
                            }
                            else{
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
                            String[] subOp3ArrB = {subOp3Bus};
                            if(Directorio.busquedaN(dir, subOp3ArrB) == false){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con el dato dado
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.busquedaN1(dir, subOp3ArrB));//Se pide ayuda al directorio para mostrar al contacto requerido
                            }
                        }
                        else if(subOp4 == 2){//Busqueda por nomnre y rol
                            System.out.println("Ingrese el nombre de la persona que desea buscar");
                            String subOp3BusN = op3.nextLine();//Se pide el nombre de la persona
                            String[] subOp3ArrBusN = {subOp3BusN};
                            System.out.println("Ingrese el rol de la persona que desea buscar");
                            String subOp3BusR = op3.nextLine();//Se pide el rol de la persona
                            String[] subOp3ArrBusR = {subOp3BusR};
                            if(Directorio.busquedaNR(dir, subOp3ArrBusN,subOp3ArrBusR) == false){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con los datos dados
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.busquedaNR1(dir, subOp3ArrBusN,subOp3ArrBusR));//Se pide ayuda al directorio para mostrar al contacto requerido
                            }
                        }
                        else if(subOp4 == 3){
                            System.out.println("Ingrese el correo de la persona que desea buscar");
                            String subOp3BusC = op3.nextLine();//Se pide el nombre de la persona
                            String[] subOp3ArrBusC = {subOp3BusC};
                            if(Directorio.busquedaC(dir, subOp3ArrBusC) == false){//Pide ayuda a la clase directorio para confirmar si existe o no el contacto con los datos dados
                                System.out.println("No se encontró a la persona buscada");
                            }
                            else{
                                System.out.println("Se encontro al contacto");
                                System.out.println(Directorio.busquedaC1(dir, subOp3ArrBusC));//Se pide ayuda al directorio para mostrar al contacto requerido
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
                            Directorio.bubblesort(dir, new Comparanombre());//
                            for(Persona p:Directorio.bubblesort(dir,new Comparatipo()))//Utilizamos la clase Comparatipo para ordenar por tipo
                            System.out.print(p + "\n" + "\n");
                            System.out.println();
                        }
                        else if(subOp5 == 2){
                            System.out.println("¿De que carrera quieres ver los contactos?" + "\n" + "1.Matematicas" + "\n" + "2.Actuaria" + "\n" + "3.Fisica");
                            int subOp5a = op1.nextInt();
                            if(subOp5a == 1){
                                String[] carrera = {"Matematicas"};
                                String[] tipoa = {"Alumno"};
                                String[] tipoc = {"Coordinador"};
                                String[] tipop = {"Profesor"};
                                Directorio.cuentatipocarrAlum(dir, tipoa, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrCor(dir, tipoc, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrProf(dir, tipop, carrera);
                            }
                            else if(subOp5a == 2){
                                String[] carrera = {"Actuaria"};
                                String[] tipoa = {"Alumno"};
                                String[] tipoc = {"Coordinador"};
                                String[] tipop = {"Profesor"};
                                Directorio.cuentatipocarrAlum(dir, tipoa, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrCor(dir, tipoc, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrProf(dir, tipop, carrera);
                            }
                            else if(subOp5a == 3){
                                String[] carrera = {"Fisica"};
                                String[] tipoa = {"Alumno"};
                                String[] tipoc = {"Coordinador"};
                                String[] tipop = {"Profesor"};
                                Directorio.cuentatipocarrAlum(dir, tipoa, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrCor(dir, tipoc, carrera);
                                System.out.println("\n");
                                Directorio.cuentatipocarrProf(dir, tipop, carrera);
                            }
                            else{
                                System.out.println("Selecciona una opcion valida");
                            }
                        }
                        else if(subOp5 == 3){
                            String[] tipo = {"Alumno"};
                            Directorio.cuentatipo(dir, tipo);
                        }
                        else if(subOp5 == 4){
                            String[] tipo = {"Profesor"};
                            Directorio.cuentatipo(dir, tipo);
                        }
                        else if(subOp5 == 5){
                            String[] correo = {""};
                            Directorio.cuentacorr(dir, correo);
                        }
                        else if(subOp5 == 6){
                            System.out.println("¿Cual suedo buscas?");
                            double subOp5a = op4.nextDouble();
                            double[] sueldo = {subOp5a};
                            String[] tipoa = {"Coordinador"};
                            String[] tipob = {"Profesor"};
                            System.out.println("Coordinadores con el sueldo: " + subOp5a);
                            Directorio.cuentatiposueldoCor(dir, tipoa, sueldo);
                            System.out.println("\n");
                            System.out.println("Profesores con el sueldo: " + subOp5a);
                            Directorio.cuentatiposueldoProf(dir, tipob, sueldo);
                        }
                        else{
                            System.out.println("Esocoja una opcion valida");
                        }
                        break;//Termino del caso 5
                     case 6:
                        salir=true;//Pedir que el programa termine de correr
                        break;//Termino del caso 6
                     default:
                        System.out.println("Escoja una opcion valida");//En caso de no seleccionar una de la opciones dadas
                }
                 
            }
        }
}
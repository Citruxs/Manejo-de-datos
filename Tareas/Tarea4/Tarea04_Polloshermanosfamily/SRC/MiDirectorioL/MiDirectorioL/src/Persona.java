public class Persona{
  private String tipo;
  private String nombre;
  private String correo;
  private String fecha;
  private long celular;
  

  public Persona(String tipo, String nombre, String correo, String fecha, long celular){
    this.tipo = tipo;
    this.nombre = nombre;
    this.correo = correo;
    this.fecha = fecha;
    this.celular = celular;
  }

  public String getTipo(){
      return tipo;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public String getCorreo(){
      return correo;
  }
  
  public String getFecha(){
    return fecha;
  }
  
  public long getCelular(){
      return celular;
  }
  
  public void setTipo(String t){
      tipo = t;
  }
  
  public void setNombre(String n){
    nombre = n;
  }
  
  public void setCorreo(String c){
      correo = c;
  }
  
  public void setFecha(String d){
    fecha = d;
  }
  
  public void setCelular(long c){
      celular = c;
  }
 
  public String toString(){
    return "Tipo: " + getTipo() +
           " | Nombre: " + getNombre() +
           " | Correo: " + getCorreo() +
           " | Fecha de nacimiento: " + getFecha() +
           " | Celular: " + getCelular();
  }
}
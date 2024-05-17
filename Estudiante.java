
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
    private String nombre;
    private String apellido;
    private int edad;
    private int codigo;
    public Estudiante()
    {
    }
    public Estudiante(String nombre,String apellido,int edad,int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + " apellido: " + apellido + " edad: " + edad + " codigo " + codigo;
    }
    
}
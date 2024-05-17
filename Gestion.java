import java.util.ArrayList;

/**
 * Write a description of class Gestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gestion
{
    private ArrayList <Estudiante> estudiantes;
    public Gestion()
    {
        this.estudiantes = new ArrayList<>();
    }
        
    public ArrayList<Estudiante> getEstudiantes(){
        return this.estudiantes;
    }
    
    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }
    
    public void registrarEstudiante(Estudiante e){
        this.estudiantes.add(e);
    }
    
    public void listarEstudiante(){
        for(Estudiante estudiante: estudiantes){
            System.out.println(estudiante.toString());
        }
    }
    
    public void buscarEstudiante(int codigo){
        for(Estudiante estudiante: estudiantes){
            if(codigo == estudiante.getCodigo()){
                System.out.println("Nombre: " + estudiante.getNombre() + " apellido " + estudiante.getApellido() + " edad " + estudiante.getEdad() + " codigo " + estudiante.getCodigo());
            }
}
}
}
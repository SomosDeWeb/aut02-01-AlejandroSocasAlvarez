package estudiante;
import java.util.ArrayList;
public class Estudiante{
    private String nombre = "";
    private int edad = -1;
    private float media = -1;
    private Boolean matricula;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        if (edad > 0){
            this.edad = edad;
        }
    }
    public int getEdad(){
        return edad;
    }
    public void setMedia(float media) {
        if (media >= 0 && media <= 10) {
            this.media = media;
        }
    }
    public Float getMedia(){
        return media;
        }
    public void setMatricula(boolean matricula){
        this.matricula = matricula;
        }
    public boolean getMatricula(){
        return matricula;
    }
    public Estudiante(String nombre, int edad, float media, boolean matricula){
        setNombre(nombre);
        setEdad(edad);
        setMedia(media);
        setMatricula(matricula);
    }
    public static Estudiante añadirEstudiante(String Nombre, int edad, float media, boolean matricula){
        Estudiante estudiante = new Estudiante(Nombre, edad, media, matricula);
        if (estudiante.getNombre().isEmpty() || estudiante.getEdad() == -1 || estudiante.getMedia() == -1){
            return null;
        }
        else
            return estudiante;
    }
    public String toString(){
        return getNombre() + " (" + getEdad() + ") - Nota media: " + getMedia() + " - Matriculado: " + getMatricula();
    }
}


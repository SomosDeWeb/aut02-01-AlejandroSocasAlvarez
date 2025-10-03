package org.example;

public class Estudiante{
    private String nombre;
    private int edad;
    private float media;
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
    public void setMedia(float media){
        if (media >= 0 && media <= 10){
            this.media = media;
        }
    public float getMedia(){
            return media;
        }
    }
}

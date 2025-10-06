package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int fin = 0;
        int selector;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("=== Gestor de Estudiantes ===\n1. Añadir estudiante\n3. Buscar por nombre\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir\nSeleccione opción:");
            selector = Integer.parseInt(sc.nextLine());
            switch (selector){
                case 1:
                    System.out.print("Introduce nombre:");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce edad:");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.print("Introduce media:");
                    float media = Float.parseFloat(sc.nextLine());
                    System.out.print("¿Está matriculado? (true/false):");
                    boolean matricula = Boolean.parseBoolean(sc.nextLine());
                    Estudiante.añadirEstudiante(nombre, edad, media, matricula);
                case 6:
                    fin = 1;
                default:
                    System.out.println("La opción introducida no es válida.");
                }
        } while(fin == 0);
    }
}
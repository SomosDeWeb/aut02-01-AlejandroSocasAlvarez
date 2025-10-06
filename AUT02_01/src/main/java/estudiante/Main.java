package estudiante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean fin = false;
        int selector;
        float media = 0;
        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        do {
            System.out.print("=== Gestor de Estudiantes ===\n1. Añadir estudiante\n2. Listar todos los estudiantes registrados.\n3. Buscar por nombre\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir\nSeleccione opción:");
            selector = Integer.parseInt(sc.nextLine());
            switch (selector){
                case 1:
                    System.out.print("Introduce nombre:");
                    nombre = sc.nextLine();
                    System.out.print("Introduce edad:");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.print("Introduce media:");
                    media = Float.parseFloat(sc.nextLine());
                    System.out.print("¿Está matriculado? (true/false):");
                    boolean matricula = Boolean.parseBoolean(sc.nextLine());
                    Estudiante estudiante = Estudiante.añadirEstudiante(nombre, edad, media, matricula);
                    if (estudiante != null){
                        estudiantes.add(estudiante);
                    }
                    else System.out.println("No se ha podido crear estudiante.");
                    break;
                case 2:
                    for(Estudiante estudiante1 : estudiantes){
                        System.out.println(estudiante1.toString());
                    }
                    break;
                case 3:
                    System.out.print("Introduce el nombre del estudiante que quiere buscar:");
                    nombre = sc.nextLine();
                    for (Estudiante e : estudiantes) {
                        if (e.getNombre().contains(nombre)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    media = 0;
                    for (Estudiante e : estudiantes) {
                        media += e.getMedia();
                    }
                    media = media / estudiantes.size();
                    System.out.println(media);
                    break;
                case 6:
                    fin = true;
                    break;
                default:
                    System.out.println("La opción introducida no es válida.");
                }
        } while(!fin);
    }
}
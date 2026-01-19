import java.util.Scanner;


public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalPrioridad = 0;
        
        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion, sc, totalPrioridad);
        }while (opcion != 3);

         sc.close();
    }

    public static void mostrarMenu(){
        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");
    }   

    public static int leerOpcion(Scanner sc){ 
        System.out.print("Seleccione una opción:");
        return sc.nextInt();
        // limpiar el buffer
    }   
    
    public static int ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad){
        sc.nextLine(); // Limpiar el buffer
        
        switch (opcion) {
            case  1: 
                totalPrioridad = agregarTarea(sc,totalPrioridad);
                break;
            case 2:
                System.out.println("Funcionalidad en desarrollo.");
                break;
            case 3:
                System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione una opción entre 1 y 3.");
        }
            
        return totalPrioridad;
    }

    public static int agregarTarea(Scanner sc, int totalPrioridad){
        System.out.print("Nombre de la tarea: ");
        String nombre= sc.nextLine();

        System.out.print("Prioridad de la tarea (1-5): ");
        int prioridad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (prioridad >= 1 && prioridad <= 5){
            totalPrioridad += prioridad;
            System.out.println("Tarea '" + nombre + "' con prioridad " + prioridad + " agregada.");
            System.out.println("Prioridad total acumulada: " + totalPrioridad);
        } else {
            System.out.println("Prioridad inválida. Debe ser un número entre 1 y 5.");
        }
        return totalPrioridad;
    }
}
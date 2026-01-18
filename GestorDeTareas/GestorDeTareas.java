import java.util.Scanner;


public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalPrioridad = 0;
        
        do {
        
            System.out.println("=== Gestor de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas (pendiente)");
            System.out.println("3. Salir");

            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

            switch (opcion) {
                case  1: 
                    System.out.print("Nombre de la tarea: ");
                    String nombre = sc.nextLine();

                    System.out.print("Prioridad (1-5): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    if (prioridad >= 1 && prioridad <= 5){
                        totalPrioridad += prioridad;
                        System.out.println("Tarea '" + nombre + "' agregada con prioridad " + prioridad + ".");
                        System.out.println("Prioridad total acumulada: " + totalPrioridad);
                    } else {
                        System.out.println("Prioridad inválida. Debe ser entre 1 y 5.");
                    }
                    break;
                case 2:
                    System.out.println("Funcionalidad de ver tareas pendiente de implementar.");
                    break;
                case 3:
                    System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción entre 1 y 3.");
            }
         }while (opcion != 3);
         
         sc.close();
    }
}
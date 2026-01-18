import java.util.Scanner;


public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrioridad = 0;
        
        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");

        System.out.println("Seleccione una opción:");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar el buffer

        // validamos la opción ingresada
        if (opcion >= 1 && opcion <=3){
            if (opcion == 1){
                System.out.println("Ingrese el nombre de la tarea:");
                String nombreTarea = sc.nextLine();

                System.out.print("Define la prioridad de la tarea (1-5): ");
                int prioridad = sc.nextInt();

            // validación basica
                boolean esValido = prioridad >= 1 && prioridad <= 5;
                System.out.println("¿La prioridad es válida? " + esValido);

            // suma de prioridades
                totalPrioridad += prioridad;
                
                System.out.println("Tarea agregada: " + nombreTarea + " prioridad: " + prioridad);
                System.out.println("Suma total de prioridades: " + totalPrioridad);
            }else if (opcion == 2){
                System.out.println("Funcionalidad de ver tareas pendiente de implementar.");
            }else{
                System.out.println("Adios");
            }
        }else{
            System.out.println("Opción inválida. Por favor seleccione una opción entre 1 y 3.");
        }

        sc.close();
    }
}
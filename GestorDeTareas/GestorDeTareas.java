import java.util.Scanner;


public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalPrioridad = 0;
        Actividad ultimaTarea = null;
        
        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            Resultado resultado = ejecutarOpcion(opcion, sc, totalPrioridad, ultimaTarea);
            totalPrioridad = resultado.totalPrioridad;
            ultimaTarea = resultado.tarea;
        }while (opcion != 3);

         sc.close();
    }

    public static void mostrarMenu(){
        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver ultima tarea agregada");
        System.out.println("3. Salir");
    }   

    public static int leerOpcion(Scanner sc){ 
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public static Resultado ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad, Actividad tarea){
        sc.nextLine(); // Limpiar el buffer
        
        switch (opcion) {   
            case  1: 
                return agregarTarea(sc, totalPrioridad);
            case 2:
                if (tarea != null) {
                    tarea.ejecutar();
                } else {
                    System.out.println("No se ha agregado ninguna tarea aún.");
                }
                break;
            case 3:
                System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione una opción entre 1 y 3.");
        }
            
        return new Resultado(totalPrioridad, tarea);
    }
    
    public static Resultado agregarTarea(Scanner sc, int totalPrioridad){
        System.out.print("Nombre de la tarea: ");
        String nombre= sc.nextLine();

        System.out.print("Prioridad de la tarea (1-5): ");
        int prioridad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (prioridad >= 1 && prioridad <= 5){
            totalPrioridad += prioridad;
            Tarea nueva = new Tarea(nombre, prioridad);
            System.out.println("Tarea agregada: " + nombre + " con prioridad " + prioridad);
            System.out.println("Total acumulado de prioridades: " + totalPrioridad);
            return new Resultado(totalPrioridad, nueva);
        } else {
            System.out.println("Prioridad inválida. Debe ser un número entre 1 y 5.");
            return new Resultado(totalPrioridad, null);
        }
    }
    public static class Resultado {
        int totalPrioridad;
        Actividad tarea;

        public Resultado(int totalPrioridad, Actividad tarea){
            this.totalPrioridad = totalPrioridad;
            this.tarea = tarea;
        }
    }
}
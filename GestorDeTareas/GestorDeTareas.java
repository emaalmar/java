import java.util.*;


public class GestorDeTareas {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Tarea> listaTareas = new ArrayList<>();
    private static final HashMap<String, Tarea> mapaTareas = new HashMap<>();
    private static int acumuladorPrioridades = 0;

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> agregarTarea();
                case 2 -> listarTareas();
                case 3 -> buscarTarea();
                case 4 -> eliminarTarea();
                case 5 -> mostrarAcumulador();
                case 6 -> System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");
                default -> System.out.println("Opción inválida. Por favor seleccione una opción entre 1 y 6.");
            }
        }while (opcion != 6);
    }


    public static void mostrarMenu(){
        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver lista de tareas");
        System.out.println("3. Buscar tarea por ID");
        System.out.println("4. Eliminar tarea por ID");
        System.out.println("5. Ver total acumulado de prioridades");
        System.out.println("6. Salir");
        System.out.println("Elija una opción: ");
    }

    private static void agregarTarea(){
        System.out.println("ID de la tarea: ");
        var id = sc.nextLine();

        if (mapaTareas.containsKey(id)){
            System.out.println("Ya existe una tarea con ese ID.");
            return;
        }

        System.out.println("Nombre de la tarea: ");
        var nombre = sc.nextLine();

        System.out.println("Prioridad de la tarea (1-5): ");
        var prioridad = Integer.parseInt(sc.nextLine());

        if (prioridad < 1 || prioridad > 5) {
            System.out.println("Prioridad inválida. Debe ser un número entre 1 y 5.");
            return;
        }

        var nueva = new Tarea(nombre, prioridad);
        listaTareas.add(nueva);
        mapaTareas.put(id, nueva);
        acumuladorPrioridades += prioridad;

        System.out.println("Tarea agregada exitosamente.");
        System.out.println("Total acumulado de prioridades: " + acumuladorPrioridades);
    }

    private static void listarTareas(){
        if (mapaTareas.isEmpty()){
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("=== Lista de Tareas ===");

        //lamda + for each
        mapaTareas.forEach((String id, Tarea tarea)-> {
            System.out.println("ID:"+ id + "-");
            tarea.ejecutar();
        });
    }

    private static void buscarTarea(){
        System.out.println("Ingrese el ID de la tarea a buscar: ");
        String id = sc.nextLine();

        Tarea t = mapaTareas.get(id);
        if (t != null){
            System.out.println("Tarea encontrada: ");
            t.ejecutar();
        } else {
            System.out.println("No se encontró ninguna tarea con ese ID.");
        }
    }

    private static void eliminarTarea(){
        System.out.println("Ingrese el ID de la tarea a eliminar: ");
        var id = sc.nextLine();

        var eliminada = mapaTareas.remove(id);
        if (eliminada != null){
            listaTareas.remove(eliminada);
            acumuladorPrioridades -= eliminada.getPrioridad();
            System.out.println("Tarea eliminada exitosamente.");
            System.out.println("Total acumulado de prioridades actualizado: " + acumuladorPrioridades);
        } else {
            System.out.println("No se encontró ninguna tarea con ese ID.");
        }
    }

    private static void mostrarAcumulador(){
        System.out.println("Total acumulado de prioridades: " + acumuladorPrioridades);
    }


    
}
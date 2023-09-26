import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido a tu aplicacion de lista de tareas. \n Por favor, selecciona una opción para continuar");
        int opcion = 0;
        do {
            System.out.println("1. Ingresar una tarea");
            System.out.println("2. Completar una tarea");
            System.out.println("3. Listar las tareas pendientes");
            System.out.println("4. Listar las tareas completas");
            System.out.println("5. Listar todas las tareas");
            System.out.println("6. Eliminar una tarea");
            System.out.println("7. Actualizar una tarea");
            System.out.println("8. Ver detalle de tarea");
            System.out.println("9. Salir");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingresa las tareas que deseas realizar");
                    String tarea = leer.next();
                    TodoList.agregarTarea(tarea);
                    break;
                case 2:

                    System.out.println("ingrese la tarea que desea marcar como completada");
                    int indTarea = leer.nextInt();
                    System.out.println("ingrese el tiempo que le tomo");
                    int time = leer.nextInt();
                    TodoList.completarTarea(indTarea, time);
                    System.out.println("la tarea se ha completado");

                    break;
                case 3:
                    String listaTareasPendientes = TodoList.listarTareasPendientes();
                    System.out.println(listaTareasPendientes);

                    break;
                case 4:
                    System.out.println("tareas completadas");
                    System.out.println("Su lista de tareas ya completadas es");
                    String listaTareasCompletas= TodoList.listaDeTareasCompletas();
                    System.out.println(listaTareasCompletas);

                    break;
                case 5:
                    System.out.println("lista de todas las tareas");
                    String listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);
                    break;
                case 6:
                    System.out.println("Eliminar tarea");
                    System.out.println("ingresa la tarea que desea eliminar");
                    int delInd = leer.nextInt();
                    boolean delete = TodoList.DeleteTarea(delInd);
                    if (delete){
                        System.out.println("eliminaste esta tarea");
                    }else {
                        System.out.println("la que seleccionaste no existe");
                    }
                    System.out.println(delete);

                    break;
                case 7:
                    System.out.println("Realizar funcionamiento de Actualizar una tarea");
                    break;
                case 8:
                    System.out.println("Detalle de Tarea");
                    System.out.println("ingresa la tarea para ver detalles");
                    int Inddetalle = leer.nextInt();
                    String Detail = TodoList.detallesTarea(Inddetalle);
                    System.out.println(Detail);
                    break;
                case 9:
                    System.out.println("gracias por usar la app");
                    break;
                default:
                    
            }

        } while (opcion != 9);
    }
}
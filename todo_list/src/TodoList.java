import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public static List<String[]> listaDeTareas = new ArrayList<>();

    public static void agregarTarea(String descripcionTarea){
        // arr[i] = valor
        String[] tarea = new String[3];
        tarea[0] = descripcionTarea;
        tarea[1] = String.valueOf(false);
        tarea[2] = String.valueOf(0);
        listaDeTareas.add(tarea);
    }

    public static String listarTareas() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++){
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            listaTareas = listaTareas + i + " - " + tarea[0] + " -tiempo -" + "("+tarea[2]+")"+ "\n";
        }
        return listaTareas;
    }

    public static String listarTareasPendientes() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++){
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if(!estaTareaCompleta){
                listaTareas = listaTareas + i + " - " + tarea[0] + " -tiempo -" + "("+tarea[2]+")"+ "\n";
            }
        }
        return listaTareas;
    }

    public static void completarTarea(int i, int min){
        String[] tarea = listaDeTareas.get(i);
        tarea[1] = String.valueOf(true);
        tarea[2] = String.valueOf(min);
    }
    public static String listaDeTareasCompletas(){
        String listaTareas= "";
        for (int i = 0; i < listaDeTareas.size(); i++){
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if(estaTareaCompleta){
                listaTareas = listaTareas + i + " - " + tarea[0] + " -tiempo -" + "("+tarea[2]+")"+ "\n";
            }
        }
        return listaTareas;
    }
    public static boolean DeleteTarea(int i){
        if (i >= 0 && i < listaDeTareas.size()){
            listaDeTareas.remove(i);
            return true;
        }else {
            return false;
        }

    }
    public static String detallesTarea(int i) {
        String detalle = "";


        String[] tarea = listaDeTareas.get(i);
        detalle = detalle + i + " - " + tarea[0] + " -tiempo -" + "(" + tarea[2] + ")" + "\n";


        return detalle;
    }
    public static void Actualizar(int i, String descripcionTarea){

    }
}

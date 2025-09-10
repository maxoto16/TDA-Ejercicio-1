import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Map<String, Object>> alumnos = new ArrayList<>();

        // Agregar 6 alumnos (id, nombre, calificación)
        Map<String, Object> a1 = new HashMap<>();
        a1.put("id", 1);
        a1.put("nombre", "Juan");
        a1.put("calificacion", 75.0);
        alumnos.add(a1);

        Map<String, Object> a2 = new HashMap<>();
        a2.put("id", 2);
        a2.put("nombre", "Ana");
        a2.put("calificacion", 58.0); // reprobado
        alumnos.add(a2);

        Map<String, Object> a3 = new HashMap<>();
        a3.put("id", 3);
        a3.put("nombre", "Luis");
        a3.put("calificacion", 90.0);
        alumnos.add(a3);

        Map<String, Object> a4 = new HashMap<>();
        a4.put("id", 4);
        a4.put("nombre", "Sofia");
        a4.put("calificacion", 100.0);
        alumnos.add(a4);

        Map<String, Object> a5 = new HashMap<>();
        a5.put("id", 5);
        a5.put("nombre", "Pedro");
        a5.put("calificacion", 45.0); // reprobado
        alumnos.add(a5);

        Map<String, Object> a6 = new HashMap<>();
        a6.put("id", 6);
        a6.put("nombre", "Maria");
        a6.put("calificacion", 80.0);
        alumnos.add(a6);

        // Mostrar alumnos y calcular promedio
        double suma = 0;
        System.out.println("Lista original de alumnos:");
        for (Map<String, Object> alumno : alumnos) {
            System.out.println("ID: " + alumno.get("id") +
                    ", Nombre: " + alumno.get("nombre") +
                    ", Calificación: " + alumno.get("calificacion"));
            suma += (double) alumno.get("calificacion");
        }
        double promedio = suma / alumnos.size();
        System.out.println("Promedio: " + promedio);

        // Eliminar la primera calificación reprobada (< 60)
        for (int i = 0; i < alumnos.size(); i++) {
            double calif = (double) alumnos.get(i).get("calificacion");
            if (calif < 60) {
                alumnos.remove(i);
                break; // solo elimina el primero que encuentre
            }
        }

        // Mostrar lista actualizada
        System.out.println("\nLista después de eliminar un reprobado:");
        for (Map<String, Object> alumno : alumnos) {
            System.out.println("ID: " + alumno.get("id") +
                    ", Nombre: " + alumno.get("nombre") +
                    ", Calificación: " + alumno.get("calificacion"));
        }
    }
}
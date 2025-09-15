package utilidades;

import static modelo.Canal.nombre;

public class Mensajes {
    public static final String SALUDO="Holi";
    public static void mostrarSaludo(){
        System.out.println(SALUDO+" "+nombre);
    }
    public static final String formatearMensaje(String mensaje){
        return "["+mensaje+"]";
    }
}

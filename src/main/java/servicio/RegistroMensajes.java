package servicio;

import modelo.Mensaje;


import modelo.Canal;
import utilidades.Mensajes;


public class RegistroMensajes {
    public static  Mensaje[] Mensaje = new Mensaje[Canal.MAX_MENSAJES];
    static int siguienteId = 0;

    public static void enviar(String remitente, String destinatario, String texto) {
        if (RegistroUsuarios.buscarPorEmail(remitente)!=null && RegistroUsuarios.buscarPorEmail(destinatario)!=null) {
        for(int i=0;i<Canal.MAX_MENSAJES;i++) {
            if(Mensaje[i]==null){
                Mensaje[i]= new Mensaje(siguienteId++,remitente,destinatario,texto);
                siguienteId++;
                return;
            }
        }
            System.out.println("No hay espacio para mensajes");
        }
        System.out.println("Destinatario o remitente inexistente");
    }

    public static Mensaje[] bandejaDeEntrada(String email) {
        int count = 0;
        // Contar cuántos mensajes hay para ese destinatario
        for (Mensaje mensaje : Mensaje) {
            if (mensaje != null && mensaje.getDestinatario().equalsIgnoreCase(email)) {
                count++;
            }
        }
        Mensaje[] bandeja = new Mensaje[count];
        int idx = 0;
        // Guardar los mensajes en el array
        for (Mensaje mensaje : Mensaje) {
            if (mensaje != null && mensaje.getDestinatario().equalsIgnoreCase(email)) {
                bandeja[idx++] = mensaje;
            }
        }
        return bandeja;
    }
    public static int getTotalMensajes() {
        return Mensaje.length;

    }
}




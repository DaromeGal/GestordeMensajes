package servicio;

import modelo.Mensaje;


import modelo.Canal;
import utilidades.Mensajes;


public class RegistroMensajes {
    public static  Mensaje[] Mensaje = new Mensaje[Canal.MAX_MENSAJES];
    static int siguienteId = 0;

    public static void enviar(String remitente, String destinatario, String texto){
        if ((RegistroUsuarios.buscarPorEmail(remitente) != null) &&
                (RegistroUsuarios.buscarPorEmail(destinatario) != null)){
            for(int i=0;i<Canal.MAX_MENSAJES;i++){
                if(Mensaje[i]==null){
                    Mensaje[i]=new Mensaje(siguienteId,remitente,destinatario,texto);
                    siguienteId++;
                    return;
                }
            }
            System.out.println("No hay espacio para mensajes");
        }
        System.out.println("Destinatario o remitente inexistente");
    }

    public static Mensaje[] bandejaDeEntrada(String email){
        int contador=0;
        for (int i=0;i<siguienteId;i++){

            if(Mensaje[i].getDestinatario().equals(email)){
                System.out.println("CONTADOR "+contador);
                contador++;
            }
        }
        if (contador==0){
            return null;
        }else{
            Mensaje [] mensajes = new Mensaje[contador];
            for(int i=0;i<siguienteId;i++){
                if(Mensaje[i].getDestinatario().equals(email)){
                    mensajes[i]=Mensaje[i];
                    System.out.println(Mensaje[i].getTexto());
                }
            }
            return mensajes;
        }

    }
    public static int getTotalMensajes()
    {
        return siguienteId-1;
    }
}




package app;

import modelo.Mensaje;
import modelo.Usuario;
import servicio.RegistroMensajes;
import servicio.RegistroUsuarios;
import utilidades.Mensajes;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Usuario u1=new Usuario("David","david123@gmail.com");
        System.out.println(u1.mostrarInfo());
        Usuario u2=new Usuario("Ana","ana123@gmail.com");
        System.out.println(u2.mostrarInfo());

        Mensajes.mostrarSaludo();
        RegistroMensajes.enviar("David","Ana","Hola Ana, ¿qué tal?");

        System.out.println(RegistroMensajes.bandejaDeEntrada("ana123@gmail.com"));
        System.out.println(RegistroMensajes.bandejaDeEntrada("david123@gmail.com"));

        System.out.println("Total usuarios: "+Usuario.contadorUsuarios);
        System.out.println("Total usuarios registrados: "+RegistroUsuarios.listar());
        System.out.println("Total mensajes enviados: "+RegistroMensajes.getTotalMensajes());
        System.out.println(Mensajes.formatearMensaje("Bye Bye"));


    }
}

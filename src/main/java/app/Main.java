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
        Usuario u3=new Usuario("Ana","ana123@gmail.com");


        RegistroUsuarios.altaUsuario(u1);
        RegistroUsuarios.altaUsuario(u2);


        RegistroMensajes.enviar("david123@gmail.com","ana123@gmail.com","Hola Ana, ¿qué tal?");

        for(int i=0;i<RegistroMensajes.getTotalMensajes()+1;i++){
            System.out.println(RegistroMensajes.Mensaje[i].getTexto());
        }



        System.out.println("Total usuarios: "+Usuario.contadorUsuarios);

        System.out.println(Mensajes.formatearMensaje("Bye Bye"));


    }
}

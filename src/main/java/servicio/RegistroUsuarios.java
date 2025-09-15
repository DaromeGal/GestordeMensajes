package servicio;

import modelo.Usuario;

import modelo.Canal;

public class RegistroUsuarios {

    public static Usuario[] usuarios = new Usuario[Canal.MAX_USUARIOS];

    public static boolean altaUsuario(Usuario u) {
        if (Usuario.contadorUsuarios >= Canal.MAX_USUARIOS) {
            return false;
        }

        for (int i = 0; i < Usuario.getContadorUsuarios(); i++) {
            if (usuarios[i] != null && usuarios[i].getEmail().equalsIgnoreCase(u.getEmail())) {
                return false;
            }
        }
        usuarios[Usuario.contadorUsuarios] = u;
        Usuario.contadorUsuarios++;
        return true;
    }

    public static Usuario buscarPorEmail(String email) {
        for (int i = 0; i < Usuario.contadorUsuarios; i++) {
            if (usuarios[i] != null && usuarios[i].getEmail().equalsIgnoreCase(email)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public static Usuario[] listar() {

        Usuario [] usuariosRegistrados= new Usuario[Usuario.getContadorUsuarios()];
        for (int i = 0; i< Usuario.getContadorUsuarios(); i++) {
            usuariosRegistrados[i] = usuarios[i];
        }
            return usuariosRegistrados;

    }

}



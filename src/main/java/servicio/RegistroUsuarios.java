package servicio;

import modelo.Usuario;

import modelo.Canal;

public class RegistroUsuarios {

    public static Usuario[] usuarios = new Usuario[Canal.MAX_USUARIOS];

    public static void altaUsuario(Usuario u){
        if (!isEmailRepited(u)){
            if(Usuario.getContadorUsuarios()<Canal.MAX_USUARIOS){
                usuarios[Usuario.getContadorUsuarios()]=u;
                Usuario.incrementarUsuarios();
            }else{
                System.out.println("No hay espacio para nuevos usuarios");
            }

        }else{
            System.out.println("El usuario ya se encuentra registrado");
        }

    }


    public static Usuario buscarPorEmail(String email) {
        for (int i = 0; i < Usuario.contadorUsuarios; i++) {
            if (usuarios[i] != null && usuarios[i].getEmail().equalsIgnoreCase(email)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public static boolean isEmailRepited(Usuario usuario){
        for(int i=0;i<Canal.MAX_USUARIOS;i++){
            if(usuarios[i]!=null){
                if(usuarios[i].getEmail().equals(usuario.getEmail())){
                    return true;
                }

            }
        }
        return false;
    }

    public static Usuario[] listar(){
        Usuario [] usuariosRegistrados=new Usuario[Usuario.getContadorUsuarios()];
        for(int i=0;i<Usuario.getContadorUsuarios(); i++){
            usuariosRegistrados[i]=usuarios[i];
        }
        return usuariosRegistrados;
    }

    public static int getTotalUsuarios()
    {
        return Usuario.getContadorUsuarios();
    }






}



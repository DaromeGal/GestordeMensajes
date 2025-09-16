package modelo;

public class Usuario {
    private String nombre;
    private String email;
    public static int contadorUsuarios=0;
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;




    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void incrementarUsuarios(){
        contadorUsuarios++;
    }

    public static int getContadorUsuarios(){
        return contadorUsuarios;
    }
    public  String mostrarInfo(){
        return "Usuario: "+this.nombre+" Email: "+this.email;
//        System.out.println("Nombre: "+this.nombre+" Email: "+this.email);
    }
}

package utilidades;

public class Validacion {
    public static final boolean esEmailValido(String email) {
        return email.contains("@");
    }
    public static final boolean noVacio(String s){
        return !s.isEmpty();
    }

    private Validacion() {

    }

}

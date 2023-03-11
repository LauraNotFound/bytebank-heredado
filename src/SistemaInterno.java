public class SistemaInterno {
    private String clave = "Alura123";
    public boolean autenticar(FuncionarioUp fUp) {
        boolean puedeIniciarSesion = fUp.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}

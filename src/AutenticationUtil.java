public class AutenticationUtil {
    private String clave;

    public boolean iniciarSesion(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {//Método donde ingreso la clave para que compruebe si es la correcta y se pueda loguear
        this.clave = clave;
    }
}

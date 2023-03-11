public interface Autenticable {
/**
 * Las interfaces son abstractas así que no es necesario colocar el abstract, tampoco en los métodos.
 */
    public void setClave(String clave);

    public boolean iniciarSesion(String clave);
}

public interface Autenticable {
/**
 * Las interfaces son abstractas así que no es necesario colocar el abstract, tampoco en los métodos ya que también son abstractos siempre.
 * En las interfaces no se crean atributos.
 */
    public void setClave(String clave);/*creando el método setClave */

    public boolean iniciarSesion(String clave);/*creando método iniciarSesion */
}

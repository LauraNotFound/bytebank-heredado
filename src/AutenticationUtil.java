public class AutenticationUtil {/*Clase pública AutenticationUtil */
    private String clave;/*creando atributo clave de tipo cadena */

    public boolean iniciarSesion(String clave) {/*método booleano iniciarSesion que pasa por parámetro la llave que definimos como boolean. */
        return this.clave == clave;/*Si esta clave es igual a la llave entonces devuelve true, de lo contrario devuelve false*/
    }

    public void setClave(String clave) {/*Método donde ingreso la clave*/
        this.clave = clave;
    }
}

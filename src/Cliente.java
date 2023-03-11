public class Cliente implements Autenticable{/*Clase pública Cliente que se implementa a suvez de la interfaz Autenticable  */
    private String nombre;/*declarando el atributo privado nombre de tipo cadena */
    private String documento;/*declarando atributo privado documento de tipo cadena */
    private String telefono;/*declarando atributo privado telefono de tipo cadena */

    private AutenticationUtil util;/*declarando  el objeto privado util*/

    public Cliente() {/*Constructor Cliente */
        this.util = new AutenticationUtil();
    }

    public void setNombre(String nombre) {/*Método para establecer el nombre */
        this.nombre = nombre;
    }

    public String getNombre() {/*Método para obtener el nombre */
        return nombre;
    }

    public void setDocumento(String documento) {/*Método para establecer Documento */
        this.documento = documento;
    }

    public String getDocumento() {/*Método para devolver documento */
        return documento;
    }
    public void setTelefono(String telefono) {/*Método para establecer telefono */
        this.telefono = telefono;
    }

    public String getTelefono() {/*Método para devolver telefono */
        return telefono;
    }

    @Override
    public void setClave(String clave) {/*llamando a método setClave que recibió de la interfaz Autenticable*/
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {/*llamando a método iniciarSesion que recibió de la interfaz Autenticable */
        return this.util.iniciarSesion(clave);
    }
}

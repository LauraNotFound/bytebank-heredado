public class Administrador extends Funcionario implements Autenticable{
/**clase Administrador que hereda de Funcionario pero que adopta a su vez las características de la interfaz Autenticable*/

    private AutenticationUtil util; /**creando el objeto util de tipo AutenticationUtil*/

    public Administrador(){/**Creando constructor Administrador, esto modifica el constructor por defecto que inicializa todos los métodos en 0 o null*/
        this.util = new AutenticationUtil();
        
    }

    @Override
    public double getBonificacion() {/*sobreescribiendo el método getBonificacion */
        return this.getsalario();
    }

    @Override
    public void setClave(String clave) {/*sobreescribiendo el método setClave */
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {/*Sobreescribiendo el método iniciarSesion */
        return this.util.iniciarSesion(clave);
    }
}

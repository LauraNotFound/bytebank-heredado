public class Gerente extends Funcionario implements Autenticable {/*Clase Gerente que es una extensión de la clase Funcionario. */

    private AutenticationUtil util;/*atributo util de tipo AutentifationUtil*/

    public Gerente(){/*Constructor */
        this.util = new AutenticationUtil();/*objeto implementado de AutenticationUtil */
    }

    public double getBonificacion() {/*Sobre escritura del método getBonificacion */
        return super.getsalario() + super.getsalario() * 0.1;
    }

    @Override
    public void setClave(String clave) {/*Método implementado de Autenticable */
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {/*Método implementado de Autenticable */
        return this.util.iniciarSesion(clave);
    }
}

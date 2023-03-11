//Clase Gerente que es una extensión de la clase Funcionario.
public class Gerente extends Funcionario implements Autenticable {

    private AutenticationUtil util;

    public Gerente(){
        this.util = new AutenticationUtil();
    }

    //Sobre escritura del método getBonificacion
    public double getBonificacion() {
        return super.getsalario() + super.getsalario() * 0.1;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}

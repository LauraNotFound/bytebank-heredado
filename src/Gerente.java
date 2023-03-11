//Clase Gerente que es una extensión de la clase Funcionario.
public class Gerente extends FuncionarioUp {

    //Sobre escritura del método getBonificacion
    public double getBonificacion() {
        return super.getsalario() + super.getsalario() * 0.1;
    }
}

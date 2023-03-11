public class Contador extends Funcionario{
    @Override
    public double getBonificacion() {/*llamando al método heredado de Funcionario, a su vez sobreescribiéndolo */
        return 200;
    }
}

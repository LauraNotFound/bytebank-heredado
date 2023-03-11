public class CuentaCorriente extends Cuenta{
    //es necesario escribir el constructor y pasarle los atributos ya que la clase madre así lo requiere
    public CuentaCorriente(int agencia, double saldo, int numero) {
        super(agencia, saldo, numero);
    }

    @Override //sobreescritura del método retirar
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }  
}

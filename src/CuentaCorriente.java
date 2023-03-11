public class CuentaCorriente extends Cuenta{/*Clase CuentaCorriente hija de Cuenta */

    public CuentaCorriente(int agencia, double saldo, int numero) {/*Constructor con los atributos de la clase madre */
        super(agencia, saldo, numero);
    }

    @Override 
    public boolean retirar(double valor) {/*Sobreescritura del método retirar */
        double comision = 0.2;
        return super.retirar(valor + comision);
    }  
}

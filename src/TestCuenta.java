public class TestCuenta {/*Clase TestCuenta, clase principal */
    public static void main(String[] args) {/*main */
        CuentaAhorros cAhorros = new CuentaAhorros(1, 200, 123);/*Creando objeto cAhorros de tipo CuentaAhorros, implementado de CuentaAhorros. Aquí damos los valores a los atributos que requiere la clase CuentaAhorros*/
        CuentaCorriente cCorriente = new CuentaCorriente(2, 300,987);/*creando objeto cCorriente de tipo CuentaCorriente, implementado de CuentaCorriente. Aquí damos los valores a los atributos que requiere la clase CuentaCorriente*/
        cCorriente.depositar(2000);/* pasándole datos al método depositar */
        cCorriente.transferir(1000, cAhorros);/*pasándole datos al método transferir */

        System.out.println(cCorriente.getSaldo());
        System.out.println(cAhorros.getSaldo());
    }
}

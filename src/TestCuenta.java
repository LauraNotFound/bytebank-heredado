public class TestCuenta {
    public static void main(String[] args) {
        CuentaAhorros cAhorros = new CuentaAhorros(1, 200, 123);
        CuentaCorriente cCorriente = new CuentaCorriente(2, 300,987);
        cCorriente.depositar(2000);
        cCorriente.transferir(1000, cAhorros);

        System.out.println(cCorriente.getSaldo());
        System.out.println(cAhorros.getSaldo());
    }
}

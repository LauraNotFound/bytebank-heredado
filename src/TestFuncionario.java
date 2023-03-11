public class TestFuncionario {/*clase TestFuncionario */
    public static void main(String[] args) {/*main */

        Funcionario diego = new Contador();/*objeto diego de tipo Funcionario, implementado de Contador */
        diego.setDocumento("444455557");/*pasándole datos al método setDocumento */
        diego.setsalario(4000);/*pasándole datos al método setsalario */
        diego.setTipo(1);/*pasándole datos al método setTipo */
        diego.setNombre("Diego");/*pasándole datos al método setNombre */

        System.out.println(diego.getDocumento());
        System.out.println(diego.getNombre());
        System.out.println(diego.getsalario());
        System.out.println(diego.getBonificacion());
        System.out.println();

        Gerente laura = new Gerente();/*creando objeto laura de tipo Gerente, implementado de Gerente */
        laura.setNombre("Laura");/*pasándole datos a setNombre */
        laura.setDocumento("444455558");/*pasándole datos al método setDocumento */
        laura.setsalario(6000);/*pasándole datos al método setsalario */
        laura.setTipo(0);/*pasándole dato al método setTipo */
        laura.setClave("Alura123");/*Este método es para ingresar la clave de este funcionario y que pueda loguearse. */
        
        System.out.println(laura.getDocumento());
        System.out.println(laura.getNombre());
        System.out.println(laura.getsalario());
        System.out.println(laura.getBonificacion());
        System.out.println();

        ControlBonificacion controlBon = new ControlBonificacion();/*creando objeto controlBon de tipo ControlBonificacion, implementado de ControlBonificacion */

        Administrador jaime = new Administrador();/*creando objeto jaime de tipo Administrador, implementado de Administrador */
        jaime.setsalario(3000);/*pasándole un valor a salario del método setsalario */
        jaime.setClave("123");/*pasándole un valor a clave del método setClave */
        System.out.println(jaime.getsalario());
        System.out.println(jaime.getBonificacion());
        System.out.println();
        
        controlBon.bonoAcumulado(diego);/*método bonoAcumulado hasta diego*/
        controlBon.bonoAcumulado(laura);/*método bonoAcumulado hasta laura */
        controlBon.bonoAcumulado(jaime);/*método bonoAcumulado hasta jaime */

        System.out.println();
        SistemaInterno sistema = new SistemaInterno();/*creando un objeto sistema del tipo SistemaInterno, implementado de SistemaInterno */
        sistema.autenticar(laura);/*método autenticar para laura */
        sistema.autenticar(jaime);/*método autenticar para jaime */
        
    }
}

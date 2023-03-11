public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario diego = new Contador();
        diego.setDocumento("444455557");
        diego.setsalario(4000);
        diego.setTipo(1);
        diego.setNombre("Diego");

        System.out.println(diego.getDocumento());
        System.out.println(diego.getNombre());
        System.out.println(diego.getsalario());
        System.out.println(diego.getBonificacion());
        System.out.println();

        Gerente laura = new Gerente();
        laura.setNombre("Laura");
        laura.setDocumento("444455558");
        laura.setsalario(6000);
        laura.setTipo(0);
        
        System.out.println(laura.getDocumento());
        System.out.println(laura.getNombre());
        System.out.println(laura.getsalario());
        System.out.println(laura.getBonificacion());
        //System.out.println(laura.iniciarSesion("Alura123"));
        System.out.println();

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        Administrador jaime = new Administrador();
        jaime.setsalario(3000);
        System.out.println(jaime.getBonificacion());
        System.out.println();
        
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(laura);
        controlBonificacion.registrarSalario(jaime);

        System.out.println();
        SistemaInterno sistema = new SistemaInterno();
        sistema.autenticar(laura);
        sistema.autenticar(jaime);
        
    }
}

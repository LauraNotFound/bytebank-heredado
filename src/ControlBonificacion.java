public class ControlBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println(this.suma);
        return this.suma;
    }

    /* Con el método registrarSalario para Funcionario es suficiente ya que las demás clases son herederas de esta, por lo tanto son aptas para este método.
    public double registrarSalario(Gerente gerente) {
        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Hasta el momento se ha dado un total de "+ this.suma + " en bonificación.");
        return this.suma;
    }*/
}

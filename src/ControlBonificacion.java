public class ControlBonificacion {/*Clase pública ControlBonificacion */
    private double suma;/*Declarando atributo double suma */

    public double bonoAcumulado(Funcionario funcionario) {/*método double registrarSalario */
        this.suma = funcionario.getBonificacion() + this.suma;/* el objeto funcionario se ha pasado por parámetro para poder usar su método getBonificacion, entonces la bonificacion que obtenga se va a sumar al atributo suma que tengo.*/
        System.out.println(this.suma);
        return this.suma;
    }
}

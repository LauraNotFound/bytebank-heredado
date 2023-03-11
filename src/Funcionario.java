public abstract class Funcionario{ /*Clase base Funcionario */
    private String nombre, documento;/*declarando atributos nombre y documento de tipo cadena */
    private double salario;/*declarando atributo salario de tipo double */
    private int tipo;/*declarando atributo entero llamado tipo */

    public Funcionario() {/*Constructor de la clase */
        
    }

    public String getDocumento() {/*método devolver documento */
        return documento;
    }

    public void setDocumento(String documento) {/* método establecer documento*/
        this.documento = documento;
    }

    public String getNombre() {/*método devolver nombre */
        return nombre;
    }

    public void setNombre(String nombre) {/*método establecer nombre */
        this.nombre = nombre;
    }

    public double getsalario() {/*método devolver salario */
        return salario;
    }

    public void setsalario(double salario) {/*método establecer salario */
        this.salario = salario;
    }

    public int getTipo() {/*método devolver tipo */
        return tipo;
    }

    public void setTipo(int tipo) {/*método establecer tipo */
        this.tipo = tipo;
    }

    public abstract double getBonificacion();/*método devolver bonificación, este es base para que cada clase hija lo implemente y pueda realizarle modificaciones */

}
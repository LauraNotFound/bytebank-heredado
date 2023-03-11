public abstract class Funcionario{ //base de todos los tipos de funcionario
    private String nombre, documento;
    private double salario;
    private int tipo;

    public Funcionario() {
        
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //método abstracto
    public abstract double getBonificacion();

}
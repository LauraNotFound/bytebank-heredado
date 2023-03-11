public abstract class FuncionarioUp extends Funcionario {
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "Alura123";
    }
}

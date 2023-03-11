public class Cuenta {
    private double saldo;//declara atributo saldo
    private int agencia;//declara atributo agencia
    private int numero;//declara atributo numero
    //Cliente titular;
    Cliente titular = new Cliente();//inicializando el objeto titular

    private static int total = 0;//static indica que el valor que tome el atributo total no va a depender de la instancia sino de la clase.

    public Cuenta(int agencia, double saldo, int numero) { //Constructor que pasa parámetros: permite cambiar el valor por defecto al ingresar un valor no válido
        if (agencia <= 0) { //Aquí se cambian los valores por defecto al ingresar un valor no permitido
            System.out.println("No se permite 0");
            this.agencia = 1; // Asigna 1 como valor por defecto.
            
        } else { // Asigna el valor ingresado
            this.agencia = agencia;
        }total++;

        if (saldo < 0) {//si saldo es mayor que 0
            System.out.println("No están permitidos este tipo de valores.");
            this.saldo = 0;
        } else {//si no se cumple
            this.saldo = saldo; //si se cumple entonces
        }

        if (numero <= 0) {//si numero es mayor a 0
            System.out.println("No están permitidos este tipo de valores.");
            this.numero = 1;
        } else {//si no se cumple entonces
            this.numero = numero;//dar valor a numero
        } 
    } // Con este constructor ya no es necesario el método establecer ya que el parámetro está siendo controlado mediante el constructor.

    void depositar (double valor){//procedimiento depositar
        //saldo = saldo + valor;
        this.saldo += valor;
    }

    public boolean retirar(double valor) {//procedimiento retirar
        if (this.saldo >= valor) {
            //this.saldo = this.saldo - valor;
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta cuenta) {//procedimiento transferir
        if (this.saldo >= valor) {//función si saldo es mayor que valor
            retirar(valor);//retira el monto de la cuenta
            cuenta.depositar(valor);//depositar valor en la cuenta pasada por parámetro
            return true;//retornar verdad
        } else {//si no se cumple
            return false;//retornar falso
        }
        
    }

    public double getSaldo() {//función obtener saldo
        return this.saldo;//retornar saldo
    }

    public int getAgencia() {//función obtener agencia
        return agencia;//retornar valor agencia
    }

    public int getNumero() {//función obtener numero
        return numero;//retornar numero
    }

    public void setTitular(Cliente titular) {//procedimiento establecer titular
        this.titular = titular;//dar valor a titular
    }

    public Cliente getTitular() {//función obtener titular
        return titular;//retornar valor titular
    }

    public static int getTotal() {/*método devolver total */
        return Cuenta.total;
    }
}

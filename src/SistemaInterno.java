public class SistemaInterno {/*Clase pública SistemaInterno */
    private String llave = "Alura123";/*atributo privado llave de tipo cadena */
    public boolean autenticar(Autenticable autenticable) {/*método booleano autenticar que recibe el objeto autenticable de tipo Autenticable para poder usar su método iniciarSesion */
        boolean login = autenticable.iniciarSesion(llave);/*puedeIniciarSesion es un objeto que va a guardar el valor que reciba del método iniciarSesion */
        if (login) {/*Si login es true */
            System.out.println("Login exitoso");
            return true;
        } else {/*Si login es false */
            System.out.println("Error en login");
            return false;
        }
    }
}

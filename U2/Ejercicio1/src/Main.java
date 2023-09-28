// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Configurador configurador = Configurador.getInstance("Configuracion");

    System.out.println("LLamo al metodo establecer y cambio configuracion a 'Cadena numero 1'");
    configurador.establecer("Cadena numero 1");
    System.out.println(configurador.obtenerConfiguracion());

    }
}
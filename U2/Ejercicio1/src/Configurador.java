public class Configurador {
    private static Configurador instance = null;
    private String cadena = "configuracion";

    private Configurador(String cadena){
        this.cadena = cadena;
        System.out.println(this.cadena);
    }

    public static Configurador getInstance(String cadena){
        if(instance == null){
            instance = new Configurador(cadena);
        }else{
            System.out.println("No se puede crear la configuración "+cadena+" porque ya existe.");
        }
        return instance;
    }


    public void establecer(String cadena){
        this.cadena = cadena;
    }

    public String obtenerConfiguracion(){

        return cadena;
    }
}

public class Usuario {
    private String paterno;
    private String materno;
    private String nombre;
    private String documento;
    private Tarjeta tarjeta;
    private tipoUsuario tipoUsuario;


    public Usuario() {
        System.out.println("---Ingreso de datos del usuario---");
    }

    public Usuario(String paterno, String materno, String nombres, String documento, int numero, float saldo, boolean estado, float precio) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombres;
        this.documento = documento;
        this.tarjeta = new Tarjeta(numero, saldo);
    }
    public void setTipoUsuario(tipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public boolean recargar(float monto){
        return tarjeta.recargar(monto);
    }
    public  boolean consumir(float monto){
        return tarjeta.consumir(monto);
    }
    public float mostrarSaldo(){
        return tarjeta.getSaldo();
    }


    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public tipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void mostrarInfo(){
        System.out.println("---Resumen del registro---");
        System.out.println("Apellido paterno: " + paterno);
        System.out.println("Apellido materno: " + materno);
        System.out.println("Nombres: " +    nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());
        System.out.println("Tipo de usuario: " + tipoUsuario.getNombre());
        System.out.println("Estado del usuario: " + tipoUsuario.isEstado());
    }
}

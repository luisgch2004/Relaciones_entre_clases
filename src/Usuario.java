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

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public Usuario(String paterno, String materno, String nombres, String documento, int numero, float saldo, boolean activo, float precio) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombres;
        this.documento = documento;
        this.tarjeta = new Tarjeta(numero, saldo, activo, precio);
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


}

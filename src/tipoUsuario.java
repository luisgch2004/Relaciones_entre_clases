public class tipoUsuario {
    private String nombre;
    private boolean estado;

    public tipoUsuario(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }
}

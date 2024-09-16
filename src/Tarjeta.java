public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;

    public Tarjeta(int numero, float saldo, boolean activo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
    }

    public Tarjeta(int numero) {
        this.numero = numero;
    }

    public Tarjeta(boolean estado, float precio){
        this.activo = activo;
        this.precio = precio;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean recargar(float monto){
        if(activo == true && monto>0){
            saldo += monto;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean consumir(float gasto){
        if(activo == true && gasto>0 && saldo>=gasto){
            saldo -= gasto;
            return true;
        }
        else {
            return false;
        }
    }
}

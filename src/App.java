import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var Usuario = new Usuario();
        System.out.print("Ingrese el Apellido paterno: ");
        String paterno = consola.nextLine();
        System.out.print("Ingrese el Apellido materno: ");
        String materno = consola.nextLine();
        System.out.print("Ingrese sus Nombres: ");
        String nombres = consola.nextLine();
        System.out.print("Ingrese el Documento: ");
        String documento = consola.nextLine();
        System.out.print("Ingrese el numero de su tarjeta: ");
        int numero = consola.nextInt();
        System.out.print("Ingrese el saldo de su tarjeta: ");
        float saldo = consola.nextInt();
        System.out.print("Ingrese el estado de su tarjeta: ");
        var estado = consola.nextBoolean();
        System.out.println("Ingrese el precio de su tarjeta: ");
        var precio = consola.nextFloat();
        System.out.print("Ingrese el tipo de usuario: ");
        consola.nextLine();
        String nombre = consola.nextLine();
        System.out.print("Ingrese el esatdo del usuario (true/false): ");
        boolean Estado = consola.nextBoolean();
        var tipo = new tipoUsuario(nombre, Estado);
        var User = new Usuario(paterno, materno, nombres, documento, numero, saldo, estado, precio);
        System.out.println("Operaciones con la tarjeta");
        System.out.println("---Recarga---");
        System.out.print("Ingrese el monto a recargar: ");
        var monto = consola.nextFloat();
        var recarga = Usuario.recargar(monto);
        if (recarga == true){
            System.out.println("Recarga exitosa, saldo actual: " + Usuario.mostrarSaldo());
        }
        else{
            System.out.println("Recarga fallida");
        }
        System.out.println("---Consumo---");
        System.out.print("Ingrese el gasto: ");
        var gasto = consola.nextFloat();
        var consumo = Usuario.consumir(gasto);
        if (consumo == true){
            System.out.println("gasto con exito, saldo actual: " + Usuario.mostrarSaldo());
        }
        else{
            System.out.println("gasto fallido");
        }
        Usuario.mostrarInfo();
    }
}

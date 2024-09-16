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
        System.out.print("Ingrese el estado de su tarjeta (true/false): ");
        var activo = consola.nextBoolean();
        System.out.println("Ingrese el precio de su tarjeta: ");
        var precio = consola.nextFloat();
        System.out.print("Ingrese el tipo de usuario: ");
        consola.nextLine();
        String nombre = consola.nextLine();
        System.out.print("Ingrese el esatdo del usuario (true/false): ");
        boolean Estado = consola.nextBoolean();
        var tipo = new tipoUsuario(nombre, Estado);
        Usuario.setTipoUsuario(tipo);
        var User = new Usuario(paterno, materno, nombres, documento, numero, saldo, activo, precio);
        System.out.println("\nInformación inicial del usuario:");
        System.out.println("---Resumen del registro---");
        System.out.println("Apellido paterno: " + User.getPaterno());
        System.out.println("Apellido materno: " + User.getMaterno());
        System.out.println("Nombres: " + User.getNombre());
        System.out.println("Documento: " + User.getDocumento());
        System.out.println("Saldo de la tarjeta: " + User.mostrarSaldo());
        System.out.println("Tipo de usuario: " + tipo.getNombre());
        System.out.println("Estado del usuario: " + tipo.isEstado());
        System.out.println("Operaciones con la tarjeta");
        System.out.println("---Recarga---");
        System.out.print("Ingrese el monto a recargar: ");
        var monto = consola.nextFloat();
        var recarga = User.recargar(monto);
        if (recarga == true){
            System.out.println("Recarga exitosa, saldo actual: " + User.mostrarSaldo());
        }
        else{
            System.out.println("Recarga fallida");
        }
        System.out.println("---Consumo---");
        System.out.print("Ingrese el gasto: ");
        var gasto = consola.nextFloat();
        var consumo = User.consumir(gasto);
        if (consumo == true){
            System.out.println("gasto con exito, saldo actual: " + User.mostrarSaldo());
        }
        else{
            System.out.println("gasto fallido");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un empleado con un saldo inicial
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del empleado: ");
        String idEmpleado = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, idEmpleado, saldoInicial);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    empleado.mostrarDetalles();
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    empleado.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    empleado.retirar(montoRetiro);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear un empleado
        Empleado empleado = new Empleado("Juan", 5000);
        empleado.mostrarInfo();

        // Crear un gerente
        Gerente gerente = new Gerente("María", 7000);
        gerente.mostrarInfo();
    }
}

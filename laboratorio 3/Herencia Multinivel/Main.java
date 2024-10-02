public class Main {
    public static void main(String[] args) {
        // Crear un coche
        Coche coche = new Coche("Toyota", 150, 4);
        coche.mostrarInfo();

        // Crear una motocicleta
        Motocicleta moto = new Motocicleta("Harley Davidson", 80, true);
        moto.mostrarInfo();
    }
}
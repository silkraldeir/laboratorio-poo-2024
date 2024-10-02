public class Circulo {
    private final double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método main para probar la clase Circulo
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo con radio 5: " + circulo.calcularArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Forma triangulo = new Triangulo(5, 10);
        Forma cuadrado = new Cuadrado(4);

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}

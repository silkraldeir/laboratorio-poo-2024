public class Utilidades {
    // Método estático para convertir Celsius a Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método main para probar la clase Utilidades
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = Utilidades.convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
}

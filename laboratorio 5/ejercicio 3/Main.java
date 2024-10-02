public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();

        Estudiante estudiante = new Estudiante("Carlos");
        estudiante.saludar();
        estudiante.saludar("María");
    }
}

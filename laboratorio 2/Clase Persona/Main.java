public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 25, "juan@example.com");

        // Mostrar información de la persona
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo Electrónico: " + persona.getCorreoElectronico());

        // Modificar los atributos de Persona
        persona.setNombre("Carlos");
        persona.setEdad(30);
        persona.setCorreoElectronico("carlos@example.com");

        // Mostrar la nueva información de la persona
        System.out.println("Nuevo nombre: " + persona.getNombre());
        System.out.println("Nueva edad: " + persona.getEdad());
        System.out.println("Nuevo correo electrónico: " + persona.getCorreoElectronico());
    }
}

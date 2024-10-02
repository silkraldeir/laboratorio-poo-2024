class Persona {
    public void saludar() {
        System.out.println("Hola!");
    }
}

class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", el estudiante.");
    }

    public void saludar(String otraPersona) {
        System.out.println("Hola " + otraPersona + ", soy " + nombre + ", el estudiante.");
    }
}

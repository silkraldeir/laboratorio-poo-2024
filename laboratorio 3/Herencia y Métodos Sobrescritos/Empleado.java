// Clase base Empleado
class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para calcular el bono (10% del salario)
    public double calcularBono() {
        return salario * 0.10;
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + calcularBono());
    }
}

// Clase derivada Gerente
class Gerente extends Empleado {

    // Constructor
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    // Sobrescritura del método para calcular el bono (15% del salario)
    @Override
    public double calcularBono() {
        return salario * 0.15;
    }
}


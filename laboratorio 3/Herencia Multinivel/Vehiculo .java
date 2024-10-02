// Clase base Vehiculo
class Vehiculo {
    protected String marca;

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca del vehículo: " + marca);
    }
}

// Clase derivada VehiculoMotorizado
class VehiculoMotorizado extends Vehiculo {
    protected int potenciaMotor;

    // Constructor
    public VehiculoMotorizado(String marca, int potenciaMotor) {
        super(marca);
        this.potenciaMotor = potenciaMotor;
    }

    // Método para mostrar información del vehículo motorizado
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Potencia del motor: " + potenciaMotor + " HP");
    }
}

// Clase derivada final Coche
class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    // Constructor
    public Coche(String marca, int potenciaMotor, int numeroPuertas) {
        super(marca, potenciaMotor);
        this.numeroPuertas = numeroPuertas;
    }

    // Método para mostrar información del coche
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

// Clase derivada final Motocicleta
class Motocicleta extends VehiculoMotorizado {
    private boolean tieneMaletero;

    // Constructor
    public Motocicleta(String marca, int potenciaMotor, boolean tieneMaletero) {
        super(marca, potenciaMotor);
        this.tieneMaletero = tieneMaletero;
    }

    // Método para mostrar información de la motocicleta
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("¿Tiene maletero? " + (tieneMaletero ? "Sí" : "No"));
    }
}



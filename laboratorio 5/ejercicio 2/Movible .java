interface Movible {
    void moverse();
}

class Coche implements Movible {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve sobre ruedas.");
    }
}

class Avion implements Movible {
    @Override
    public void moverse() {
        System.out.println("El avión se desplaza volando.");
    }
}

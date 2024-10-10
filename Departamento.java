class Departamento {
    String nombre;
    int cantidadMedicos;
    int cantidadPacientes;

    public Departamento(String nombre, int cantidadMedicos, int cantidadPacientes) {
        this.nombre = nombre;
        this.cantidadMedicos = cantidadMedicos;
        this.cantidadPacientes = cantidadPacientes;
    }

    public void mostrarCantidadMedicos() {
        System.out.println("Cantidad de médicos: " + cantidadMedicos);
    }

    public void mostrarCantidadPacientes() {
        System.out.println("Cantidad de pacientes: " + cantidadPacientes);
    }
}


class Medico {
    String nombre;
    int idFuncionario;
    boolean disponible;

    public Medico(String nombre, int idFuncionario, boolean disponible) {
        this.nombre = nombre;
        this.idFuncionario = idFuncionario;
        this.disponible = disponible;
    }

    public void atenderPaciente(Paciente paciente) {
        if (disponible) {
            System.out.println(nombre + " está atendiendo al paciente: " + paciente.nombre);
        } else {
            System.out.println(nombre + " no está disponible.");
        }
    }
}

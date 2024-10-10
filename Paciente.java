class Paciente {
    String nombre;
    int idPaciente;
    String estado;

    public Paciente(String nombre, int idPaciente, String estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.estado = estado;
    }

    public void necesitaAyuda() {
        System.out.println(nombre + " necesita ayuda: " + estado.equals("crítico"));
    }
}

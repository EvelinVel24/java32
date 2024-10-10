class Especialidad extends Medico {
    String nombreEspecialidad;

    public Especialidad(String nombre, int idFuncionario, boolean disponible, String nombreEspecialidad) {
        super(nombre, idFuncionario, disponible);
        this.nombreEspecialidad = nombreEspecialidad;
    }
}

import java.util.List;

class Hospital {
    String nombre;
    int telefono;
    int idHospital;
    List<Departamento> departamentos;

    public Hospital(String nombre, int telefono, int idHospital, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.idHospital = idHospital;
        this.departamentos = departamentos;
    }
}

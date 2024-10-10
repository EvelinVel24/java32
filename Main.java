import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear departamentos
        Departamento cardio = new Departamento("Cardiología", 10, 50);
        Departamento pediatria = new Departamento("Pediatría", 5, 30);

        // Crear hospital
        Hospital hospital = new Hospital("Hospital Central", 123456789, 1, Arrays.asList(cardio, pediatria));

        // Crear pacientes
        Paciente paciente1 = new Paciente("Juan Pérez", 1001, "estable");
        Paciente paciente2 = new Paciente("María López", 1002, "crítico");

        // Crear médicos
        Medico medico1 = new Medico("Dr. García", 5001, true);
        Medico medico2 = new Medico("Dra. Martínez", 5002, false);

        // Crear especialistas
        Especialidad especialista1 = new Especialidad("Dr. Rodríguez", 5003, true, "Cardiología");

        // Mostrar información
        cardio.mostrarCantidadMedicos();
        pediatria.mostrarCantidadPacientes();

        // Atender pacientes
        medico1.atenderPaciente(paciente1);
        medico2.atenderPaciente(paciente2);
        especialista1.atenderPaciente(paciente2);
    }
}

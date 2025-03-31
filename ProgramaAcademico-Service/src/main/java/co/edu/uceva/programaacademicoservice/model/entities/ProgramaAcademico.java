package co.edu.uceva.programaacademicoservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class ProgramaAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private boolean activo;
    private Byte cuposDisponibles;
    private String descripcion;
    private int duracion;
    private LocalDate fechaCreacion;
    private String horario;
    private Long idDocente;
    private Long idSemestre;
    private String modalidad;
    private String nombre;
    private Byte numeroCreditos;


}

package co.edu.uceva.programaacademicoservice.model.services;

import co.edu.uceva.programaacademicoservice.model.entities.ProgramaAcademico;

import java.util.List;

public interface IProgramaAcademicoService {
    ProgramaAcademico save(ProgramaAcademico programaAcademico);
    void delete(ProgramaAcademico programaAcademico);
    ProgramaAcademico findById(Long id);
    ProgramaAcademico update(ProgramaAcademico programaAcademico);
    ProgramaAcademico delete(Long id);
    List<ProgramaAcademico> findAll();
}

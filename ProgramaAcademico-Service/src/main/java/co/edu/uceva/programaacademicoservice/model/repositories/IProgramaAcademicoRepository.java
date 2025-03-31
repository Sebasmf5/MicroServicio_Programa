package co.edu.uceva.programaacademicoservice.model.repositories;

import co.edu.uceva.programaacademicoservice.model.entities.ProgramaAcademico;
import org.springframework.data.repository.CrudRepository;

public interface IProgramaAcademicoRepository  extends CrudRepository<ProgramaAcademico, Long> {
}

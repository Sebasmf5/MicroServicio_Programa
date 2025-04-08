package co.edu.uceva.programaservice.domain.repository;

import co.edu.uceva.programaservice.domain.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProgramaRepository extends JpaRepository<Programa, Long> {
}

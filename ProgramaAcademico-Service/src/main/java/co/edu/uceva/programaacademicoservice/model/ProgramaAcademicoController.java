package co.edu.uceva.programaacademicoservice.model;


import org.springframework.web.bind.annotation.*;
import co.edu.uceva.programaacademicoservice.model.entities.ProgramaAcademico;
import java.util.List;
import co.edu.uceva.programaacademicoservice.model.services.IProgramaAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/programaAcademico-service")
public class ProgramaAcademicoController {
    private IProgramaAcademicoService programaAcademicoService;

    @Autowired
    public ProgramaAcademicoController(IProgramaAcademicoService service) {
        this.programaAcademicoService = service;
    }

    @GetMapping("/programaAcademicos")
    public List<ProgramaAcademico> getProgramaAcademico() {
        return programaAcademicoService.findAll();
    }
    @GetMapping("/programaAcademicos")
    public ProgramaAcademico save(@RequestBody ProgramaAcademico programaAcademico) {
        return programaAcademicoService.save(new ProgramaAcademico());
    }
    @DeleteMapping("/programaAcademicos")
    public void delete(@RequestBody ProgramaAcademico programaAcademico) {
        programaAcademicoService.delete(programaAcademico);
    }
    @PutMapping("/programaAcademico")
    public ProgramaAcademico update(@RequestBody ProgramaAcademico programaAcademico) {
        return programaAcademicoService.update(programaAcademico);

    }
    @GetMapping("/programaAcademico/{id}")
    public ProgramaAcademico findById(@PathVariable Long id) {
        return programaAcademicoService.findById(id);
    }
}

package co.edu.uceva.programaservice.domain.exception;

public class NoExisteFacultad extends RuntimeException {
    public NoExisteFacultad(Integer id) {
        super("No existe facultad asociada al id " + id);
    }
}

package co.edu.uceva.programaservice.domain.service;

import co.edu.uceva.programaservice.domain.model.FacultadDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name="facultad-service")
public interface FacultadCliente {
    @GetMapping("/api/v1/facultad-service/facultades")
    ResponseEntity<Map<String, Object>> getFacultades();
}

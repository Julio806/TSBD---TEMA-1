package com.practica.controlador;

import com.practica.entidad.Alumno;
import com.practica.repositorio.AlumnoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoRepository repo;

    public AlumnoController(AlumnoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Alumno> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return repo.save(alumno);
    }

    @GetMapping("/{id}")
    public Alumno buscar(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}

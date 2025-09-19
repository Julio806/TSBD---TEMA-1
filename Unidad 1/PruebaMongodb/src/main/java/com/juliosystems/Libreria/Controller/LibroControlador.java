package com.juliosystems.Libreria.Controller;

import org.springframework.web.bind.annotation.*;
import com.juliosystems.Libreria.Entidad.Libro;
import com.juliosystems.Libreria.Repositorio.LibroRepositorio;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibroControlador {

    private final LibroRepositorio libroRepository;

    public LibroControlador(LibroRepositorio libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Obtener todos los libros
    @GetMapping
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    // Buscar libro por id
    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable String id) {
        return libroRepository.findById(id);
    }

    // Crear un nuevo libro
    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    // Actualizar un libro
    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable String id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroRepository.save(libro);
    }

    // Eliminar un libro
    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable String id) {
        libroRepository.deleteById(id);
    }
}

package com.juliosystems.Libreria.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.juliosystems.Libreria.Entidad.Libro;
import java.util.List;

public interface LibroRepositorio extends MongoRepository<Libro, String> {
    List<Libro> findByAutor(String autor);
    List<Libro> findByGenero(String genero);
}

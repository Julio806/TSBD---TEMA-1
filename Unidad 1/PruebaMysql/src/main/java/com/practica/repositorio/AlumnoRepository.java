package com.practica.repositorio;

import com.practica.entidad.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    }


    
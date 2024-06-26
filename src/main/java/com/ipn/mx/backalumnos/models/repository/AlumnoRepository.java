package com.ipn.mx.backalumnos.models.repository;

import com.ipn.mx.backalumnos.models.entitites.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Integer, Alumno> {
}

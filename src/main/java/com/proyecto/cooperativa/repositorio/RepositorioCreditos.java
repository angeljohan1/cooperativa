package com.proyecto.cooperativa.repositorio;

import com.proyecto.cooperativa.entidades.Creditos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCreditos extends JpaRepository<Creditos, Integer> {

}

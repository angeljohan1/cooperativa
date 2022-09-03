package com.proyecto.cooperativa.repositorio;

import com.proyecto.cooperativa.entidades.LineasDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLineasDeCredito extends JpaRepository<LineasDeCredito, Integer> {

}

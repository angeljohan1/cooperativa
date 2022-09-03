package com.proyecto.cooperativa.repositorio;

import com.proyecto.cooperativa.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Integer> {

}

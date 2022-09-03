package com.proyecto.cooperativa.servicios;

import com.proyecto.cooperativa.entidades.Cliente;
import com.proyecto.cooperativa.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioImplCliente implements ServicioCliente {

    @Autowired
    private RepositorioCliente repoCliente;

    @Override
    public List<Cliente> listarClientes() {
        return repoCliente.findAll();
    }

    @Override
    public Cliente guardarClientes(Cliente cli) {
        return repoCliente.save(cli);
    }

    @Override
    public Cliente consultarClientesPorId(Integer doc) {
        return repoCliente.findById(doc).get();
    }

    @Override
    public Cliente actualizarClientes(Cliente cli) {
        return repoCliente.save(cli);
    }

    @Override
    public void eliminarClientes(Integer doc) {
        repoCliente.deleteById(doc);
    }
}

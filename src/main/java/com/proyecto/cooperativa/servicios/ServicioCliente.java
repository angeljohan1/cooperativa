package com.proyecto.cooperativa.servicios;

import com.proyecto.cooperativa.entidades.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServicioCliente {
    public List<Cliente> listarClientes();
    public Cliente guardarClientes(Cliente cli);
    public Cliente consultarClientesPorId(Integer doc);
    public Cliente actualizarClientes(Cliente cli);
    public void eliminarClientes(Integer doc);

}

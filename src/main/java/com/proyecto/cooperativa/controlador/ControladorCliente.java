package com.proyecto.cooperativa.controlador;

import com.proyecto.cooperativa.entidades.Cliente;
import com.proyecto.cooperativa.servicios.ServicioImplCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ControladorCliente {
    @Autowired
    private ServicioImplCliente servImplCliente;

    @GetMapping
    public List<Cliente> lista() {
        return servImplCliente.listarClientes();
    }

    @PostMapping
    public Cliente insertar(@RequestBody Cliente cli) {
        return servImplCliente.guardarClientes(cli);
    }

    @PutMapping
    public Cliente actualizar (@RequestBody Cliente cli) {
        return servImplCliente.actualizarClientes(cli);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Cliente cli) {
        servImplCliente.eliminarClientes(cli.getDocumento());
    }

}

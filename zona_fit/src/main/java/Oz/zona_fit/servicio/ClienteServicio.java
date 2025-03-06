package Oz.zona_fit.servicio;

import Oz.zona_fit.Modelo.Cliente;
import Oz.zona_fit.Repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return null;
    }

    @Override
    public Cliente BuscarClienteID(Cliente cliente) {
        return null;
    }

    @Override
    public void guardarCliente(Cliente cliente) {

    }
}

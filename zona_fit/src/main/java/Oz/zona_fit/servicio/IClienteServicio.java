package Oz.zona_fit.servicio;
import Oz.zona_fit.Modelo.Cliente;

import java.util.List;

public interface IClienteServicio {

    public List<Cliente> listarCliente();

    public Cliente BuscarClienteID(Cliente cliente);

    public void guardarCliente(Cliente cliente );
}

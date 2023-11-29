package Conexiones;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ChatServer extends UnicastRemoteObject implements InterfaceServidor {

    private Map<String, InterfaceCliente> clientes;

    public ChatServer() throws RemoteException {
        clientes = new HashMap<>();
    }

    @Override
    public void RegistrarCliente(InterfaceCliente cliente, String NombreUsuario) throws RemoteException {
        // Manejar el caso donde dos clientes tienen el mismo nombre de usuario
        if (!clientes.containsKey(NombreUsuario)) {
            clientes.put(NombreUsuario, cliente);
            mensajesBroadcast(NombreUsuario + " ha entrado en el chat." + "\n");
        } else {
            // Manejar el caso de nombre de usuario duplicado
            cliente.recibirMensajes("El nombre de usuario ya está en uso. Por favor, elige otro.");
        }
    }

    @Override
    public void mensajesBroadcast(String mensaje_Grupal) throws RemoteException {
        //Tenemos que hacer una funcion para que TODOS los clientes reciban ese mensaje en consola!
        for (InterfaceCliente cliente : clientes.values()) {
            cliente.recibirMensajes(mensaje_Grupal);
        }
    }

    @Override
    public void mensajesPrivados(String emisor, String receptor, String mensaje_Privado) throws RemoteException {
        InterfaceCliente cliente = clientes.get(receptor);

        if (cliente != null) {
            // Validar si el emisor existe en la lista de clientes
            if (clientes.containsKey(emisor)) {
                cliente.recibirMensajes("[" + emisor + "]" + " te envio un mensaje privado: " + mensaje_Privado);
            } else {
                cliente.recibirMensajes("Intento de mensaje privado de un usuario no válido.");
            }
        }
    }

    @Override
    public void SalirCliente(InterfaceCliente cliente, String NombreUsuario) throws RemoteException {
        if (clientes.containsKey(NombreUsuario)) {
            clientes.remove(NombreUsuario, cliente);
            mensajesBroadcast(NombreUsuario + " ha salido del chat." + "\n");
        }
    }

    public void EstablecerConexion(String conexion_IP) {
        try {
            InterfaceServidor interfaceServidor = new ChatServer();
            LocateRegistry.createRegistry(6969);
            java.rmi.Naming.rebind("//" + conexion_IP + ":6969/InterfazServidor", interfaceServidor);
            System.out.println("Servidor de chat RMI listo!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

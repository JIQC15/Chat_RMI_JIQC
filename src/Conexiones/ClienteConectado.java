package Conexiones;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ClienteConectado extends UnicastRemoteObject implements InterfaceCliente {

    private final JTextArea txtAreaChat;
    private final String NombreUsuario;

    public ClienteConectado(String NombreUsuario, JTextArea txtAChat) throws RemoteException {
        this.NombreUsuario = NombreUsuario;
        this.txtAreaChat = txtAChat;
    }

    @Override
    public void recibirMensajes(String mensaje_Recibido) throws RemoteException {
        SwingUtilities.invokeLater(() -> {
            if (txtAreaChat != null) {
                txtAreaChat.append(mensaje_Recibido + "\n");
            } else {
                System.out.println("txtAreaChat not set for user: " + NombreUsuario);
                // Puedes mostrar un mensaje de error adicional o realizar alguna acción específica.
            }
        });
    }

    @Override
    public String getNombreUsuario() throws RemoteException {
        return NombreUsuario;
    }
}

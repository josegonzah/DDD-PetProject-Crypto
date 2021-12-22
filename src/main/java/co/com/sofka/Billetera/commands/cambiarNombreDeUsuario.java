package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class cambiarNombreDeUsuario extends Command {

    private final BilleteraID billeteraID;
    private final UsuarioID usuarioID;
    private final UserName userName;

    public cambiarNombreDeUsuario(BilleteraID billeteraID, UsuarioID usuarioID, UserName userName) {
        this.billeteraID = billeteraID;
        this.usuarioID = usuarioID;
        this.userName = userName;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }

    public UserName getUserName() {
        return userName;
    }
}

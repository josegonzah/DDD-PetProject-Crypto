package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class cambiarDescripcionUsuario extends Command {
    private final BilleteraID billeteraID;
    private final UsuarioID usuarioID;
    private final UserDescription userDescription;

    public cambiarDescripcionUsuario(BilleteraID billeteraID, UsuarioID usuarioID, UserDescription userDescription) {
        this.billeteraID = billeteraID;
        this.usuarioID = usuarioID;
        this.userDescription = userDescription;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }
}

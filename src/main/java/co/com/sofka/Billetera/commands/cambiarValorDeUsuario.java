package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class cambiarValorDeUsuario extends Command {

    private final BilleteraID billeteraID;
    private final UsuarioID usuarioID;
    private final Value value;

    public cambiarValorDeUsuario(BilleteraID billeteraID, UsuarioID usuarioID, Value value) {
        this.billeteraID = billeteraID;
        this.usuarioID = usuarioID;
        this.value = value;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }

    public Value getValue() {
        return value;
    }
}

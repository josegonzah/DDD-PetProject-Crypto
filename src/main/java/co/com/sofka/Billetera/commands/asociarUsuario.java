package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class asociarUsuario extends Command {
    private final BilleteraID billeteraID;
    private final UsuarioID usuarioID;
    private final UserName userName;
    private final UserDescription userDescription;
    private final Value value;

    public asociarUsuario(BilleteraID billeteraID, UsuarioID usuarioID, UserName userName, UserDescription userDescription, Value value) {
        this.billeteraID = billeteraID;
        this.usuarioID = usuarioID;
        this.userName = userName;
        this.userDescription = userDescription;
        this.value = value;
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

    public UserDescription getUserDescription() {
        return userDescription;
    }

    public Value getValue() {
        return value;
    }



}

package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Llaves;
import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class recargar extends Command {

    private final BilleteraID billeteraID;
    private final UsuarioID usuarioID;
    private final Llaves llaves;
    private final Value value;


    public recargar(BilleteraID billeteraID, UsuarioID usuarioID, Llaves llaves, Value value) {
        this.billeteraID = billeteraID;
        this.usuarioID = usuarioID;
        this.llaves = llaves;
        this.value = value;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }

    public Llaves getLlaves() {
        return llaves;
    }

    public Value getValue() {
        return value;
    }
}

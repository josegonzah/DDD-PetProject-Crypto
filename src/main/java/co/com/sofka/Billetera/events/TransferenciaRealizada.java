package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Llaves;
import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.Billetera.Values.Value;
import co.com.sofka.domain.generic.DomainEvent;

public class TransferenciaRealizada extends DomainEvent {
    private final UsuarioID usuarioID;
    private final Value value;
    private final Llaves llaves;

    public TransferenciaRealizada(UsuarioID usuarioID, Value value, Llaves llaves){
        super("sofka.billetera.transferenciarealizada");
        this.usuarioID = usuarioID;
        this.value = value;
        this.llaves = llaves;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }

    public Value getValue() {
        return value;
    }

    public Llaves getLlaves() {
        return llaves;
    }
}

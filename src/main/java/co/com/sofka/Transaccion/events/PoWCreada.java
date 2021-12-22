package co.com.sofka.Transaccion.events;

import co.com.sofka.Transaccion.Values.PoWId;
import co.com.sofka.domain.generic.DomainEvent;

public class PoWCreada extends DomainEvent {
    private final PoWId poWId;

    public PoWCreada(PoWId poWId){
        super("sofka.transaccion.powcreada");
        this.poWId = poWId;
    }

    public PoWId getPoWId() {
        return poWId;
    }
}

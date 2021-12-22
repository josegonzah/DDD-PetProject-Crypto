package co.com.sofka.Transaccion.commands;

import co.com.sofka.Transaccion.Values.PoWId;
import co.com.sofka.domain.generic.Command;

public class crearPoW extends Command {
    private final PoWId poWId;

    public crearPoW(PoWId poWId) {
        this.poWId = poWId;
    }

    public PoWId getPoWId() {
        return poWId;
    }
}

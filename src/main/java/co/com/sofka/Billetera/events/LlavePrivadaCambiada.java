package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.LlavePrivada;
import co.com.sofka.Billetera.Values.LlavesId;
import co.com.sofka.domain.generic.DomainEvent;

public class LlavePrivadaCambiada extends DomainEvent {
    private final LlavesId llavesId;
    private final LlavePrivada llavePrivada;

    public LlavePrivadaCambiada(LlavesId llavesId, LlavePrivada llavePrivada) {
        super("sofka.billetera.llaveprivadacambiada");
        this.llavesId = llavesId;
        this.llavePrivada = llavePrivada;
    }

    public LlavePrivada getLlavePrivada() {
        return llavePrivada;
    }
}

package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.LlavePublica;
import co.com.sofka.Billetera.Values.LlavesId;
import co.com.sofka.domain.generic.DomainEvent;

public class LlavePublicaCambiada extends DomainEvent {
    private final LlavesId llavesId;
    private final LlavePublica llavePublica;


    public LlavePublicaCambiada(LlavesId llavesId, LlavePublica llavePublica) {
        super("sofka.billetera.llavepublicacambiada");
        this.llavesId = llavesId;
        this.llavePublica = llavePublica;
    }

    public LlavePublica getLlavePublica() {
        return llavePublica;
    }
}

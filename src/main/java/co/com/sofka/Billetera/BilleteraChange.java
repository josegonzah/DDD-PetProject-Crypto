package co.com.sofka.Billetera;

import co.com.sofka.Billetera.events.BilleteraCreada;
import co.com.sofka.Billetera.events.DescripcionUsuarioCambiada;
import co.com.sofka.Billetera.events.LlavePrivadaCambiada;
import co.com.sofka.Billetera.events.LlavePublicaCambiada;
import co.com.sofka.domain.generic.EventChange;

public class BilleteraChange extends EventChange {
    public BilleteraChange(final Billetera billetera) {

        apply((BilleteraCreada event) -> {
            billetera.user = event.getUser();
            billetera.llaves = event.getLlaves();
        });

        apply((DescripcionUsuarioCambiada event) -> {
            var user = billetera.user();
            user.actualizarUserDescription(event.getUserDescription());
        });

        apply((LlavePrivadaCambiada event) -> {
            var llaves = billetera.llaves();
            llaves.actualizarLlavePrivada(event.getLlavePrivada());
        });

        apply((LlavePublicaCambiada event) -> {
            var llaves = billetera.llaves();
            llaves.actualizarLlavePublica(event.getLlavePublica());
        });


    }
}

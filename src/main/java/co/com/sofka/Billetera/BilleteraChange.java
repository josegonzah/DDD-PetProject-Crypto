package co.com.sofka.Billetera;

import co.com.sofka.Billetera.events.*;
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

//        apply((LlavePublicaCambiada event) -> {
//            var llaves = billetera.llaves();
//            llaves.actualizarLlavePublica(event.getLlavePublica());
//        });

        apply((NombreDeUsuarioCambiado event) -> {
            var user = billetera.user();
            user.actualizarUserName(event.getUserName());
        });

        apply((Recargado event) -> {
            billetera.recargar(event.getUsuarioID(), event.getValue(), event.getLlaves());
        });

        apply((TransferenciaRealizada event) -> {
            billetera.tranferir(event.getUsuarioID(), event.getValue(), event.getLlaves());
        });

        apply((UsuarioAsociado event) -> {
            billetera.asociarUsuario(event.getUsuarioID(), event.getUserName(), event.getUserDescription(), event.getValue());
        });

        apply((ValorDeUsuarioCambiado event) -> {
            var user = billetera.user();
            user.actualizarValor(event.getValue());
        });


    }
}

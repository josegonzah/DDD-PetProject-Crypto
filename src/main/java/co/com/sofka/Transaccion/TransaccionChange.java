package co.com.sofka.Transaccion;

import co.com.sofka.Transaccion.events.PoWCreada;
import co.com.sofka.Transaccion.events.TransaccionAprobada;
import co.com.sofka.Transaccion.events.TransaccionCreada;
import co.com.sofka.Transaccion.events.TransaccionDeclinada;
import co.com.sofka.domain.generic.EventChange;

public class TransaccionChange extends EventChange {
    public TransaccionChange(final Transaccion transaccion){

        apply((TransaccionCreada event) -> {
            transaccion.transaccionId = event.getTransaccionId();
            transaccion.poW = event.getPoW();
            transaccion.blockchainId = event.getBlockchainId();
            transaccion.valor = event.getValor();
            transaccion.cuenta = event.getCuenta();
            transaccion.cuentaId = event.getCuentaId();
        });

        apply((TransaccionAprobada event) -> {
            transaccion.transaccionId = event.getTransaccionId();
            transaccion.valor = event.getValor();
            transaccion.cuenta = event.getCuenta();
            transaccion.cuentaId = event.getCuentaId();
            transaccion.blockchainId = event.getBlockchainId();
        });

        apply((TransaccionDeclinada event) -> {
            transaccion.transaccionId = event.getTransaccionId();
            transaccion.valor = event.getValor();
            transaccion.cuenta = event.getCuenta();
            transaccion.cuentaId = event.getCuentaId();
            transaccion.blockchainId = event.getBlockchainId();
        });

        apply((PoWCreada event) -> {
            transaccion.poWId = event.getPoWId();
        });

    }
}

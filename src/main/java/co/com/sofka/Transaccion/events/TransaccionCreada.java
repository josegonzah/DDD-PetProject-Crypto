package co.com.sofka.Transaccion.events;

import co.com.sofka.Transaccion.Cuenta;
import co.com.sofka.Transaccion.PoW;
import co.com.sofka.Transaccion.Values.BlockchainId;
import co.com.sofka.Transaccion.Values.CuentaId;
import co.com.sofka.Transaccion.Values.TransaccionId;
import co.com.sofka.Transaccion.Values.Valor;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class TransaccionCreada extends DomainEvent {
    private final TransaccionId transaccionId;
    private final PoW poW;
    private final BlockchainId blockchainId;
    private final Valor valor;
    private final Set<Cuenta> cuenta;
    private final CuentaId cuentaId;

    public TransaccionCreada(TransaccionId transaccionId, PoW poW, BlockchainId blockchainId, Valor valor, Set<Cuenta> cuenta, CuentaId cuentaId) {
        super("sofka.transaccion.transaccioncreada");
        this.transaccionId = transaccionId;
        this.poW = poW;
        this.blockchainId = blockchainId;
        this.valor = valor;
        this.cuenta = cuenta;
        this.cuentaId = cuentaId;
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
    }

    public PoW getPoW() {
        return poW;
    }

    public BlockchainId getBlockchainId() {
        return blockchainId;
    }

    public Valor getValor() {
        return valor;
    }

    public Set<Cuenta> getCuenta() {
        return cuenta;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}

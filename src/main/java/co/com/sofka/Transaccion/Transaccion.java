package co.com.sofka.Transaccion;

import co.com.sofka.Transaccion.Values.*;
import co.com.sofka.Transaccion.events.PoWCreada;
import co.com.sofka.Transaccion.events.TransaccionAprobada;
import co.com.sofka.Transaccion.events.TransaccionCreada;
import co.com.sofka.Transaccion.events.TransaccionDeclinada;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Transaccion extends AggregateEvent<TransaccionId> {
    protected TransaccionId transaccionId;
    protected PoW poW;
    protected PoWId poWId;
    protected BlockchainId blockchainId;
    protected Valor valor;
    protected Set<Cuenta> cuenta;
    protected CuentaId cuentaId;

    public Transaccion(TransaccionId transaccionId, PoW poW, BlockchainId blockchainId, Valor valor, Set<Cuenta> cuenta, CuentaId cuentaId){
        super(transaccionId);
        appendChange(new TransaccionCreada(transaccionId, poW, blockchainId, valor, cuenta, cuentaId));
    }

    private Transaccion(TransaccionId transaccionId){
        super(transaccionId);
        subscribe(new TransaccionChange(this));
    }

    public static Transaccion from(TransaccionId transaccionId, List<DomainEvent> events){
        var transaccion = new Transaccion(transaccionId);
        events.forEach(transaccion::applyEvent);
        return transaccion;
    }

    public void aprobarTransaccion(TransaccionId transaccionId, Valor valor, Set<Cuenta> cuenta, CuentaId cuentaId, BlockchainId blockchainId){
        appendChange(new TransaccionAprobada(transaccionId, valor, cuenta, cuentaId, blockchainId)).apply();
    }

    public void declinarTransaccion(TransaccionId transaccionId, Valor valor, Set<Cuenta> cuenta, CuentaId cuentaId, BlockchainId blockchainId){
        appendChange(new TransaccionDeclinada(transaccionId, valor, cuenta, cuentaId, blockchainId)).apply();
    }

    public void crearPoW(PoWId poWId){
        appendChange(new PoWCreada(poWId));
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
    }

    public PoW getPoW() {
        return poW;
    }

    public PoWId getPoWId() {
        return poWId;
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

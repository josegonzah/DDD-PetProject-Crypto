package co.com.sofka.Transaccion.commands;

import co.com.sofka.Transaccion.Cuenta;
import co.com.sofka.Transaccion.Values.BlockchainId;
import co.com.sofka.Transaccion.Values.CuentaId;
import co.com.sofka.Transaccion.Values.TransaccionId;
import co.com.sofka.Transaccion.Values.Valor;

import java.util.Set;

public class declinarTransaccion {
    private final TransaccionId transaccionId;
    private final Valor valor;
    private final Set<Cuenta> cuenta;
    private final CuentaId cuentaId;
    private final BlockchainId blockchainId;

    public declinarTransaccion(TransaccionId transaccionId, Valor valor, Set<Cuenta> cuenta, CuentaId cuentaId, BlockchainId blockchainId) {
        this.transaccionId = transaccionId;
        this.valor = valor;
        this.cuenta = cuenta;
        this.cuentaId = cuentaId;
        this.blockchainId = blockchainId;
    }

    public TransaccionId getTransaccionId() {
        return transaccionId;
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

    public BlockchainId getBlockchainId() {
        return blockchainId;
    }
}

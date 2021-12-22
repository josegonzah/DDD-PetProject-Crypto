package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Command;

public class cambiarLlavePrivada extends Command {
    private final BilleteraID billeteraID;
    private final LlavesId llavesId;
    private final LlavePrivada llavePrivada;

    public cambiarLlavePrivada(BilleteraID billeteraID, LlavesId llavesId, LlavePrivada llavePrivada) {
        this.billeteraID = billeteraID;
        this.llavesId = llavesId;
        this.llavePrivada = llavePrivada;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public LlavesId getLlavesId() {
        return llavesId;
    }

    public LlavePrivada getLlavePrivada() {
        return llavePrivada;
    }
}

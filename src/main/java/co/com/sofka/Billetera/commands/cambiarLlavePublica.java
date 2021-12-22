package co.com.sofka.Billetera.commands;

import co.com.sofka.Billetera.Values.BilleteraID;
import co.com.sofka.Billetera.Values.LlavePublica;
import co.com.sofka.Billetera.Values.LlavesId;
import co.com.sofka.domain.generic.Command;

public class cambiarLlavePublica extends Command {
    private final BilleteraID billeteraID;
    private final LlavesId llavesId;
    private final LlavePublica llavePublica;

    public cambiarLlavePublica(BilleteraID billeteraID, LlavesId llavesId, LlavePublica llavePublica) {
        this.billeteraID = billeteraID;
        this.llavesId = llavesId;
        this.llavePublica = llavePublica;
    }

    public BilleteraID getBilleteraID() {
        return billeteraID;
    }

    public LlavesId getLlavesId() {
        return llavesId;
    }

    public LlavePublica getLlavePublica() {
        return llavePublica;
    }
}

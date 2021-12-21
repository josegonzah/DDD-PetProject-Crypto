package co.com.sofka.Billetera;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.Billetera.events.BilleteraCreada;
import co.com.sofka.domain.generic.AggregateEvent;

public class Billetera extends AggregateEvent<BilleteraID> {
    protected User user;
    protected Llaves llaves;
    protected PropietarioID propietarioID;


    public Billetera(BilleteraID billeteraID, UserName user) {
        super(billeteraID);
        appendChange(new BilleteraCreada(user)).apply();
    }

    public void asociarUsuario(UsuarioID usuarioID){
        appendChange(new UsuarioAsociado(usuarioID)).apply();
    }

    public void tranferir(UsuarioID usuarioID, Llaves llaves){
        appendChange(new transferenciaRealizada(usuarioID, llaves));
    }


}

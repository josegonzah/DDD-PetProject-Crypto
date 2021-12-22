package co.com.sofka.Billetera;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.Billetera.events.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Billetera extends AggregateEvent<BilleteraID> {
    protected User user;
    protected Llaves llaves;
    protected   BilleteraID billeteraID;

    public Billetera(BilleteraID billeteraID, User user) {
        super(billeteraID);
        appendChange(new BilleteraCreada(user, llaves)).apply();
    }

    private Billetera(BilleteraID billeteraID){
        super(billeteraID);
        subscribe(new BilleteraChange(this));
    }

    public static Billetera from(BilleteraID billeteraID, List<DomainEvent> events){
        var billetera = new Billetera(billeteraID);
        events.forEach(billetera::applyEvent);
        return billetera;
    }

    public void asociarUsuario(UsuarioID entityId, UserName userName, UserDescription userDescription, Value value){
        appendChange(new UsuarioAsociado(entityId, userName, userDescription, value)).apply();
    }

    public void tranferir(UsuarioID usuarioID, Value value, Llaves llaves){
        appendChange(new TransferenciaRealizada(usuarioID, value, llaves)).apply();
    }

    public void recargar(UsuarioID usuarioID, Value value, Llaves llaves){
        appendChange(new Recargado(usuarioID, value, llaves)).apply();
    }

    public void cambiarLlavePublica(LlavesId llavesId, LlavePublica llavePublica){
        appendChange(new LlavePublicaCambiada(llavesId, llavePublica)).apply();
    }

    public void cambiarLlavePrivada(LlavesId llavesId, LlavePrivada llavePrivada){
        appendChange(new LlavePrivadaCambiada(llavesId, llavePrivada)).apply();
    }

    public void cambiarDescripcionUsuario(UsuarioID usuarioID, UserDescription userDescription){
        appendChange(new DescripcionUsuarioCambiada(usuarioID, userDescription)).apply();
    }

    public void cambiarNombreDeUsuario(UsuarioID usuarioID, UserName userName){
        appendChange(new NombreDeUsuarioCambiado(usuarioID, userName)).apply();
    }

    public void cambiarValorDeUsuario(UsuarioID usuarioID, Value value){
        appendChange(new ValorDeUsuarioCambiado(usuarioID, value)).apply();
    }


    public User user() {
        return user;
    }

    public Llaves llaves() {
        return llaves;
    }

    public BilleteraID billeteraID() {
        return billeteraID;
    }


}

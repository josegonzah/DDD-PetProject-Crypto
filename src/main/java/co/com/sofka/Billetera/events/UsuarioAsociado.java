package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.UserDescription;
import co.com.sofka.Billetera.Values.UserName;
import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.Billetera.Values.Value;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioAsociado extends DomainEvent {
    private final UsuarioID usuarioID;
    private final UserName userName;
    private final UserDescription userDescription;
    private final Value value;

    public UsuarioAsociado(UsuarioID usuarioID, UserName userName, UserDescription userDescription, Value value){
        super("sofka.billetera.usuarioasociado");
        this.usuarioID = usuarioID;
        this.userName = userName;
        this.userDescription = userDescription;
        this.value = value;
    }

}

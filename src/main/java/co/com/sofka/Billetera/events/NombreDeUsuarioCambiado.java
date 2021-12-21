package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.UserName;
import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUsuarioCambiado extends DomainEvent {
    private final UsuarioID usuarioID;
    private final UserName userName;

    public NombreDeUsuarioCambiado(UsuarioID usuarioID, UserName userName) {
        super("sofka.billetera.nombredeusuariocambiado");
        this.usuarioID = usuarioID;
        this.userName = userName;
    }
}

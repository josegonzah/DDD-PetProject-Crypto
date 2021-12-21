package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.UserDescription;
import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionUsuarioCambiada extends DomainEvent {
    private final UsuarioID usuarioID;
    private final UserDescription userDescription;

    public DescripcionUsuarioCambiada(UsuarioID usuarioID,UserDescription userDescription) {
        super("sofka.billetera.descripcionusuariocambiada");
        this.usuarioID = usuarioID;
        this.userDescription = userDescription;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }
}

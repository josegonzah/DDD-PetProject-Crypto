package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.Billetera.Values.Value;
import co.com.sofka.domain.generic.DomainEvent;

public class ValorDeUsuarioCambiado extends DomainEvent {
    private final UsuarioID usuarioID;
    private final Value value;

    public ValorDeUsuarioCambiado(UsuarioID usuarioID, Value value) {
        super("sofka.billetera.valordeusuariocambiado");
        this.usuarioID = usuarioID;
        this.value = value;
    }
}

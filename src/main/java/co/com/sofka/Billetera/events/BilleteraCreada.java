package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.User;
import co.com.sofka.Billetera.Values.UserName;
import co.com.sofka.domain.generic.DomainEvent;

public class BilleteraCreada extends DomainEvent {
    private final User user;

    public BilleteraCreada(UserName user){
        super("sofka.billetera.billeteracreada");
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}

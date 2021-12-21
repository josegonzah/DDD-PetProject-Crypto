package co.com.sofka.Billetera.events;

import co.com.sofka.Billetera.Llaves;
import co.com.sofka.Billetera.User;
import co.com.sofka.domain.generic.DomainEvent;

public class BilleteraCreada extends DomainEvent {
    private final User user;
    private final Llaves llaves;

    public Llaves getLlaves() {
        return llaves;
    }

    public BilleteraCreada(User user, Llaves llaves){
        super("sofka.billetera.billeteracreada");
        this.user = user;
        this.llaves = llaves;
    }

    public User getUser(){
        return user;
    }

}

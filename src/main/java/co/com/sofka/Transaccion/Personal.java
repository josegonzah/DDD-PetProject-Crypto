package co.com.sofka.Transaccion;

import co.com.sofka.Transaccion.Values.PersonalID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Personal extends AggregateEvent<PersonalID> {
    public Personal(PersonalID personalID) {
        super(personalID);
    }
}

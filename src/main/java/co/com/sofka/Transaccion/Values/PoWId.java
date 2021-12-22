package co.com.sofka.Transaccion.Values;

import co.com.sofka.domain.generic.Identity;

public class PoWId extends Identity {
    public PoWId(){

    }

    private PoWId(String id){
        super(id);
    }

    public static PoWId of(String id){
        return new PoWId(id);
    }
}

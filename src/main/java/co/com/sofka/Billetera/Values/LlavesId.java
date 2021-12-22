package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.Identity;

public class LlavesId extends Identity {
    public LlavesId(){

    }

    private LlavesId(String id){
        super(id);
    }

    public static LlavesId of(String id){
        return new LlavesId(id);
    }
}

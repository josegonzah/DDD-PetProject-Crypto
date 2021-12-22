package co.com.sofka.Blockchain.values;

import co.com.sofka.Billetera.Values.BilleteraID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Identity;

public class MineroId extends Identity {

    public MineroId(){

    }

    private MineroId(String id){
        super(id);
    }

    public static MineroId of(String id){
        return new MineroId(id);
    }

}

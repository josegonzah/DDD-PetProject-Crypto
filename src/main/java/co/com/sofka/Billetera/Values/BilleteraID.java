package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.Identity;

public class BilleteraID extends Identity {

    public BilleteraID(){

    }

    private BilleteraID(String id){
        super(id);
    }

    public static BilleteraID of(String id){
        return new BilleteraID(id);
    }
}

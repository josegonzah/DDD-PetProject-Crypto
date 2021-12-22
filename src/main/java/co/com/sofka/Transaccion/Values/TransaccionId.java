package co.com.sofka.Transaccion.Values;

import co.com.sofka.Billetera.Values.UsuarioID;
import co.com.sofka.domain.generic.Identity;

public class TransaccionId extends Identity {
    public TransaccionId(){

    }

    private TransaccionId(String id){
        super(id);
    }

    public static TransaccionId of(String id){
        return new TransaccionId(id);
    }
}

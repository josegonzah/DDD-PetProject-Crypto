package co.com.sofka.Billetera;

import co.com.sofka.Billetera.Values.LlavePrivada;
import co.com.sofka.Billetera.Values.LlavePublica;
import co.com.sofka.Billetera.Values.LlavesId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Llaves extends Entity<LlavesId> {


    private LlavePublica llavePublica;
    private LlavePrivada llavePrivada;

    public Llaves(LlavesId entityId, LlavePublica llavePublica, LlavePrivada llavePrivada){
        super(entityId);
        this.llavePublica = llavePublica;
        this.llavePrivada = llavePrivada;
    }

    public void actualizarLlavePublica(LlavePublica llavePublica){
        this.llavePublica = Objects.requireNonNull(llavePublica);
    }

    public void actualizarLlavePrivada(LlavePrivada llavePrivada){
        this.llavePrivada = Objects.requireNonNull(llavePrivada);
    }

    public LlavePublica llavePublica(){
        return llavePublica;
    }

    public LlavePrivada llavePrivada(){
        return llavePrivada;
    }
}

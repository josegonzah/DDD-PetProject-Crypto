package co.com.sofka.Blockchain;

import co.com.sofka.Blockchain.events.*;
import co.com.sofka.Blockchain.values.BlockchainId;
import co.com.sofka.Blockchain.values.BloqueId;
import co.com.sofka.Blockchain.values.CheckPoint;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Blockchain extends AggregateEvent<BlockchainId> {
    protected BlockchainId blockchainId;
    protected Bloque bloque;
    protected CheckPoint checkPoint;
    protected BloqueId bloqueId;

    public Blockchain(BlockchainId blockchainId, Bloque bloque, CheckPoint checkPoint){
        super(blockchainId);
        appendChange(new BlockchainCreada(bloque, checkPoint)).apply();
    }

    private Blockchain(BlockchainId blockchainId){
        super(blockchainId);
        subscribe(new BlockchainChange(this));
    }

    public static Blockchain from(BlockchainId blockchainId, List<DomainEvent> events){
        var blockchain = new Blockchain(blockchainId);
        events.forEach(blockchain::applyEvent);
        return blockchain;
    }

    public void crearBlockChain(BlockchainId blockchainId, Bloque bloque, CheckPoint checkPoint){
        appendChange(new BlockchainCreada(blockchainId, bloque, checkPoint)).apply();
    }

    public void restaurarBlockChain(BlockchainId blockchainId, Bloque bloque, CheckPoint checkPoint){
        appendChange(new BlockchainRestaurada(blockchainId, bloque, checkPoint)).apply();
    }

    public void comprobarBlockChain(BlockchainId blockchainId, Bloque bloque, CheckPoint checkPoint){
        appendChange(new BlockchainComprobada(blockchainId, bloque, checkPoint)).apply();
    }

    public void minarBloque(BloqueId bloqueId){
        appendChange(new BloqueMinado(bloqueId)).apply();
    }

    public void comprobarBloque(BloqueId bloqueId){
        appendChange(new BloqueComprobado(bloqueId)).apply();
    }






}

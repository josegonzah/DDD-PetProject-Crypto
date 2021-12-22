package co.com.sofka.Blockchain.events;

import co.com.sofka.Blockchain.Bloque;
import co.com.sofka.Blockchain.values.BlockchainId;
import co.com.sofka.Blockchain.values.CheckPoint;

public class BlockchainComprobada {

    private final BlockchainId blockchainId;
    private final Bloque bloque;
    private final CheckPoint checkPoint;
    public BlockchainComprobada(BlockchainId blockchainId, Bloque bloque, CheckPoint checkPoint) {
        this.blockchainId = blockchainId;
        this.bloque = bloque;
        this.checkPoint = checkPoint;
    }

    public BlockchainId getBlockchainId() {
        return blockchainId;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public CheckPoint getCheckPoint() {
        return checkPoint;
    }
}

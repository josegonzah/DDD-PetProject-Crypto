package co.com.sofka.Blockchain.values;

import co.com.sofka.Billetera.Values.BilleteraID;
import co.com.sofka.domain.generic.Identity;

public class BlockchainId extends Identity {
    public BlockchainId(){

    }

    private BlockchainId(String id){
        super(id);
    }

    public static BlockchainId of(String id){
        return new BlockchainId(id);
    }
}

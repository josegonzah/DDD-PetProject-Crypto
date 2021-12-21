package co.com.sofka.Billetera;

import co.com.sofka.Billetera.Values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class User extends Entity<UsuarioID> {

    private UserName userName;
    private UserDescription userDescription;
    private Value value;

    public User(UsuarioID entityId, UserName userName, UserDescription userDescription, Value value){
        super(entityId);
        this.userName = userName;
        this.userDescription = userDescription;
        this.value = value;
    }

    public void actualizarUserName(UserName userName){
        this.userName = Objects.requireNonNull(userName);
    }

    public void actualizarUserDescription(UserDescription userDescription){
        this.userDescription = Objects.requireNonNull(userDescription);
    }

    public void actualizarValor(Value value){
        this.value = Objects.requireNonNull(value);
    }

    public UserName userName(){
        return userName;
    }

    public UserDescription userDescription(){
        return userDescription;
    }

    public Value value(){
        return value;
    }
}

package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UserName implements ValueObject {
    private final String userName;

    public UserName(String userName) {
        this.userName = Objects.requireNonNull(userName);

        if(this.userName.length() <= 50 && this.userName.length() >= 100){
            throw new IllegalArgumentException("Necesita descripcion de al menos 50 char");
        }
    }
    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName1 = (UserName) o;
        return Objects.equals(userName, userName1.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}

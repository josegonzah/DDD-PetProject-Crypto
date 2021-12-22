package co.com.sofka.Billetera.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UserDescription implements ValueObject {
    private final String userDescription;

    public UserDescription(String userDescription) {
        this.userDescription = Objects.requireNonNull(userDescription);

        if(this.userDescription.length() <= 50 && this.userDescription.length() >= 100){
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
        UserDescription that = (UserDescription) o;
        return Objects.equals(userDescription, that.userDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDescription);
    }
}
